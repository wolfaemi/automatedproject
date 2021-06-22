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

WebUI.navigateToUrl('https://www.disneyplus.com/en-ca/welcome?gclid=944a36ab7dc31fd53fe6567a5bfb0526&gclsrc=3p.ds&&cid=DSS-Search-Bing-71700000081371522&s_kwcid=AL!8468!10!79371154052926!disney%20plus&msclkid=944a36ab7dc31fd53fe6567a5bfb0526')

WebUI.click(findTestObject('Object Repository/Page_Disney  The greatest stories, all in o_0a38ee/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Page_Login  Disney/input_email_email'), 'aemiresinghgill222@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login  Disney/button_CONTINUE'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Disney/input_password_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Page_Login  Disney/button_LOG IN'))

WebUI.closeBrowser()

