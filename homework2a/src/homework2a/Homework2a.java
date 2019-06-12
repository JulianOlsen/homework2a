package homework2a;

import java.util.Scanner;
import java.util.Random;

public class Homework2a 
{   

    public static void main(String[] args) 
    {
        
       System.out.println("type a number between 1 to 15");
       System.out.println("you have one chance to guess the nuber cortley");
        
       Scanner Sc = new Scanner(System.in);
       int x = Sc.nextInt();
       Random rand = new Random();
       int n = rand.nextInt(15);
     
       
     
       if (n>x)
       { 
            System.out.println("sorry you are wrong");
       }
       else if (x>n)
       {
           System.out.println("sorry you are wrong");
       }
       else if (x==n)
       {
            System.out.println("you win");
       }
       else{}
       
    }
}
