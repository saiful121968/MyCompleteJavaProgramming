package Ifana_2;
/* J02_03.java   */
/* A Command Line Argumented Program */

public class Raina_5{

public static void main (String[] args )
 {	
 int i, c;
 String S;
 c = args.length;
 System.out.println("Number of arguments is : " +c);

 for (i =0; i<c; i++)
  {
  S = args[i];
  System.out.println("Arg["+i+"] is : " +S);
  }
 
 }
}

