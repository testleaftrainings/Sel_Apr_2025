3:00 to 3:30 ---> DropDown
3.30 to 3.50 --->BreakOut
3:50 to 4:00 ---> Break
4:00 to 4:30 ---> AbsoluteXpath
4:30 to 5:00 ---> Basic Xpath
5:00 to 5:10 ---> Break
5:10 to 5:45 ---> AdvancedXpath
5:45 to 6:00 ---> Recap
Definition and Structure:

Absolute XPath: It starts from the root (html) and traverses down to the desired element, detailing every single element in the hierarchy. The path starts with a single forward slash /, indicating the root. For example: /html/body/div[2]/div[2]/div/form/p[1]/input. `.
Relative XPath: It starts from anywhere within the document and typically focuses on identifying elements based on attributes, indexes, or specific tags, not necessarily detailing the entire path from the root. It starts with a double forward slash //, indicating the search can begin anywhere. For example: //input[@id=‘username’].
Robustness:

Absolute XPath: It is less robust because if there are any changes in the path or structure of the web page, the XPath would break, leading to failed element location.
Relative XPath: It is more robust as it usually focuses on specific attributes or elements, making it less susceptible to changes in the overall structure of the webpage.
Length and Complexity:

Absolute XPath: These tend to be longer . They map the entire path from the root to the element, making them more complex.
Relative XPath: They are generally shorter and more concise, targeting specific elements directly without detailing the entire path, reducing complexity.
Flexibility and Use Cases:

Absolute XPath: It's less commonly used in dynamic web environments where page structures can change frequently.
Relative XPath: More commonly used in web automation and scraping because of its adaptability to web page changes and ability to precisely target elements.
Performance:

Absolute XPath: It can be slower in performance as it requires traversing the entire hierarchy of the DOM (Document Object Model) from the root.

Relative XPath: Generally offers better performance as it allows for more direct queries and doesn't necessarily traverse from the root.
Relative Xpath:

Attribute based xPath: Syntax: //tagname[@attributename='attributeValue'] Example:  //input[@id='password'] //input[@id='twotabsearchtextbox']

Text based xPath: Syntax: //tagname[text()='textvalue'] Example:  //a[text()='Leads'] //span[text()='Hello, sign in']

Partial Attribute based xpath: Syntax: //tagname[contains(@attributename,'partialattributevalue')] Example: //input[contains(@class,'decorative')] //input[contains(@id,'twotab')]

Partial Text based xpath:
Syntax: //tagname[contains(text(),'partialtextvalue')]  Example: //a[contains(text(),'SFA')]
//span[contains(text(),'Hello')]

Index based xpath: Syntax: (//tagname[@attributename='attributeValue'])[2]
(//tagname[text()='textvalue'])[3] Example: (//a[contains(text(),'Lead')])[3] 

