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

WebUI.setText(findTestObject('Page_Shop ZPW/input_Email_email (8) (1)'), 'admin@shop.com')

WebUI.setEncryptedText(findTestObject('Page_Shop ZPW/input_Password_password (8) (1)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Shop ZPW/button_Login (6) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop ZPW/a_Administrator Panel (5)'))

WebUI.click(findTestObject('Page_Shop ZPW/a_Products (3)'))

WebUI.click(findTestObject('Page_Shop ZPW/button_22.00_btn btn-labeled b (3)'))

WebUI.setText(findTestObject('Page_Shop ZPW/input_Discount percent _discou (1) (1)'), '10')

WebUI.setText(findTestObject('Page_Shop ZPW/input_Duration in minutes_dura (1) (1)'), '1')

WebUI.click(findTestObject('Page_Shop ZPW/button_Add discount (1) (1)'))

WebUI.click(findTestObject('Page_Shop ZPW/a_ZPW 2018 (2) (1)'))

def text = WebUI.getText(findTestObject('Page_Shop ZPW/h5_19.80 -10_1'), FailureHandling.STOP_ON_FAILURE)

assert text == '$19.80 -10%' : 'Price should be $19.80 -10%'

WebUI.delay(60)

WebUI.refresh()

text = WebUI.getText(findTestObject('Page_Shop ZPW/h5_22.00'), FailureHandling.STOP_ON_FAILURE)

assert text == '$22.00' : 'Price should be $22.00'

WebUI.click(findTestObject('Page_Shop ZPW/button_Logout (5) (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

