
package calculatios;

import javax.naming.spi.DirStateFactory;


public class Formulas {
    
    //method for summation two or three variables start
    public int doSum(int a,int b ){
        return a+b;
    }
    public int doSum(int a, int b, int c){
        return a+b+c;
    }
    public double doSum(double a, double b){
        return a+b;
    }
    public double doSum(double a, double b, double c){
        return a+b+c;
    }
    //method for summation two or three variables end
    
    //method for subtraction two  variables start
    public int doSub(int a, int b){
        return a-b;
    }
    public double doSub(double a, double b){
        return a-b;
    }
    //method for subtraction two  variables start
    
    //method for multiplication two or three  variables start
    public int doMul(int a, int b){
        return a*b;
    }
    public int doMul(int a, int b, int c){
        return a*b*c;
    }
    
    public double doMul(double a, double b){
        return a*b;
    }
    public double doMul(double a, double b,double  c){
        return a*b*c;
    }
     //method for multiplication two or three variables end
    
     //method for division two  variables start
     public int doDiv(int a, int b){
        return a/b;
    }
    public double doDiv(double a, double b){
        return a/b;
    }
    //method for division two  variables end
    
    //methods for finding maximum number start
    public int findMax(int a, int b){
        
        if(a>b)
            return a;
        else 
            return b;    
    }
    public double findMax(double a, double b){
        
        if(a>b)
            return a;
        else 
            return b;    
    }
    public int findMax(int a, int b,int c){
        
        if((a>b) && (a>c))
            return a;
        else if((b>a) && (b>c))
            return b;
        else 
            return c;
    }
    public double findMax(double a, double b,double c){
        
        if((a>b) && (a>c))
            return a;
        else if((b>a) && (b>c))
            return b;
        else 
            return c;
    }
    //methods for finding maximum number end
    
    //methods for finding Minimum number start
    public int findMin(int a, int b){
        
        if(a<b)
            return a;
        else 
            return b;    
    }
    public double findMin(double a, double b){
        
        if(a<b)
            return a;
        else 
            return b;    
    }
    public int findMin(int a, int b,int c){
        
        if((a<b) && (a<c))
            return a;
        else if((b<a) && (b<c))
            return b;
        else 
            return c;
    }
    public double findMin(double a, double b,double c){
        
        if((a<b) && (a<c))
            return a;
        else if((b<a) && (b<c))
            return b;
        else 
            return c;
    }
    //methods for finding maximum number end
    
    //methods for finding square of a  number start
    public int findSquare(int a){
        
        return a*a;
    }
    public double findSquare(double a){
        
        return a*a;
    }
    //methods for finding square of a  number end
    
    //methods for finding Cube of a  number start
    public int findCube(int a){
        
        return a*a*a;
    }
    public double findCube(double a){
        
        return a*a*a;
    }
    //methods for finding Cube of a  number end
    
    //methods for finding Power of a  number start
    public int findPower(int base,int power){
        int result = 1;
        for(int i=1;i<=power;i++){
             result = result*base;
        }
        return result;
    }
    public double findPower(double base,double power){
        double result = 1.0;
        
        for(int i=1;i<=power;i++){
             result = result*base;
        }               
        return result;
    }
    //methods for finding Power of a  number end
    
    //Leap check start
    
    public boolean isLeapYear(int year ){
        if((year%400 ==0) ||((year%4==0) && (year%100!=0))){
            return true;
        }
        else
            return false;
    }
    
    //Leap check end
    public int countDigit(int number){
        
        int digitCount = 0;
        
        while(number>0){
            number = number/10;
            digitCount++;
        }
        
        return digitCount;
    }
    
    //Palindrome number check start
    public boolean isPalindrome(int n){
        
        int number = n;
        int palindrome = 0;
        while(n>0){
            int mod = n%10;
            n = n/10;
            palindrome = (palindrome*10)+mod;
            
        }
        if(number == palindrome){
            return true;
        }
        else
            return false;
    }
    
    //palindrome number check end
    // Perfect is the number if it is equal to the sum of all positive divisors of it
    
    public boolean isPerfect(int n){
        
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        
        if(sum ==n){
            return true;
        }
        else
            return false;
        
    }
    //Perfect number check end
    
    //If a number only divide by 1 and by itself then it is called prime number
    
    public boolean isPrime(int number){
        
        int prime = 1;
        if(number==1)
            prime = 0;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                prime = 0;
            }
            else
                prime = 1;
        }
        
        if(prime ==1)
            return true;
        else
            return false;
    }
    
    //An Armstrong number is a n-digit number that is equal to the sum of the nth power of its digits;
    
    public boolean isArmstrong(int number){
        int digitCount = 0;
        int sum = 0;
        int temp = number;
        
        while(number>0){
            number = number/10;
            digitCount++;
        }
        number = temp;
        while(number>0){
            int power = 1;
            int mod = number%10;
            for(int i=1;i<=digitCount;i++){
                 power = power * mod;
            }
            sum = sum+power;
            number = number/10;
        }
        if(sum==temp)
            return true;
        else
            return false;   
    }
    
    //Find Factorial of a given number
    public int findFactorial(int number){
        int factorial =1;
        for(int i=1;i<=number;i++){
            factorial = factorial*i;
        }
        return factorial;
        
    }
    
    // A number is said to be a strong number if the summation of factorial of each digit of that number
    
    public boolean isStrong(int number){
        int sum=0;
        int temp = number;
 
        while(number>0){
            int mod = number%10;
            number = number/10;
            
            int factorial =1;
        for(int i=1;i<=mod;i++){
            factorial = factorial*i;
        }
        sum = sum+factorial;
        }
        
        if(sum == temp)
            return true;
        else
            return false;
        
    }
    //odd number check
    public boolean isOdd(int number){
        if(number%2!=0)
            return true;
        else
            return false;
    }
    //even number check
    public boolean isEven(int number){
        if(number%2==0)
            return true;
        else
            return false;
    }
    //find lastdigit 
    public int lastDigit(int number){
        int mod;
        if(number%10==0){
            mod =0;
        }
        else{
            mod = number%10;
        }
        
        return mod;
    }
    //find first digit
    public int firstDigit(int number){
        
        while(number>9){
            number = number/10;
            if(number<10)
                break;
        }
        return number;
    }
    //Calculate Greatest Common Divisor (GCD) of two numbers
    public int findGCD(int a, int b){
        int min,gcd=1;
        if(a<b)
            min = a;
        else
            min = b;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
                
        }
        
        return gcd;
    }
    // Calculate Least common multiple (LCM) of two numbers
    public int findLCM(int a,int b){
        int max,lcm=1;
        if(a>b)
            max = a;
        else
            max = b;
        
        int i=max;
        while(lcm>0){
            if(i%a==0 && i%b==0){
                lcm = i;
                break;
            }
            else
                i = i+max;
        }
        return lcm;
    }
    //Again testing
    
    
    
  
}
