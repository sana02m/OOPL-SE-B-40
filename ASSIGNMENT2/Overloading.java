//Write a JAVA program that demonstrate the overloading method to compute power and absolute of a number for various data type and utilize the static method from math class for the same operation 

class Overloading {

static int power(int a, int b) {
int result = 1;
for(int i = 1; i<=b; i++) {
     result = result*a;
   }
   
    return result;
   }
   
static double power(double a, double b) {
    return Math.pow(a,b);
   }
   
static int absolute(int a) {
   
    if(a<0)
        return -a;
    else
        return a;
   }
   
static double absolute(double a)  {
     return Math.abs(a);
   }
   
public static void main(String[] args) {

int x=-5, y=3;
double p=-4.5, q=2.0;

      System.out.println("POWER(int) : " +power(2,3));
      System.out.println("POWER(double) : " +power(2.5,2.0));
      System.out.println("ABSOLUTE(int) : " +absolute(x));
      System.out.println("ABSOLUTE(double) : " +absolute(p));
      System.out.println("Math.pow() : " +Math.pow(2,3));
      System.out.println("Math.abs() : " +Math.abs(-10));
      
    }}
