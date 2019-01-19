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

responseOrder1 = WS.sendRequestAndVerify(findTestObject('REST API/Add order'))

responseOrder2 = WS.sendRequestAndVerify(findTestObject('REST API/Add order'))

def jsonSlurper = new JsonSlurper()
def order1 = jsonSlurper.parseText(responseOrder1.getResponseText())
def order2 = jsonSlurper.parseText(responseOrder2.getResponseText())


responseOrders = WS.sendRequestAndVerify(findTestObject('REST API/Get orders', [('ordersIds') : ["${order1.id}", "${order2.id}"]]))

WS.sendRequestAndVerify(findTestObject('REST API/Delete order', [('orderId') : "${order1.id}"]))

WS.sendRequestAndVerify(findTestObject('REST API/Delete order', [('orderId') : "${order2.id}"]))


