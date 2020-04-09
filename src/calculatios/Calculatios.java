/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatios;

/**
 *
 * @author User
 */
public class Calculatios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Formulas formulas = new Formulas();
        
        //countDigit check
        System.out.println(formulas.countDigit(100));
        
        //Leap year check
        if(formulas.isLeapYear(2016)){
            System.out.println("Leap year");
        }
        else
            System.out.println("Not leap year");
        
        //palindrome number check
        if(formulas.isPalindrome(1000010)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not palindrom");
        
        //perfect number check
        if(formulas.isPerfect(10))
            System.out.println("Perfect number");
        else
            System.out.println("Not perfect number");
        
        //prime number check
        if(formulas.isPrime(1))
            System.out.println("Prime number");
        else
            System.out.println("Not prime number");
        
        //Armstrong number check
        
        if(formulas.isArmstrong(372))
            System.out.println("Armstrong number");
        else
            System.out.println("Not armstrong");
        
        //find factorial
        System.out.println(formulas.findFactorial(5));
        //Strong number check
        if(formulas.isStrong(140))
            System.out.println("Strong number");
        else
            System.out.println("Not strong number");
        
        //Odd even number check
        
        if(formulas.isEven(3))
            System.out.println("even");
        else
            System.out.println("odd");
        
        //Last digit check
        System.out.println(formulas.lastDigit(10000));
        //First digit check
        System.out.println(formulas.firstDigit(201));
        //find GCD
        System.out.println(formulas.findGCD(5, 12));
        //find LCM
        System.out.println(formulas.findLCM(12, 5));
        
        
        Test test = new Test();
    test.printInfo();
    Test t = new  Test();
    t.printInfo();
    }
    
    
    
}
