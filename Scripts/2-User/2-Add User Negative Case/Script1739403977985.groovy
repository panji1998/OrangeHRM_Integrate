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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/2-User/2-Add User Negative Case/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/2-User/2-Add User Negative Case/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/2-User/2-Add User Negative Case/button_Login'))

WebUI.click(findTestObject('Object Repository/2-User/2-Add User Negative Case/a_Admin'))

WebUI.click(findTestObject('Object Repository/2-User/2-Add User Negative Case/button_Add'))

WebUI.click(findTestObject('Object Repository/2-User/2-Add User Negative Case/button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/2-User/2-Add User Negative Case/span_Required'), 'Required')

WebUI.setText(findTestObject('Object Repository/2-User/2-Add User Negative Case/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    'admin 2')

WebUI.click(findTestObject('Object Repository/2-User/2-Add User Negative Case/button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/2-User/2-Add User Negative Case/span_Already exists'), 'Already exists')

WebUI.setEncryptedText(findTestObject('Object Repository/2-User/2-Add User Negative Case/input_Password_oxd-input oxd-input--focus o_671073'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/2-User/2-Add User Negative Case/input_Confirm Password_oxd-input oxd-input-_79439f'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/2-User/2-Add User Negative Case/button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementText(findTestObject('Object Repository/2-User/2-Add User Negative Case/span_Passwords do not match'), 
    'Passwords do not match')

WebUI.closeBrowser()

