package Ifana_7;
/* J07_06_Alt.java */
/* Array of String Objects */

public class Raina_101
{
    String[] Menu ={"File","Edit","View","Window","Help"};

    // Method to display Menu items
    public void display()
    {
for (String m: Menu){
            System.out.print(m + "\t");
        }    }

    public static void main(String[] args)
    {
    	Raina_101 sa1 = new Raina_101();
    	sa1.display();
    }
}
