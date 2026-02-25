//Develop a Java program for an E-commerce order processing where some products are initialized through multiple constructors, users can input some product details manually, the system computes total order cost dynamically, applies discount policies based on conditions, and presents a detailed invoice summarizing the purchase.

import java.util.Scanner;
public class A {

int id;
String Name;
int Quantity;
double Price;

A () {
id = 0;
Name = "SANA";
Quantity = 0;
Price = 0;
}

A(int id, String Name, double Price){
this.id=id;
this.Name=Name;
this.Price=Price;
this.Quantity=1;
}

A(int id, String Name, double Price, int Quantity) {
this.id=id;
this.Name=Name;
this.Price=Price;
this.Quantity=Quantity;
}

double getTotalPrice() {
return Price*Quantity;
}

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

A   A1 = new A(101, "LAPTOP", 500, 1);
A   A2 =  new A(102, "MOBILE", 200, 2);

System.out.println("ENTER PRODUCT ID : ");
int id = input.nextInt();
   		 
System.out.println("ENTER PRODUCT NAME : ");
String Name = input.next();
 
System.out.println("ENTER QUANTITY : ");
int Quantity = input.nextInt();

System.out.println("ENTER PRICE : ");
double Price = input.nextDouble();
   		 
A A3 = new A(id, Name, Price, Quantity);
   		 
double total = A1.getTotalPrice()
          	+A2.getTotalPrice()
          	+A3.getTotalPrice();
       		 
double display = 0;
  		 if(total >= 5000)   {
        		 display = total* 0.10;
   	 }
  		 else if(total >= 2000)
  	 {
        		 display = total * 0.05;

}
double finalAmount = total - display;

System.out.println("\n=========== INVOICE ===========");
System.out.println("PRODUCT IS \t NAME \t PRICE \t QUANTITY");
System.out.println("---------------------------------------------");
System.out.println(A1.id + "\t\t" +A1.Name + "\t" +A1.Price + "\t" + A1.Quantity + "\t" + A1.getTotalPrice());
System.out.println(A2.id + "\t\t" +A2.Name + "\t" +A2.Price + "\t" + A2.Quantity + "\t" + A2.getTotalPrice());
System.out.println(A3.id + "\t\t" +A3.Name + "\t" +A3.Price + "\t" + A3.Quantity + "\t" + A3.getTotalPrice());
System.out.println("-----------------------------------------");
System.out.println("TOTAL AMOUNT : " +total);
System.out.println("DISCOUNT : " +display);
System.out.println("FINAL PAYABLE : " +finalAmount);
System.out.println("---------------------------------------------");

	 input.close();
    
}
}

