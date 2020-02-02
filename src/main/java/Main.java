import java.util.*;
class Sweets{
     final int chocolate_weight=500;
     final int candy_weight=300;
     final int chocolate_price=20;
     final int candy_price=10;
}
class Chocolate extends Sweets
{
     void add(int count){
         int total_weight=count*chocolate_weight;
         int total_price=count*chocolate_price;
         System.out.println("Total weight = "+total_weight);
         System.out.println("Total Price = "+total_price);
     }
}
class Candies extends Sweets{
    void add(int count){
        int total_weight=count*candy_weight;
        int total_price=count*candy_price;
        System.out.println("Total weight = "+total_weight);
        System.out.println("Total Price = "+total_price);
    }
}
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("For Chocolate enter 1 and for candy enter 2");
        int gift=sc.nextInt();
        Chocolate c1=new Chocolate();
        Candies c2=new Candies();
        if(gift==1){
            System.out.println("Enter the number of chocolates");
                    int count=sc.nextInt();
            c1.add(count);
        }
        else if(gift==2){
            System.out.println("Enter the number of candies");
            int count=sc.nextInt();
            c2.add(count);
        }
    }
}
