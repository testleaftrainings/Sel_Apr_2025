3:00 to 3:40 --->Frames
3:40 to 4:00 --->BreakOut
4:00 to 5:00 --->WebTable
5:00 to 5:20 --->BreakOut
5:20 to 5:30 --->Break
5:30 to 6:00 --->AdvancedUserInteractions

What is a Frame?
A frame is a part of a web page or browser window which displays content independent of its container, with its own scroll and navigation.
It's essentially a document within a document, commonly used to embed a separate document within a web page.
Why Handle Frames?
Frames must be handled because Selenium WebDriver operates on a single document context.
If a web page contains frames, WebDriver cannot automatically access the content of these frames.
To interact with elements within a frame, WebDriver must switch to it explicitly.
How to Identify a Frame?
Frames can be identified by right-clicking on the element and selecting "View Frame Source" for direct URLs or by searching for the frame or iframe tags within the HTML DOM.
Structure of Frame
When you inspect a web page, you'll notice that the frame or iframe tags define the frame structure. Each frame will have its own HTML document, which can be navigated and manipulated independently of the main page.
How to Handle Frames?
To handle frames, use the switchTo() method provided by WebDriver.

By index: driver.switchTo().frame(int index)
By Name or ID: driver.switchTo().frame(String nameOrId)
By Reference: driver.switchTo().frame(WebElement frameElement)
Once you're done with the frame and need to switch back to the main content, use:

driver.switchTo().defaultContent()
And to switch to the immediate parent frame, use:

driver.switchTo().parentFrame()
How to Handle Nested Frames
Nested frames are handled by switching into each frame sequentially. After interacting with the deepest frame, you need to switch back to the parent frame or main document to continue the automation tasks.
For handling nested frames, you would use a sequence of switchTo().frame() calls to drill down into the nested structure, and use switchTo().parentFrame() or switchTo().defaultContent() to navigate back up.
Exception:
NoSuchFrameException in Selenium is thrown when the WebDriver attempts to switch to a non-existent frame. - This can happen if the frame has been removed or if it never existed in the DOM at the point of the attempt. - It indicates that the specified frame is not present in the current page context, and the automation script needs to ensure that the frame name, ID, or reference being used to switch to is correct and available.
This exception is a signal to check the frame's existence, its correct identification, or if the page has fully loaded before attempting to switch frames.

static:No of rows and columns are not changed,but the values may get changed,
dynamic:No of rows and columns,values is changed acc to the inputs.

structure of webtable:
<table>
   <thead>---->theader

     <tr>--->row of the header
       <th>--->each header information
       
       </th>
     </tr>
   </thead>


   <tbody>--->table body(has all the informations)
    <tr>--->trow
     <td>---->tabledata
     
     </td>
    
    </tr>
    <tr>
     <td>
     
     </td>
    
    </tr>

    </tbody>

</table>

selenium wait:
1)implicit-------->global wait
                   it will not wait for the entire duration you are specifying
                   when it exceeds the timelimit throws no such element exception
2)explicit wait
3)fluent wait

javawait:
thread.sleep--->applicable for single line of code
                waits for the entire duration
                 not recommended