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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hidden-meadow-13855.herokuapp.com/')

WebUI.setText(findTestObject('Page_Shop ZPW/input_Email_email'), 'cust@shop.com')

WebUI.setEncryptedText(findTestObject('Page_Shop ZPW/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Shop ZPW/button_Login'))

WebUI.click(findTestObject('Page_Shop ZPW/button_ 99_btn btn-labeled btn'))

WebUI.click(findTestObject('Page_Shop ZPW/button_ 99_btn btn-labeled btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Shop ZPW/button_ 50_btn btn-labeled btn'))

WebUI.click(findTestObject('Page_Shop ZPW/button_Shopping Cart'))

WebUI.verifyElementPresent(findTestObject('Page_Shop ZPW/td_Bohemian Rhapsody'), 1)

WebUI.verifyElementPresent(findTestObject('Page_Shop ZPW/td_Knife'), 1)

def price1 = WebUI.getText(findTestObject('Page_Shop ZPW/td_55.00'))

assert price1 == '$55.00'

def price2 = WebUI.getText(findTestObject('Page_Shop ZPW/td_10.00'))

assert price2 == '$10.00'

def quantity1 = WebUI.getText(findTestObject('Page_Shop ZPW/td_2'))

assert quantity1 == '2'

def quantity2 = WebUI.getText(findTestObject('Page_Shop ZPW/td_1'))

assert quantity2 == '1'

def totalValue = WebUI.getText(findTestObject('Page_Shop ZPW/td_Total value 120.00'))

assert totalValue == 'Total value: $120.00'

WebUI.click(findTestObject('Page_Shop ZPW/button_Proceed order'))

WebUI.setText(findTestObject('Page_Shop ZPW/input_First Name_firstName'), 'Customer')

WebUI.setText(findTestObject('Page_Shop ZPW/input_Last Name_lastName'), 'Avg')

WebUI.setText(findTestObject('Page_Shop ZPW/input_City_city'), 'Kraków')

WebUI.setText(findTestObject('Page_Shop ZPW/input_Street_street'), 'Czarnowiejska')

WebUI.setText(findTestObject('Page_Shop ZPW/input_Postal Code_postalCode'), '32-500')

WebUI.click(findTestObject('Page_Shop ZPW/button_Submit your order'))

WebUI.verifyElementPresent(findTestObject('Page_Shop ZPW/div_Close Order successfully s'), 1)

WebUI.click(findTestObject('Page_Shop ZPW/button_Logout'))

WebUI.closeBrowser()