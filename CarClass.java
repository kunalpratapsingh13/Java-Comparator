import java.util.*;
public class Car implements Comparable <Car> {      'implements Comoparable <T>' is important in order to use properties of Comparable
  public int speed;
  public int price;
  public String Color;
  
  public Car (int speed, int price, String color){      //Constructor to initialize Car object with the given specs
   this.speed = speed;
   this.price = price;
   this.color = color;
  }
   
 //Every class is a child of Object class by default. So we are overriding the toString function of Object class , so that we 
 //can print Car specs as the generic variable while using syso. Syso cannot print classes like simple variables. It follows the toString 
 //function of Object Class (Parent Class). Hence we are overriding it in our Car Class(Child Class) so as to get our desired output.
 public String toString(){                                               
   return "S: " + this.speed + "P: " + this.price + "C: " + this.color;   
  }                                                                      
  
  //Again, we are overriding the Compare function of the Object class so as to compare between two objects of Car class in the if
  //condition of BubbleSort. Here the Car objects will be sorted on the basis of their speeds.
  public int compareTo(Car other) {     
   return this.speed - other.speed;     
   }             
   
   //A similar code can be written for comparing on the basis of price, but not for color. In that case, we rely on the default compareTo
   //function of the object class to sort color on the basis of lexographical order.
   // In order to implement the following code, implement the previous compareTo code
  public int compareTo(Car other){
    return this.color.compareTo(other.color);
  }
  
}