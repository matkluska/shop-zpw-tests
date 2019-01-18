import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonSlurper

WS.sendRequest(findTestObject('Add product', [('productName') : 'Produkt_testowy3']))

response = WS.sendRequest(findTestObject('Get products', [('productsNames') : []]))

WS.sendRequest(findTestObject('Delete product', [('productId') : '']))

def jsonSlurper = new JsonSlurper()
def products = jsonSlurper.parseText(response.getResponseText())

def p3 = products.find {p -> p.name == 'Produkt_testowy3'}

assert p3!=null, "Produkt_testowy3 does not exist"
WS.sendRequestAndVerify(findTestObject('Delete product', [('productId') : "${p3.id}"]))

assert p3.name == 'Produkt_testowy3', "Name property is not 'Produkt_testowy3'"
assert p3.products_quantity == 12, "products_quantity property is not 12"
assert p3.price == 123, "price property is not 123"
assert p3.description == 'opis', "description property is not 'opis"
assert p3.photo_url == 'https://cdn.shopify.com/s/files/1/0010/9215/7503/t/10/assets/cbt2/images/result-clipboard.png?1029388024731289939', "photo_url property is not 'https://cdn.shopify.com/s/files/1/0010/9215/7503/t/10/assets/cbt2/images/result-clipboard.png?1029388024731289939"
assert p3.category == 'other', "category property is not 'other"