# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].

![Aloha World UML](/docs/uml/Aloha_world_uml.png)


### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).

The main method in the AlohaWorld class calls the static methods getName() and getLocality() of the ConsoleView class, which is responsible for handling user interaction, and stores the return values in variables name and locality. 
The main method then instantiates a greeter class object, passing in the name and locality. Then, it calls the static method printGreeting of the ConsoleView class, passing in the return value of the greet() method of the greeter object.
The main method uses a while loop to check if the user still wants another greeting, and while so, it gets and resets the locality of the greeter, and prints the greeting.
The ConsoleView handles user interaction and printing of the greeting message. The greet() method of the greeter class generates the greeting string based on name, locality, and the ascii vs Unicode setting.
The greeter class also provides a copy of the localityList to ConsoleView through a static method.


## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   *  `final`
   *  `static`
   *  `private`


2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * The `final` keyword when used on a class prevents the class from being inherited.[^1]
    * The `static` keyword when used on a method means the method belongs to the class as opposes to the instances of the class, and it can be accessed using the . operator without creating an instance of that class.[^2]
    * The `private` keyword when used on a constructor of a class prevents the instantiation of an object of that class from outside.[^3]


3. What does `main` do in Java? 

    The main method is the entry point of a program. It is found by JVM to start running the program.
It has to be modified by the `public` and `static` keywords for JVM to call without having to instantiate the class that the main method is in.
It takes in a String array as its arguments. The return type is void.


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    The toString() method defines the behavior when an object is being printed.
Overriding of the toString() method is useful because it allows the programmer to define
the string representation of the object for debugging or displaying purposes.


5. What is javadoc style commenting? What is it used for? 

    Adding /** */ type of comments helps the process of the generation of a javadoc. 


6. Describe Test Driving Development (TDD) in your own words. 

    Test Driving Development (TDD) is a software development practice that encourages the programmers
to focus on the implementation of the desired functionalities of a program by writing tests before the actual code.


7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?

It is one of the core ideas of object-oriented programming, which encourages a separation of "tasks" to different classes or objects.
The purpose of doing so is to decouple functionalities so that the system is modularized. This improves safety, makes the system easier to maintenance.


2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.

It is possible for greeting.java to maintain a dictionary structure that holds the pairs of locality and greeting.
So, the greet() method of greeter can use a greeting object to generate the appropriate message based on locality.

> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: final Keyword in Java: 2025. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2025-01-23. 

[^2]: Static Method vs Instance Method in Java: 2025. https://www.geeksforgeeks.org/static-methods-vs-instance-methods-java/. Accessed: 2025-01-23.

[^3]: Private Constructors in Java: 2025. https://www.baeldung.com/java-private-constructors. Accessed: 2025-01-23.


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java