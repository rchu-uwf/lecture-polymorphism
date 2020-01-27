

Three important concepts with Object Oriented Programming:

* encapsulation
* inheritance
* polymorphism


### Encapsulation

Use objects to organize your data.

Think about a member item like "private String firstName;"  This variable is not available outside of its class.


### Inheritance

"is-a" refers to inheritance.  Frog is-a Critter.

"has-a" refers to composition.  Frog has a color.


### Polymorphism



### UML

minus indicates private.

plus indicates public

italics indicates abstract

Red square: private

Green circles: public

### Define a constructor


### Define a method



## Midterm overview

### How long to we have to take the midterm?  75 minutes

### General format 

 True/False.
   Multiple choice.
   "What does this code do".
   
 Three coding questions, with instructions given as a JUnit test, or as a UML diagram.
 How can I practice this?
   

### Java types

 Primitive types and their defaults.
  
 Numeric primitives: Default to zero
 short, int, long, float and double
     
 Textual Primitives: Default to \u0000
 byte and char
 
 Boolean defaults to false
 
 null
 
 Type coercion.
 
 double to int
 3.14 becomes 3

Examples:

```java
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
```

### Branching and looping

Branching

#### if/else
 
 ```java
int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}
 
 ```
 
#### switch
 
```Java
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
```

### Loops

#### while loop

```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

```

#### do-while loop

```java
    while (!isGameOver) { }
    for (int i = 0; i < zoo.length; ++i) { }
    do {something} while (condition)   //will run at least once
```

### Array basics
 Looping over the contents of an array.
 Initializing arrays.
 Be familiar with .length

### Object Oriented Programming principles

 What are they and what does each depend on?
 * encapsulation depends upon classes
 https://www.w3schools.com/java/java_oop.asp
 
 * inheritance depends upon encapsulation
 https://www.w3schools.com/java/java_inheritance.asp
 
 * polymorphism depends upon inheritance
 https://www.w3schools.com/java/java_polymorphism.asp
    

### Miscellany

 I/O topics will not be on the exam.
 UML to code, code to UML.
 JUnit.
 exception
 
 Practice on an editor with no IDE help.
 Pay attention to indentation.
    
   