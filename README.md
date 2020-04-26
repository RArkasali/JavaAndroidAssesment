

This application demonstrates the automation capability on to create a new meeting using aCalendar.apk on an android device. To execute automation project on real device, the execution requires Appium tool to be run in backend to interact with devices. Initiate the DeviceTestRunner.java as Junit Tests from eclipse/ preferred IDE.

#Prerequisites:

Update the properties file with values before executing the automation scripts. Below are he mandatory properties to be defined

1.test.execution.environment -> Device type configuration - realdevice/emulator

2.Android Device capabilities

android.realdevice.platform_name = android
android.realdevice.device_name = samsung
android.realdevice.version = 6.0.1

#Setup:

Install the apk from {PROJECT_DIR}\src\test\resources\apk\aCalendar.apk on to the phone. For the first time, aCalendar will ask you to accept this application can access your contact and your calendar. So if you want to continue please accept these request, automation test will accept as default by script. If the app is already on the phone then kindly update the appPackage and appActivity in src/test/resources/calendar.properties file.

#About Project Structure:

We have setof classes in this page object model framework. We have defined the package structure as com.amazon.*

Base package, hold the BasePOM class, which plays a key role in distributing the objects. pageObjects package, where we will initialise our APP access elements. pages package, will handle actions on particular page utils package will handle device actions like click, scroll, swipe etc.,. test runner package class in the JUnit class, where the execution starts. feature folder will be placed in resources folder and it have the all required features

#Running the UI tests:

Also pass the test contact(saved in phone) against which you want the script to schedule the meeting, in the Verify_Create_New_Metting_in_aCalendar_App.feature file, for people under examples section as below:

|people| |XXXXX|

The Base class to execute the entire automation suite is: DeviceTestRunner.java. Once, the maven build is success then we need to go DeviceTestRunner class and select run as Junit Tests.

#API Automation

Please create new account on http://openweathermap.org

Get api from email

Open forecast.properties and update "user.api.key data"

Run script Verify_Weather_Today.feature or if you execute the base class DeviceTestRunner.java, the test should run.

There will be default cucumber reports will be generated for both UI and API tests.
