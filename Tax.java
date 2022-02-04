import java.io.*;
import java.util.*;

public class Tax
{
    public static void main(String agrs[])
    {
        Scanner in = new Scanner(System.in);
        //char gender;
        double income,tax=0;
        int age; 
        
        System.out.println("Enter your income");
        income=in.nextDouble();
        System.out.println("Enter your Age");
        age=in.nextInt();
        //System.out.println("Enter your Gender for Male - 'M' For female 'F'");
        //gender=in.next().charAt(0);
        
        if(age<=65)//&&(gender.equals("M")))
        {
            if(income<=250000)
            {
                tax=0;
            }
            else if((income>250000)&&(income<=500000))
            {
                tax= (income-25000)*0.1;
            }
            else if((income>500000)&&(income<=1000000))
            {
                tax = ((income - 500000)*0.2) + 34000;
            }
            else if(income >1000000)
            {
                tax = ((income-1000000)*0.3) + 94000;
            }
        }
        else
        {
            System.out.println("Invalid Criteria");
        }
        
        System.out.println("***********INCOME TAX RECEIPT***********");
        System.out.println("Your Salary is             = "+income);
        System.out.println("Tax amount you have to pay = "+tax);
        
    }
}