import java.util.Scanner;
public class MathDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter radius of circle: ");
        double radius = scanner.nextDouble();
        double result;
        //result = Math.pow(3, 5);
        //result = Math.abs(-55);
        //result = Math.round(3.14);
        //result = Math.ceil(3.14);
        //result = Math.sqrt(36);
        //result = Math.floor(4.13);
        //result = Math.max(44,55);
        
        result = Math.PI * Math.pow(radius,2);


        System.out.println(result);
        scanner.close();
    }
}         
        