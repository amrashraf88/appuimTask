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
import java.util.Random as Random
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository

// Function to generate a random email address
// Generate a random email address
String randomEmail = generateRandomEmail()

Mobile.startApplication('/Users/amrashraf/Downloads/Tenex_1.4.6_apkcombo.com.apk', true)

// Send the random email address to the email input field
Mobile.sendKeys(findTestObject('Object Repository/sugin up/android.widget.EditText - Email address'), randomEmail)

// Optionally, print the random email address for verification
println('Generated Random Email: ' + randomEmail)

Mobile.tap(findTestObject('Object Repository/sugin up/android.widget.TextView - Next'), 0)

Mobile.sendKeys(findTestObject('Object Repository/sugin up/android.widget.EditText - Name'), 'Amr ashraf')

Mobile.tap(findTestObject('Object Repository/sugin up/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/sugin up/android.widget.TextView - (971) United Arab Emirates'), 0)

Mobile.tap(findTestObject('Object Repository/sugin up/android.widget.CheckedTextView - (2) Egypt'), 0)

Mobile.tap(findTestObject('Object Repository/sugin up/android.widget.TextView - Done'), 0)

Mobile.sendKeys(findTestObject('Object Repository/sugin up/android.widget.EditText - Phone number'), '01002386433')

Mobile.sendKeys(findTestObject('Object Repository/sugin up/android.widget.EditText - Password'), '123456789')

Mobile.sendKeys(findTestObject('Object Repository/sugin up/android.widget.EditText - Car Plate Number'), '1234')

Mobile.scrollToText('Terms')

Mobile.tap(findTestObject('Object Repository/sugin up/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/sugin up/android.widget.ImageView (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/sugin up/android.widget.EditText - Enter unit number'), '01010')

Mobile.sendKeys(findTestObject('Object Repository/sugin up/android.widget.EditText'), '1168')

Mobile.tap(findTestObject('Object Repository/sugin up/android.view.ViewGroup (2)'), 0)

Mobile.takeScreenshot('/var/folders/0t/3x2gzg1s1hg7812mp11jbclr0000gn/T/screenshot8874924007233811473.png')

Mobile.closeApplication()

String generateRandomEmail() {
    String chars = 'abcdefghijklmnopqrstuvwxyz0123456789'

    Random random = new Random()

    int length = 10

    StringBuilder email = new StringBuilder()

    for (int i = 0; i < length; i++) {
        email.append(chars.charAt(random.nextInt(chars.length())))
    }
    
    email.append('@example.com')

    return email.toString()
}

