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

WebUI.setText(findTestObject('Page_Shop ZPW/input_Email_email (9)'), 'admin@shop.com')

WebUI.setEncryptedText(findTestObject('Page_Shop ZPW/input_Password_password (9)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Shop ZPW/button_Login (7)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop ZPW/a_Administrator Panel'))

WebUI.click(findTestObject('Page_Shop ZPW/a_Products'))

WebUI.click(findTestObject('Page_Shop ZPW/i_55.00_fa fa-edit'))

WebUI.setText(findTestObject('Page_Shop ZPW/input_Description_desc (1)'), 'Design patterns book edited')

WebUI.click(findTestObject('Page_Shop ZPW/button_Edit product'))

WebUI.click(findTestObject('Page_Shop ZPW/a_ZPW 2018 (3)'))

def text = WebUI.getText(findTestObject('Page_Shop ZPW/p_Design patterns book edited (1)'))

assert text == 'Design patterns book edited' : 'Description after edit should be \'Design patterns book edited\''

WebUI.click(findTestObject('Page_Shop ZPW/button_Logout (6)'))

WebUI.closeBrowser()

