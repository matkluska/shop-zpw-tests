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

WS.sendRequestAndVerify(findTestObject('Delete order', [('orderId') : "$order.id"]))

response = WS.sendRequest(findTestObject('Get order', [('orderId') : "$order.id"]))

assert response.getResponseText() == 'null' : 'Response should be null'

WS.verifyResponseStatusCode(response, 404)