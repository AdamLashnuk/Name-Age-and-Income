/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_2;
import java.util.Scanner;
/**
 *
 * @author Adam
 */
public class NAAI 
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);
        
        System.out.println("what is your name?");
        var userName = scanner.nextLine();
        
        System.out.println("How old are you");
        int userAge = scanner.nextInt();
        
        System.out.println("how many hours do you work in a week?");
        int userHours = scanner.nextInt();
        
        System.out.println("whats your exact hourly pay");
        double userHourlyPay = scanner.nextDouble();
        
        double grossPay = userHours * userHourlyPay ;
                System.out.println("Your name is " + userName + ", you are " + userAge + " years old and your gross pay is $" + grossPay + " weekly");
                

}
    }