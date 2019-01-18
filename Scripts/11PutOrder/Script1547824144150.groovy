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

responseOrder = WS.sendRequestAndVerify(findTestObject('Add order'))

def jsonSlurper = new JsonSlurper()

def order = jsonSlurper.parseText(responseOrder.getResponseText())

WS.sendRequestAndVerify(findTestObject('Put order', [('orderId') : "$order.id", ('state') : 'In realization']))

response = WS.sendRequestAndVerify(findTestObject('Get order', [('orderId') : "$order.id"]))

WS.sendRequestAndVerify(findTestObject('Delete order', [('orderId') : "$order.id"]))

def resultOrder = jsonSlurper.parseText(response.getResponseText())

assert resultOrder.email == 'admin@shop.com' : 'Email should be admin@shop.com'

assert resultOrder.firstName == 'Jan' : 'First name should be Jan'

assert resultOrder.lastName == 'Kowalski' : 'Last name should be Kowalski'

assert resultOrder.city == 'Kraków' : 'City should be Kraków'

assert resultOrder.street == 'Czarnowiejska, 12' : 'Street should be Czarnowiejska, 12'

assert resultOrder.postalCode == '32-054' : 'Postal code should be 32-054'

assert resultOrder.totalValue == 84 : 'Total value should be 84'

assert resultOrder.state == 'In realization' : 'State should be In realization'

assert resultOrder.products.size() == 1 : 'Products list size should be 1'