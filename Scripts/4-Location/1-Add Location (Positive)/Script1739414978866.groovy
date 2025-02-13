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

WebUI.setText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/i_Organization_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/a_Locations'))

WebUI.click(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    'Kuala Lumpur')

WebUI.setText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/input_City_oxd-input oxd-input--active'), 
    'Malaysia')

WebUI.setText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/input_ZipPostal Code_oxd-input oxd-input--active'), 
    '12357')

WebUI.setText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/input_Phone_oxd-input oxd-input--active'), 
    '6123785439')

WebUI.setText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/textarea_Address_oxd-textarea oxd-textarea-_2f3678'), 
    'Simpang Durian Runtuh')

WebUI.setText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/input_StateProvince_oxd-input oxd-input--active'), 
    'Kampung Durian Runtuh')

WebUI.click(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/div_Malaysia'))

WebUI.setText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/input_Fax_oxd-input oxd-input--focus'), 
    '1100118')

WebUI.setText(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 
    'No note')

WebUI.click(findTestObject('Object Repository/4-Location/1-Add Location (Positive)/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

