3:00 to 3:30 ---> Set
3:30 to 4:00 ---> WindowHandling
4:00 to 4:10 ---> Break
4:10 to 5:10 ---> Alerts
5:10 to 5:45 ---> Frames
5:30 to 6:00 ---> Breakout
6:00 to 6:15 ---> Recap
Set:
1)set is an unoredered collection,because order in a set depends on implementation classes.
2)it does not alows the duplicate values.
3)cannot have get().

List name={2,5,6,7,5,3}//index no 4:5
 set name={2,5,6,7,3}//index no4:3

 Implementation classes of Set:
 1)HashSet:maintains the random order
 2)Linked HashSet:based on the insertion order
 3)TreeSet:sorted order(ascii )

 Window Handling:
What is a Window Handle?
A Window Handle is a unique identifier, a string, that Selenium WebDriver assigns to each open window or tab. It acts much like a unique address for a house, allowing WebDriver to navigate to and control a specific window.
Why Window Handles are Important
Web applications can open multiple windows or tabs.
To perform actions on elements within these windows, Selenium needs to know which window to interact with. - - Window handles enable this by providing a unique ID for each window.

How to Handle Windows
To handle windows, WebDriver provides two methods:
getWindowHandle(): Retrieves the ID of the current window.
getWindowHandles(): Retrieves a set of all open windows' IDs.
To switch to a different window, the syntax is driver.switchTo().window(windowHandle); where windowHandle is the unique identifier of the target window.

Handling Multiple Windows
Retrieve the set of window handles using driver.getWindowHandles().
Convert the set to a list to handle windows in a sequential manner.
Use the driver.switchTo().window(windowHandle) to switch control to the desired window.

After operations are completed, windows can be closed using driver.close(), and control can be switched back to the main window.
NoSuchWindowException:
NoSuchWindowException is an exception which signifies that the action you are trying to perform cannot be completed because the window or tab you are referencing no longer exists or is inaccessible. This can happen for various reasons:
 What is an Alert in Selenium?
An Alert in Selenium WebDriver is a small message box that appears on the screen to give the user information or ask for permission to perform an operation.
It's typically a JavaScript-based window that can show warnings, ask for confirmations, or prompt for information.
Why are Alerts Used?
Alerts are used in web applications to:

Notify users: Provide important information or warnings.
Get confirmations: Confirm user actions before proceeding.
Collect input: Gather information or feedback from users.
Types of Alerts
Modal Alerts: These are traditional JavaScript alerts that are not part of the HTML DOM.
Simple Alert: Displays an information message with an OK button.
Confirmation Alert: Presents a message with OK and Cancel buttons to accept or reject an option.
Prompt Alert: Offers an input field along with OK and Cancel buttons, allowing user input.
Non-Modal Alert (Sweet Alert): These are more modern, customizable alerts that are part of the HTML DOM and can be inspected.
Handling Alerts in Selenium
Focus Transfer: To interact with an alert, Selenium transfers focus to the alert box using driver.switchTo().alert().
Return Type: The return type for this operation is the Alert interface.
Implementation Class: Selenium implements this functionality through the RemoteAlert class.
Alert Interface Actions
accept(): Clicks the 'OK' button on the alert.
dismiss(): Clicks the 'Cancel' button, used for dismissing the alert.
getText(): Retrieves the text displayed on the alert box.
sendKeys(String keysToSend): Sends a string input to the alert, used in prompt alerts.
Special Case: Handling Sweet Alerts
Sweet Alerts are part of the HTML content and can be handled like any other web element. They require standard methods for interacting with web elements, unlike traditional JavaScript alerts.
Exceptions Related to Alerts in Selenium:
NoAlertPresentException: This exception is thrown when an operation is attempted on an alert, but there is no alert present.
UnhandledAlertException: This exception is trown when there is an alert that Selenium is unable to handle, either because it wasn’t expected, or because the driver cannot interact with it.