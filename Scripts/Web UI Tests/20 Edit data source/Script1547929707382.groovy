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

WebUI.setText(findTestObject('Page_Shop ZPW/input_Email_email'), 'admin@shop.com')

WebUI.setEncryptedText(findTestObject('Page_Shop ZPW/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Shop ZPW/button_Login'))

WebUI.click(findTestObject('Page_Shop ZPW/a_Administrator Panel'))

WebUI.click(findTestObject('Page_Shop ZPW/a_Configuration'))

WebUI.check(findTestObject('Page_Shop ZPW/input_Firebase_firebase'))

WebUI.click(findTestObject('Page_Shop ZPW/button_Update configuration'))

WebUI.click(findTestObject('Page_Shop ZPW/a_Configuration'))

WebUI.check(findTestObject('Page_Shop ZPW/input_Rest_rest'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Shop ZPW/button_Update configuration'))

WebUI.click(findTestObject('Page_Shop ZPW/a_Configuration'))

WebUI.click(findTestObject('Page_Shop ZPW/button_Logout'))

WebUI.closeBrowser()

