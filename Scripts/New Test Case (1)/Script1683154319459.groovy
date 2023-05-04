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

WebUI.navigateToUrl('https://dev.butchershop.co/')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Butchershop Global  Brand Growth and T_1b290e/video_Your browser does not support the video tag'))

WebUI.click(findTestObject('Object Repository/Page_Butchershop Global  Brand Growth and T_1b290e/div_Work Work                             D_ab126c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Butchershop Global  Brand Growth and T_1b290e/div_Work Work                             D_ab126c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Butchershop Global  Brand Growth and T_1b290e/p_Discover 30 brand, strategy, content and _bedd73'), 
    'Discover +30 brand, strategy, content and digital projects')

WebUI.closeBrowser()

