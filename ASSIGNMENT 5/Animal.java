//Create a java program demonstrating single inheritance where a subclass extends a superclass and calls its methods

import java.util.Scanner;
class Details {

String name;
 	Animal(String name) {
     	this.name=name;
    	 
     	System.out.println("ANIMAL CONSTRUCTOR CALLED.");
  	}
 	 
void eat(String food) {
     	System.out.println(name+" EATS "+food);
  	}
 	 
void sound() {
     	System.out.println("ANIMAL MAKES A SOUND.");
  	}}
 	 
class Dog extends Animal {
   	Dog(String name) {
   	super(name);
     	System.out.println("DOG CONSTRUCTOR CALLED.");
  	}
 	 
void display() {
     	System.out.println("DOG NAME IS : "+name);
  	}}
 	 
public class Animal  {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

     	System.out.println("ENTER DOG'S NAME : ");
     	String name = input.nextLine();
     	System.out.println("ENTER FOOD : ");
     	String food = input.nextLine();
    	 
    	 
Dog d = new Dog(name);

     	d.display();
     	d.eat(food);
     	d.sound();
    	 
 	input.close();
}
}
