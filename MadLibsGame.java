import java.util.Scanner;
public class MadLibsGame {
    public static void main(String[] args) {
        System.out.println("------Welcome to the Mad Libs Game!------");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nPlease enter a noun: ");
        String noun = scanner.nextLine();
        System.out.print("Please enter a verb: ");
        String verb = scanner.nextLine();
        System.out.print("Please enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        
      

        
        
        System.out.println("One sunny morning, a mischievous " + adjective + " squirrel decided to"
            + " embark on a grand adventure."
            + " It packed a tiny backpack with its favorite " + noun + " and set off into the enchanted forest."
            + " After walking for " + number + " hours, the squirrel spotted a giant, sparkling mushroom."
            + " It couldn't resist the urge to " + verb + " on top of it, and suddenly,"
            + " the mushroom began to glow! What an amazing day!");

        scanner.close();
        

    }
    
}
 