package Ifana_7;
/* J07_03.java */
/* Example of readLine() Method */
import  java.io.*; 
 public class Raina_97{
public static void main(String args[]) throws IOException {
DataInputStream inData = new DataInputStream(System.in);
System.out.print("Please enter your name: ");
String   Name;
Name= inData.readLine();
System.out.print("Your name is : ");
System.out.print(Name);
 }
}
