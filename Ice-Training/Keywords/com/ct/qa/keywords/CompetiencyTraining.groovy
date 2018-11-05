package com.ct.qa.keywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.ct.qa.constants.ProjectConstants
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

public class CompetiencyTraining {

	public AppiumDriver<MobileElement> driver = ProjectConstants.DRIVER

	def findCurrentVisitingShop(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totalshops = list.findElementsByXPath(".//*").size()
		for(int i=1; i<= totalshops; i++){
			MobileElement shop = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]")
			if(shop.getText().equals(ProjectConstants.CURRENTVISITING_SHOPNAME)){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				break
			}
			else{}
		}
	}
	@Keyword
	def visitShop(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totalshops = list.findElementsByXPath(".//*").size()
		for(int i=1; i<= totalshops; i++){
			MobileElement shop = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]")
			ProjectConstants.CURRENTVISITING_SHOPNAME = shop.getText()
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
			//starting steps
			Mobile.verifyElementText(findTestObject('Object Repository/CompetencyTraining/Validate_StartTrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Start Training')
			Mobile.tap(findTestObject('Object Repository/CompetencyTraining/TakeShopFasciaPicture_ImageView',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen',[('package'):ProjectConstants.packagename]), 0)
			Mobile.tap(findTestObject('CommonElements/TakePhotoButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.delay(5)
			Mobile.tap(findTestObject('CommonElements/DoneButton',[('package'):ProjectConstants.packagename]), 0)
			Mobile.verifyElementText(findTestObject('Object Repository/CompetencyTraining/Validate_StartTrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Start Training')
			Mobile.tap(findTestObject('Object Repository/CompetencyTraining/VisitShop',[('package'):ProjectConstants.packagename]), 0)
			//end starting steps
			Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/VisitTraining"), null)
			Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/SaveTraining"), null)
			Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/BackToAppMainScreen"), null)
			break
		}
	}
	@Keyword
	def visitShopsWithOverwriteScenarios(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totalshops = list.findElementsByXPath(".//*").size()
		for(int i=1; i<= totalshops; i++){
			MobileElement shop = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]")
			ProjectConstants.CURRENTVISITING_SHOPNAME = shop.getText()
			//training level overwriting
			if(i == 1){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				//starting steps
				Mobile.verifyElementText(findTestObject('Object Repository/CompetencyTraining/Validate_StartTrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Start Training')
				Mobile.tap(findTestObject('Object Repository/CompetencyTraining/TakeShopFasciaPicture_ImageView',[('package'):ProjectConstants.packagename]), 0)
				Mobile.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen',[('package'):ProjectConstants.packagename]), 0)
				Mobile.tap(findTestObject('CommonElements/TakePhotoButton',[('package'):ProjectConstants.packagename]), 0)
				Mobile.delay(5)
				Mobile.tap(findTestObject('CommonElements/DoneButton',[('package'):ProjectConstants.packagename]), 0)
				Mobile.verifyElementText(findTestObject('Object Repository/CompetencyTraining/Validate_StartTrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Start Training')
				Mobile.tap(findTestObject('Object Repository/CompetencyTraining/VisitShop',[('package'):ProjectConstants.packagename]), 0)
				//end starting steps
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/VisitTraining"), null)
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/OverwriteTraining"), null)
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/SaveTraining"), null)
			}
			//shop level overwriting
			else if(i == 2){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				//starting steps
				Mobile.verifyElementText(findTestObject('Object Repository/CompetencyTraining/Validate_StartTrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Start Training')
				Mobile.tap(findTestObject('Object Repository/CompetencyTraining/TakeShopFasciaPicture_ImageView',[('package'):ProjectConstants.packagename]), 0)
				Mobile.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen',[('package'):ProjectConstants.packagename]), 0)
				Mobile.tap(findTestObject('CommonElements/TakePhotoButton',[('package'):ProjectConstants.packagename]), 0)
				Mobile.delay(5)
				Mobile.tap(findTestObject('CommonElements/DoneButton',[('package'):ProjectConstants.packagename]), 0)
				Mobile.verifyElementText(findTestObject('Object Repository/CompetencyTraining/Validate_StartTrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Start Training')
				Mobile.tap(findTestObject('Object Repository/CompetencyTraining/VisitShop',[('package'):ProjectConstants.packagename]), 0)
				//end starting steps
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/VisitTraining"), null)
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/SaveTraining"), null)
				findCurrentVisitingShop()
				//starting steps
				Mobile.verifyElementText(findTestObject('Object Repository/CompetencyTraining/Validate_StartTrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Start Training')
				Mobile.tap(findTestObject('CompetencyTraining/TakeShopFasciaPicture_ImageView',[('package'):ProjectConstants.packagename]), 0)
				Mobile.verifyElementExist(findTestObject('CommonElements/Validate_CameraScreen',[('package'):ProjectConstants.packagename]), 0)
				Mobile.tap(findTestObject('CommonElements/TakePhotoButton',[('package'):ProjectConstants.packagename]), 0)
				Mobile.delay(5)
				Mobile.tap(findTestObject('CommonElements/DoneButton',[('package'):ProjectConstants.packagename]), 0)
				Mobile.verifyElementText(findTestObject('Object Repository/CompetencyTraining/Validate_StartTrainingStepsScreen',[('package'):ProjectConstants.packagename]), 'Start Training')
				Mobile.tap(findTestObject('CompetencyTraining/VisitShop',[('package'):ProjectConstants.packagename]), 0)
				//end starting steps
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/OverwriteTraining"), null)
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/SaveTraining"), null)
			}
			else{
				break
			}
		}
		Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/BackToAppMainScreen"), null)
	}
	@Keyword
	def visitTrainingSteps(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totaltrainingsteps = list.findElementsByClassName("android.widget.TextView").size()
		for(int i=1; i<= totaltrainingsteps; i++){
			MobileElement step = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]")
			String steptext = step.getText()
			if(steptext.equalsIgnoreCase("Rating on ICE Steps")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/VisitRatingOnIceSteps"), null)
			}
			else if(steptext.equalsIgnoreCase("Field Sales Coaching")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/VisitFieldSalesCoaching"), null)
			}
			else if(steptext.equalsIgnoreCase("Capturing Picture of Success")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/VisitCapturingPictureOfSuccess"), null)
			}
			else if(steptext.equalsIgnoreCase("Market Intelligence (Optional)")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/VisitMarketIntelligence"), null)
			}
			else if(steptext.equalsIgnoreCase("Remarks (Optional)")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/VisitRemarks"), null)
			}
			else{
			}
		}
	}
	@Keyword
	def overwriteTrainingSteps(){
		MobileElement list = driver.findElementByClassName("android.widget.ListView")
		int totaltrainingsteps = list.findElementsByClassName("android.widget.TextView").size()
		for(int i=1; i<= totaltrainingsteps; i++){
			MobileElement step = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]")
			String steptext = step.getText()
			if(steptext.equalsIgnoreCase("Rating on ICE Steps")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/OverwriteRatingOnIceSteps"), null)
			}
			else if(steptext.equalsIgnoreCase("Field Sales Coaching")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/OverwriteFieldSalesCoaching"), null)
			}
			else if(steptext.equalsIgnoreCase("Capturing Picture of Success")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/OverwriteCapturingPictureOfSuccess"), null)
			}
			else if(steptext.equalsIgnoreCase("Market Intelligence (Optional)")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/OverwriteMarketIntelligence"), null)
			}
			else if(steptext.equalsIgnoreCase("Remarks (Optional)")){
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.TextView["+i+"]").click()
				Mobile.callTestCase(findTestCase("Test Cases/CompetencyTraining/OverwriteRemarks"), null)
			}
			else{
			}
		}
	}
	@Keyword
	def visitRatingOnIceSteps(){
		MobileElement list = driver.findElementByClassName("android.widget.ExpandableListView")
		int remarks = list.findElementsByClassName("android.widget.LinearLayout").size()
		for(int i=1; i<= remarks; i++){
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout["+i+"]").click()
			Mobile.delay(1)
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ExpandableListView[1]/android.widget.RelativeLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]").click()
			Mobile.delay(1)
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout["+i+"]").click()
		}
	}
	@Keyword
	def overwriteRatingOnIceSteps(){
		MobileElement list = driver.findElementByClassName("android.widget.ExpandableListView")
		int remarks = list.findElementsByClassName("android.widget.LinearLayout").size()
		for(int i=1; i<= remarks; i++){
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout["+i+"]").click()
			Mobile.delay(1)
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ExpandableListView[1]/android.widget.RelativeLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[2]").click()
			Mobile.delay(1)
			driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout["+i+"]").click()
		}
	}
	@Keyword
	def takePictureOfSuccess(){
		int flag = 0
		int index = 0
		MobileElement list = driver.findElementByClassName("android.widget.GridView")
		int pictureviews = list.findElementsByClassName("android.widget.RelativeLayout").size()
		for(int i=1; i<= pictureviews; i++){
			MobileElement product = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]/android.widget.TextView[1]")
			String productname = product.getText()
			if(productname.equalsIgnoreCase("Chiller")){
				flag = flag + 1
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]").click()
				Mobile.verifyElementExist(findTestObject("Object Repository/CommonElements/Validate_CameraScreen",[('package'):ProjectConstants.packagename]), 0)
				Mobile.tap(findTestObject("Object Repository/CommonElements/TakePhotoButton",[('package'):ProjectConstants.packagename]), 0)
				Mobile.delay(5)
				Mobile.tap(findTestObject("Object Repository/CommonElements/DoneButton",[('package'):ProjectConstants.packagename]), 0)
			}
			else if(productname.equalsIgnoreCase("Sachets")){
				flag = flag + 1
				driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]").click()
				Mobile.verifyElementExist(findTestObject("Object Repository/CommonElements/Validate_CameraScreen",[('package'):ProjectConstants.packagename]), 0)
				Mobile.tap(findTestObject("Object Repository/CommonElements/TakePhotoButton",[('package'):ProjectConstants.packagename]), 0)
				Mobile.delay(5)
				Mobile.tap(findTestObject("Object Repository/CommonElements/DoneButton",[('package'):ProjectConstants.packagename]), 0)
			}
		}
		if(flag<2){
			while(true){
				index = list.findElementsByClassName("android.widget.RelativeLayout").size()
				MobileElement item1beforeswipe = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+index+"]/android.widget.TextView[1]")
				String item1namebeforeswipe = item1beforeswipe.getText()
				MobileElement item2beforeswipe = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+(index-1)+"]/android.widget.TextView[1]")
				String item2namebeforeswipe = item2beforeswipe.getText()
				Mobile.swipe(0, 480, 0, 200)
				index = list.findElementsByClassName("android.widget.RelativeLayout").size()
				MobileElement item1afterswipe = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+index+"]/android.widget.TextView[1]")
				String item1nameafterswipe = item1afterswipe.getText()
				MobileElement item2afterswipe = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+(index-1)+"]/android.widget.TextView[1]")
				String item2nameafterswipe = item2afterswipe.getText()
				if(item1namebeforeswipe.equals(item1nameafterswipe) && item2namebeforeswipe.equals(item2nameafterswipe)){
					break
				}
				else{
					for(int i=index; i> index-2; i--){
						MobileElement product = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]/android.widget.TextView[1]")
						String producttext = product.getText()
						if(producttext.equalsIgnoreCase("Chiller") || producttext.equalsIgnoreCase("Sachets")){
							driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout["+i+"]").click()
							Mobile.verifyElementExist(findTestObject("Object Repository/CommonElements/Validate_CameraScreen",[('package'):ProjectConstants.packagename]), 0)
							Mobile.tap(findTestObject("Object Repository/CommonElements/TakePhotoButton",[('package'):ProjectConstants.packagename]), 0)
							Mobile.delay(5)
							Mobile.tap(findTestObject("Object Repository/CommonElements/DoneButton",[('package'):ProjectConstants.packagename]), 0)
						}
						else{}
					}
				}
			}
		}
	}
}
