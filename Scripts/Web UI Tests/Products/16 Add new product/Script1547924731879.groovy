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

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop ZPW/a_Administrator Panel'))

WebUI.click(findTestObject('Page_Shop ZPW/a_New Product'))

WebUI.setText(findTestObject('Page_Shop ZPW/input_Name_name'), 'Test')

WebUI.setText(findTestObject('Page_Shop ZPW/input_Price_price'), '5')

WebUI.setText(findTestObject('Page_Shop ZPW/input_Quantity_quantity'), '1000')

WebUI.setText(findTestObject('Page_Shop ZPW/input_Description_desc'), 'opis')

WebUI.click(findTestObject('Page_Shop ZPW/button_Add product'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop ZPW/a_Products'))

WebUI.verifyElementPresent(findTestObject('Page_Shop ZPW/td_Test'), 2)

WebUI.click(findTestObject('Page_Shop ZPW/button_Logout'))

WebUI.closeBrowser()

