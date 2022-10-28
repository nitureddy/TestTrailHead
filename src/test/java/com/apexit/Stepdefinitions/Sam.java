package com.apexit.Stepdefinitions;

import java.util.Scanner;

public class Sam
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); int n=2;
char o;
//System.out.println("Enter the total number of elements ");
// n=sc.nextInt();
System.out.println("Enter the math operation(+ - / *) ");
o=sc.next().charAt(0);
switch (o) {
case '+':int arr[]=new int[n];
System.out.println("Enter the elements of the array ");
for(int i=0; i<n ;i++)
{
arr[i]=sc.nextInt();
}
int sum = 0;
sum = arr[0]+arr[1];
System.out.println("The sum of elements in the array is "+sum);
break;
case '-':int arr1[]=new int[n];
System.out.println("Enter the elements of the array ");
for(int i=0; i<n ;i++)
{
arr1[i]=sc.nextInt();
}
int sum1 = 0;
sum1= arr1[0]-arr1[1];
System.out.println("The subs of elements in the array is "+sum1);
break;
case '/':int arr2[]=new int[n];
System.out.println("Enter the elements of the array ");
for(int i=0; i<n ;i++)
{
arr2[i]=sc.nextInt();
}
int sum2 = 0;
sum2 = arr2[0]/arr2[1];
System.out.println("The div of elements in the array is "+sum2);
break;
case '*':int arr3[]=new int[n];
System.out.println("Enter the elements of the array ");
for(int i=0; i<n ;i++)
{
arr3[i]=sc.nextInt();
}
int sum3 = 0;
sum3 = arr3[0]*arr3[1];
System.out.println("The multiplication of the elements in the array is "+sum3); break;
default:System.out.println("Syntax Error");
}
}
}