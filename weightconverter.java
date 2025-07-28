import java.util.Scanner;
public class weightconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newweight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1. convert lbs to kgs: ");
        System.out.println("2. convert kgs to lbs: ");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("covnerted weight in kgs: %.2f kg\n", newweight);
        }else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newweight = weight *2.20462;
            System.out.printf("covnerted weight in lbs: %.2f lbs\n", newweight);
            



        }else {
            System.out.println("invalid choice");
        }
        scanner.close();
    } 

    
}
