3:00 to 3:30 ---> PolyMorphism
3:30 to 3:50 ---> BreakOut
4:00 to 4:10 ---> Break
4:10 to 5:10 ---> Collection(List)
5:10 to 5:30 ---> BreakOut
5:30 to 6:00 ---> Set
6:00 to 6:15 ---> Recap
Polymorphism:
Definition

Polymorphism in Java is a concept by which we can perform a single action in different ways.
It is derived from two Greek words: "poly" and "morphs". "Poly" means many and "morphs" means forms.
Types - compile-time polymorphism - runtime polymorphism. Compile-time polymorphism is achieved by method overloading, while runtime polymorphism is achieved by method overriding. - It allows objects of different classes to be treated as objects of a common super class for seamless interaction, typically through the use of method overriding within an inheritance hierarchy. - This enables Java programs to be written more abstractly, promoting scalability and maintainability.

Overloading: - It refers to the ability to create multiple methods of the same name with different implementations. -Calls to an overloaded method will run a specific implementation of that method appropriate to the context, based on the number and type of arguments passed.

Java Examples:

Methods like add() can be overloaded to accept different types of arguments.
Similarly, substring() in the String class is overloaded to accept different starting and ending points for the substring.
println()
Selenium WebDriver Examples:

The frame() method in Selenium WebDriver is overloaded to allow different types of arguments like an integer (index of the frame), a String (name or ID of the frame), or a WebElement.
Advantages of Overloading:

Flexibility: Allows methods to handle different data types and numbers of arguments.
Readability: It can make the code more readable since the same method name can be used for similar actions on different types of input.
Reduces Complexity: Developers can use the same method name to perform similar actions, which simplifies code organization and maintenance.
Overriding

Method overriding in Java occurs when a subclass has a method with the same name, return type, and parameters as a method in its superclass.
It's a key feature of runtime polymorphism and allows a subclass to provide a specific implementation for a method that is already provided by its parent class
Examples:

equals() of String class is overriden from the Object class
toString() of String class is overriden from the Object class
quit() of ChromiumDriver is overriden from the RemoteWebDriver Class


List Interface in Java
Definition: The List interface in Java is part of the Java Collections Framework. It represents an ordered collection (also known as a sequence). Lists can contain duplicate elements and are dynamic in size, meaning they can grow or shrink as needed.
Why Use Lists: Lists are used when you need an ordered collection that can change in size. This is particularly useful when you don't know the number of elements in advance, or when you need to perform frequent insertions and deletions.
ArrayList vs LinkedList: While ArrayList is the most common implementation, providing fast access and efficient storage for large numbers of elements, LinkedList can be more efficient for certain use cases, especially where frequent insertion and deletion occur.
Methods and Use Cases
Creating Lists (new ArrayList<>()):

Usage: To initialize a list.
Real-time Use Case: In a real-world scenario, you might initialize a list to store data such as employee names, product details, or any collection of similar items. For example, a list to store the names of participants in a workshop.
Adding Items (add() method):

Usage: To add elements to the list.
Real-time Use Case: This is used when you need to add new data to your collection. For example, adding new members to a project team or new items to a to-do list.
Inserting at Specific Index (add(index, element)):

Usage: To add an element at a specified position in the list.
Real-time Use Case: Useful in cases where the order is important, like adding a new task at a specific position in a task list or inserting a new chapter into a specific position in a book's table of contents.
Printing the List (System.out.println(list)):

Usage: To display the contents of the list.
Real-time Use Case: Displaying a list of items, such as a list of available products to a user, or printing a list of registered participants for an event.
Adding All Elements from Another List (addAll()):

Usage: To add all elements from one list into another.
Real-time Use Case: Merging two datasets, such as combining two lists of customers from different regions into a single list for a unified analysis.
Finding the Size of the List (size() method):

Usage: To get the number of elements in the list.
Real-time Use Case: Checking the number of entries in a database, like the number of students enrolled in a course or the number of items in stock.
Accessing Elements (get(index)):

Usage: To retrieve a specific element from the list based on its index.
Real-time Use Case: Fetching a specific data entry, such as retrieving a specific order detail from a list of orders.
Removing Elements (remove(index) and removeAll()):

Usage: remove(index) removes an element at a specific index, while removeAll() removes all elements that are present in another collection.
Real-time Use Case: remove(index) can be used for deleting a specific entry, like removing a discontinued product from a product list. removeAll() can be useful in filtering out data, like removing all outdated items from a current inventory list.
Clearing the List (clear()):

Usage: To remove all elements from the list, making it empty.
Real-time Use Case: Resetting data, such as clearing a user's shopping cart after they have completed the checkout process.

