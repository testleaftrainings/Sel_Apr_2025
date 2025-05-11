3:00 to 3:45 ---> Inheritance
3:45 to 4.05 ---> BreakOut
4:05 to 4:15 ---> Break
4:15 to 5:15 ---> Abstraction
5:15 to 5:35 ---> BreakOut
5:35 to 5:45 ---> AdvancedXpath
6:15 to 6:00 ---> Recap

b.Advanced xPath(Axes based xPath)

1)Parent to Child: Syntax: BasicRelativeXpathforParent/childTagname  

2)Child to Parent: Syntax:  BasicRelativeXpathforChild/parent::parenttagname 

3)GrandParent to GrandChild: Syntax: BasicRelativeXpathforGrandParent//grandchildTagname 

4)GrandChild to GrandParent: Syntax:  BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname

5)ElderCousin to YoungerCousin: Syntax: BasicRelativeXpathforElderCousin/following::youngerCousintagname

6)YoungerCousin to ElderCousin: Syntax: BasicRelativeXpathforYoungerCousin/preceding::ElderCousintagname

7)ElderSibling to YoungerSibling: Syntax:
BasicRelativeXpathforElderSibling/following-sibling::youngerSiblingtagname 

8)YoungerSibling to ElderSibling: Syntax: BasicRelativeXpathforYoungerSibling/preceding-sibling::ElderSiblingtagname

Inheritance:
Definition of Inheritance:

Inheritance is a fundamental principle in object-oriented programming that allows a class to inherit attributes and behaviors (methods) from another class.
This uses extends keyword
Advantages of Inheritance:

Reusability: Inheritance promotes the reuse of existing code without having to rewrite it.
Readability: It makes the code more simple by establishing clear relationships between classes.
Hierarchy: Establishes parent-child relationships between Classes and Interfaces, making the structure easier to understand and maintain.
Types of Inheritance:

Single: A class inherits from one parent class.
Multiple: A class inherits behaviors from more than one class, typically achieved through interfaces in Java.
Multilevel: A class inherits from a child class, creating a multilevel chain.
Hierarchical: Multiple classes inherit from a single parent class.
Hybrid: A combination of multilevel and hierarchical inheritance.

Java Examples:
Integer extends Number
RuntimeException extends Exception
List extends Collection
Selenium WebDriver Examples: - ChromeDriver extends ChromiumDriver - EdgeDriver extends ChromiumDriver - ChromiumDriver extends RemoteWebDriver Alt text

Interview Question
Could you explain Inheritance concept in Java? Answer: Definition, Types, Advantages, Examples
Give realtime examples in Java, Selenium
Explain where have you applied Inheritance in your Framework?

Abstraction:
Definition:

Abstraction is an OOPs concept that focuses on hiding complex implementation details and exposing only the necessary parts of an object. It's about representing features without including background details.
Advantages of Abstraction:

Simplicity: Abstraction simplifies the view of an object, so you don't need to understand the internal workings to use it.
Reusability: Abstract classes and interfaces can be reused to implement common methods in multiple subclasses.
Keyword: The implements keyword is used to implement an Interface

Types:

Interfaces: Used for full abstraction, they cannot have any implementation.
Abstract Classes: Provide partial abstraction with some implemented methods.
Concrete Classes: Regular classes with full implementation.
Java Examples:

Interfaces: List, Set, Map are interfaces providing a standard set of methods to be implemented by concrete collections.
Abstract Classes: AbstractList, AbstractCollection provide skeletal implementations that can be used as starting points for creating concrete collections.
Selenium WebDriver Examples:

Interfaces: WebDriver, WebElement, Alert are interfaces representing abstract concepts in browser automation.
Abstract Classes: By is an abstract class providing methods to locate elements.
Concrete Classes: RemoteWebDriver is a concrete implementation of the WebDriver interface.

