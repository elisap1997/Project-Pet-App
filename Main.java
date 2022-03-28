import java.util.Scanner;
import java.util.*;

class Main {
  public static void main(String[] args) {

  Scanner keyboard = new Scanner(System.in);

  // Enter your code below this line
  String name = "";
  String type = "";
  double weight = 0.0;
  int age = 0;
  double height = 0.0;
  boolean ownerStatus = true;
  boolean isPet = true;
  boolean goAhead = true;

  System.out.print("Are you a pet owner? ");
  ownerStatus = Boolean.parseBoolean(keyboard.nextLine());

  System.out.print("Is the animal a pet? ");
  isPet = Boolean.parseBoolean(keyboard.nextLine());

  goAhead = ownerStatus && isPet;

  System.out.println("You are using this app for its intended purpose: " + goAhead);

  System.out.print("What is your pet's name? ");
  name = keyboard.nextLine();

  System.out.println("Your pet's name is " + name);

  System.out.print("What type of animal is your pet? ");
  type = keyboard.nextLine();

  System.out.println("Your pet is a " + type);

  System.out.print("How much does your pet weigh? ");
  weight = Double.parseDouble(keyboard.nextLine());

  System.out.println("Your pet weighs " + weight);
  
  System.out.print("How old is your pet? ");
  age = Integer.parseInt(keyboard.nextLine());

  System.out.println("Your pet is " + age + " years old.");

  System.out.print("How tall is your pet? ");
  height = Double.parseDouble(keyboard.nextLine());

  System.out.println("Your pet is " + height + " tall");

  System.out.println("Your pet is a " + type + " and named " + name + ". It weighs " + weight + ", is " + age + " years old, and is " + height + " tall.");

  










  /////////// End of the tasks /////////////////
  } // end of method
} // end of class
