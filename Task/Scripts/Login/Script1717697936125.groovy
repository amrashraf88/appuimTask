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

Mobile.startApplication('/Users/amrashraf/Downloads/Tenex_1.4.6_apkcombo.com.apk', true)

Mobile.sendKeys(findTestObject('Object Repository/login/android.widget.EditText - Email address'), 'd4tksy6hj4@example.com')

Mobile.tap(findTestObject('Object Repository/login/android.widget.TextView - Next'), 0)

Mobile.sendKeys(findTestObject('Object Repository/login/android.widget.EditText - Password'), '123456789')

Mobile.tap(findTestObject('Object Repository/login/android.widget.TextView - Login'), 0)

Mobile.takeScreenshot('/var/folders/0t/3x2gzg1s1hg7812mp11jbclr0000gn/T/screenshot3529427401005624402.png')

Mobile.closeApplication()

