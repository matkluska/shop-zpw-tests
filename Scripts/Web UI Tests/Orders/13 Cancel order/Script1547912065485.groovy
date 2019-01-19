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

WebUI.setText(findTestObject('Object Repository/Page_Shop ZPW/input_Email_email (6) (1)'), 'cust@shop.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Shop ZPW/input_Password_password (6) (1)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Shop ZPW/button_Login (4) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Shop ZPW/button_ 91_btn btn-labeled btn (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Shop ZPW/button_Shopping Cart (1) (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shop ZPW/td_Bohemian Rhapsody (2)'), 1)

WebUI.click(findTestObject('Object Repository/Page_Shop ZPW/button_55.00_btn btn-labeled b (1)'))

def totalValue = WebUI.getText(findTestObject('Object Repository/Page_Shop ZPW/td_Total value 0.00'))

assert totalValue == 'Total value: $0.00'

WebUI.click(findTestObject('Page_Shop ZPW/button_Back to shopping'))

WebUI.click(findTestObject('Object Repository/Page_Shop ZPW/button_Logout (3) (1)'))

WebUI.closeBrowser()

