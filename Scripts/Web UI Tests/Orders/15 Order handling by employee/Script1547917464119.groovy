import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hidden-meadow-13855.herokuapp.com/')

WebUI.setText(findTestObject('Object Repository/Page_Shop ZPW/input_Email_email (7) (1)'), 'emp@shop.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Shop ZPW/input_Password_password (7) (1)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Shop ZPW/button_Login (5) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop ZPW/a_Administrator Panel'))

WebUI.click(findTestObject('Object Repository/Page_Shop ZPW/button_To realization (1) (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Shop ZPW/button_Shipped (1) (1)'), 1)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_Shop ZPW/button_Details (1) (1)'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_Shop ZPW/input_110.00_ng-untouched ng-p (1) (1)'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_Shop ZPW/input_10.00_ng-untouched ng-pr (1) (1)'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_Shop ZPW/button_Save changes (1) (1)'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_Shop ZPW/button_Shipped (1) (1)'), 30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_Shop ZPW/td_Shipped'), 30)

assert element != null : 'Order should be shipped'

element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_Shop ZPW/button_Logout (4) (1)'), 30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.closeBrowser()

