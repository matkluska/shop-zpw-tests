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
import groovy.json.JsonSlurper as JsonSlurper

WS.sendRequestAndVerify(findTestObject('REST API/Add product', [('productName') : 'Produkt_testowy5']))

response = WS.sendRequestAndVerify(findTestObject('REST API/Get products', [('productsNames') : []]))

def jsonSlurper = new JsonSlurper()

def products = jsonSlurper.parseText(response.getResponseText())

def p5 = products.find({ def p ->
        p.name == 'Produkt_testowy5'
    })

assert p5 != null : 'Produkt_testowy5 does not exist'

WS.sendRequestAndVerify(findTestObject('REST API/Delete product', [('productId') : "$p5.id"]))

def response = WS.sendRequest(findTestObject('REST API/Get product', [('productId') : "$p5.id"]))

assert response.getResponseText()=='null', "Response text is not null"

WS.verifyResponseStatusCode(response, 404)