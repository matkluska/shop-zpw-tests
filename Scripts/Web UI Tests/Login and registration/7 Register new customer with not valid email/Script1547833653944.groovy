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

WebUI.click(findTestObject('Object Repository/Page_Shop ZPW/a_Create One (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Shop ZPW/input_Email_email (3)'), 'not_valid')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Shop ZPW/input_Password_password (3)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Shop ZPW/input_Confirm Password_confirm (1)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.verifyElementPresent(findTestObject('Page_Shop ZPW/div_Email must be a valid emai'), 100)

WebUI.verifyElementAttributeValue(findTestObject('Page_Shop ZPW/button_Register'), 'disabled', 'true', 100)

WebUI.closeBrowser()

