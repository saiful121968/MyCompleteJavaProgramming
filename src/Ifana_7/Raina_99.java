package Ifana_7;
/* J07_05.java */
/* Example of readLine() Method */
import  java.io.*; 
 public class Raina_99{
public static void main(String args[])throws IOException {
String   Name;
BufferedReader inData = new BufferedReader (new InputStreamReader(System.in));
System.out.print("Please enter your name: ");
Name= inData.readLine();
System.out.print("Your name is : ");
System.out.print(Name);
 }
}
