Rayan : OK ok I have just learning Java and i found that this language is very crayzy


Let me share with you how to write your first Java program .is it ok for you?
Amine : Yeah why not. but what is the program about?
Rayan : well i will go teh traditional way and write a program that will print "Hello World" on the screen
Amine : ok let us start
Rayan : first That i know is that java is a fully object oriented language
Amine : OK, but what do you mean by that?
Rayan : this means that this means that eveything is an object. let me start by showing you the code
first thing we  have to do is to create a file with the extension ".java" inside it we are going  to create a class {it is prefebale to name the class the same as the file name}

```java
class helloworld{

}
```
Amine : ok now we have a file with the name "helloworld.java" and inside it we have a class with the name "helloworld" what is next?
Rayan : OK next we will try to compile this file and see what we got
```bash
javac helloworld.java
```
Amine : what is this command?

Rayan : this is the command used to comile the Java file . it reads our code and translate it to a language that the computer can understand
and if you notice that when we run that command we got a new file with the name "helloworld.class" which is the compiled version of our code 
and it runs on the Java Virtual Machine (JVM) which will I will explain later.
Amine : OK what now after compile teh code how can we run it?
Rayan : to run the code we have to use the following command
```bash
java helloworld
```
Amine : OH see what we got on the screen 
```
Error: Main method not found in class helloworld, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
```
ok we got this because we did not define the main method in our code the main method is the entry point of our program

Rayan : OK let us add the main method to our code
```java
class helloworld{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```
Amine : OK let us compile the code and run it
Rayan : well we got the output "Hello World" on the screen
Amine : hmm what if i wnat to add another function to the code?
Rayan : well you can add as many functions as you want but you have to call them from the main method
Amine : OK let us add another function to the code
```java
class helloworld{
    public static void main(String[] args){
        System.out.println("Hello World");
        print();
    }
  public  static void print(){
        System.out.println("This is a new function");
    }
}
```

Rayan : and we got in the output
```
Hello World
This is a new function
```
Amine : OK i got it now. but what is the meaning of the "public" and "static" keywords?
Rayan : well the "public" keyword is an access modifier that allows the main method to be called from outside the class and the "static" keyword allows the main method to be called without creating an object of the class
Amine : hmm . well what if i want to addd another class to the code and call it from the main method?

Rayan : well you can add as many classes as you want but you have to call them from the main method
Amine : OK. can you do it?
Rayan : OK let us add another class to the code
```java
class helloworld{
    public static void main(String[] args){
        System.out.println("Hello World");
        print();
        newclass obj = new newclass();
        obj.print();
    }
  public  static void print(){
        System.out.println("This is a new function");
    }
}
class newclass{
    public void print(){
        System.out.println("This is a new class");
    }
}
```


Amine : ok ok i got the idea now, now i have the baisic idea of how to write a Java program and to start working with it thank you Rayan
Rayan : you are welcome Amine. i am happy to help you