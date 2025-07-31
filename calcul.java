import java.util.Scanner;
public class calcul{
    public static void main(String[] args){

    
    Scanner scanner = new Scanner(System.in);

    double num1;
    double num2;
    char operator;
    double result = 0;
    boolean IsValid = true;
    

    System.out.print("Enter first number: ");
    num1 = scanner.nextDouble();

    System.out.print("enter the operator {*, +, -, /}: ");
    operator = scanner.next().charAt(0);
    
    System.out.print("Enter second number: ");
    num2 = scanner.nextDouble();    

    switch(operator){
        case '+' -> result = num1 + num2;
        
        case '*' -> result = num1 * num2;

        case '-' -> result = num1 - num2;
        
        case '/' -> {if(num2 == 0){
            System.out.println("error cannot divide by 0");
            IsValid = false;
        }else{
            result = num1/num2;
        }}
        default -> { System.out.println("Invalid operator");
        IsValid = false; 

        }
    }
    if(IsValid){
    System.out.println(result);

    }    


    scanner.close();
    }
 

}