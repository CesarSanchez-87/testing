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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 'CURA Healthcare Service')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 'CURA Healthcare Service')

WebUI.mouseOver(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'), 'Make Appointment')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-facebook fa-fw fa-3x'), 
    0)

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-twitter fa-fw fa-3x'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2023'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2023'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Home'))

WebUI.closeBrowser()

