// Write a JAVA program that performs various operations on array including displaying element, finding the maximum and the minimun element, calculating the sum and average of elements and searching for a specific element within the array.

import java.util.Scanner;
public class Array {
public static void main (String[] args) {

Scanner input = new Scanner(System.in);

        System.out.println("ENTER SIZE OF ARRAY : ");

int n = input.nextInt();
int arr[] = new int[n];


      System.out.println("ENTER ELEMENTS OF ARRAY : ");
          
for(int i = 0; i<n; i++) {
      arr[i] = input.nextInt(); 
      
      }
      for(int i = 0; i<n; i++)
      
      System.out.println("ELEMENT AT POSITION " +(i+1)+ " IS " +arr[i]);
      
      
int max = arr[0];
int min = arr[0];
for(int i = 1; i<n; i++) {
    
    if(arr[i] > max)
       max = arr[i];
    if(arr[i] < min)
       min = arr[i];
     
   }
        
int sum=0;
for(int i = 0; i < n; i++) {
      sum = sum + arr[i];
  }
double avg = (double)sum/n;
        System.out.println("\n\nENETER ELEMENT TO SEARCH : ");
int key = input.nextInt();
boolean found = false;

for(int i = 0; i<n; i++) {
if(arr[i] == key) {
        System.out.println("ELEMENT FOUND AT POSITION : " +(i+1));
         found = true;
     break;
 }
 }
 
if(!found) {
           System.out.println("ELEMENT NOT FOUND ");
 }
 
           System.out.println("MAXIMUM ELEMENT :  "+max);
           System.out.println("MINIMUM ELEMENT :  "+min);
           System.out.println("SUM OF ELEMENT " +sum);
           System.out.println("AVERAGE OF ELEMENTS : "+avg);

input.close();
      }
      }
      
