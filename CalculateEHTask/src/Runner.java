package corejava9.CalculateEHTask.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner
{
    Runner()
    {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            int num1;
            int num2;
            String operation;
            while (true)
            {
                try
                {
                    System.out.println("Enter Integer 1: ");
                    num1 = scanner.nextInt();
                    break;
                }
                catch (InputMismatchException e)
                {
                    System.out.println("please input a Integer.");
                    scanner.next();
                }
            }

            while (true)
            {
                System.out.println("Enter Integer 2: ");
                try
                {
                    num2 = scanner.nextInt();
                    break;
                }
                catch (InputMismatchException e)
                {
                    System.out.println("please input a Integer.");
                    scanner.next();
                }
            }

            while(true)
            {
                System.out.println("please input Operation: +, -, *, /, %");
                operation = scanner.next();
                if(operation.equals("+")||operation.equals("-")||operation.equals("*")||operation.equals("/")||operation.equals("%"))
                {
                    break;
                }
                else
                {
                    System.out.println("Error input, please try again.");
                }
            }

            Calculate calculate = new Calculate(num1,num2,operation);
            calculate.getAnswer();

            System.out.println("Do you want to try again?\nenter 'Yes' to continue, other keys to Exit.");
            if(!scanner.next().equals("Yes"))
            {
                break;
            }
        }
    }
}
