import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('saucedemo.com')

WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'))

WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_password'))

WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), 'disini')

WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.waitForElementPresent(findTestObject('Page_Swag Labs/h3_Epic sadface Username and password do not match any user in this service'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/h3_Epic sadface Username and password do not match any user in this service'), 
    2)

Text = WebUI.getText(findTestObject('Page_Swag Labs/h3_Epic sadface Username and password do not match any user in this service'))

if (Text.equals('Epic sadface: Username and password do not match any user in this service')) {
    KeywordUtil.markPassed('Eror Message sama')
} else {
    KeywordUtil.markFailed('Eror Message Tidak sama')
}

WebUI.closeBrowser()

