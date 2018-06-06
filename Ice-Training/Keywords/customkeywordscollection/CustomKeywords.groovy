package customkeywordscollection

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI


public class CustomKeywords {
	
	public static AppiumDriver<?> driver = MobileDriverFactory.getDriver()
	
	@Keyword
	def takePictureOfSuccess(){
		int flag = 0
		int index = 0
		ArrayList<MobileElement> products = driver.findElementsByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/*")
		for(int i=1; i<=products.size();i++){
			MobileElement product = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]/android.widget.TextView[1]")
			String productname = product.getText()
			if(productname.contains("Chiller")){
				flag = flag + 1
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]").click()
				Mobile.delay(1)
				Mobile.verifyElementExist(findTestObject("Object Repository/CommonElements/Validate_CameraScreen"), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject("Object Repository/CommonElements/TakePhotoButton"), 0)
				Mobile.delay(5)
				Mobile.tap(findTestObject("Object Repository/CommonElements/DoneButton"), 0)
				Mobile.delay(1)
			}
			else if(productname.contains("Sachets")){
				flag = flag + 1
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]").click()
				Mobile.delay(1)
				Mobile.verifyElementExist(findTestObject("Object Repository/CommonElements/Validate_CameraScreen"), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject("Object Repository/CommonElements/TakePhotoButton"), 0)
				Mobile.delay(5)
				Mobile.tap(findTestObject("Object Repository/CommonElements/DoneButton"), 0)
				Mobile.delay(1)
			}
			products = driver.findElementsByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/*")
		}
		if(flag<2){
			while(true){
				index = driver.findElementsByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/*").size()
				for(int i=index; i>4; i--){
					MobileElement productbeforeswipe = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]/android.widget.TextView[1]")
					String productnamebeforeswipe = productbeforeswipe.getText()
					Mobile.swipe(0, 274, 0, 200)
					Mobile.delay(2)
					index = driver.findElementsByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/*").size()
					MobileElement productafterswipe = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]/android.widget.TextView[1]")
					String productnameafterswipe = productafterswipe.getText()
					if(productname.contains("Chiller")){
						driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]").click()
						Mobile.delay(1)
						Mobile.verifyElementExist(findTestObject("Object Repository/CommonElements/Validate_CameraScreen"), 0)
						Mobile.delay(1)
						Mobile.tap(findTestObject("Object Repository/CommonElements/TakePhotoButton"), 0)
						Mobile.delay(5)
						Mobile.tap(findTestObject("Object Repository/CommonElements/DoneButton"), 0)
						Mobile.delay(1)
					}
					else if(productname.contains("Sachets")){
						driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]").click()
						Mobile.delay(1)
						Mobile.verifyElementExist(findTestObject("Object Repository/CommonElements/Validate_CameraScreen"), 0)
						Mobile.delay(1)
						Mobile.tap(findTestObject("Object Repository/CommonElements/TakePhotoButton"), 0)
						Mobile.delay(5)
						Mobile.tap(findTestObject("Object Repository/CommonElements/DoneButton"), 0)
						Mobile.delay(1)
					}
				}
			}
		}
	}
}
