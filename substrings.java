import java.util.Scanner;
public class substrings{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String email;
        
       System.out.print("enter email: ");
        email = scanner.nextLine();
        if(email.contains("@")){
            System.out.println("email is valid ");
            System.out.println("the username is "+email.substring(0, email.indexOf("@")) );
            System.out.println("the domain is "+email.substring(email.indexOf("@")+1));

        }else{
            System.out.println("email is not valid");
        }

        

       scanner.close();
    }
}