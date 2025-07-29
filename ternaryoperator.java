import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          double maths;
          double science;
          double english;
          String student_name;
          Double totalmarks;
          
        System.out.print("enter student name: ");
        student_name = scanner.nextLine();
        System.out.println(student_name);
        

        System.out.print("enter maths marks out of 100: ");
        maths = scanner.nextDouble();
       
        System.out.print("enter science marks out of 100: ");
        science = scanner.nextDouble();

        System.out.print("enter english marks out of 100: ");
        english = scanner.nextDouble();

        totalmarks = maths + science + english;

        String PassOrFail = (totalmarks >= 80) ? "pass" : "fail";

        System.out.println(PassOrFail);
        scanner.close();

// variable = (condition) ? IfTrue : IfFalse;


    }
    
}
