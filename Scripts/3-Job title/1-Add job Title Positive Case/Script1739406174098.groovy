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

WebUI.setText(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/button_Login'))

WebUI.click(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/a_Admin'))

WebUI.click(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/i_Job_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/a_Job Titles'))

WebUI.click(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/button_Add'))

WebUI.setText(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/input_Job Title_oxd-input oxd-input--focus'), 
    'QA 2')

WebUI.setText(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/textarea_Job Description_oxd-textarea oxd-t_4f7bba'), 
    'Quality Aasurance')

not_run: WebUI.uploadFile(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/div_No file chosen'), 
    'D:\\IFABULA\\Projek Toyota\\Test Case\\a\\3.png')

not_run: WebUI.click(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/div_Browse'))

WebUI.setText(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'), 
    'Only Demo')

WebUI.click(findTestObject('Object Repository/3-Job title/1-Add job Title Positive Case/button_Save'))

WebUI.closeBrowser()

