public class string {
    public static void main(String[] args) {
        String name = "     dishanta     ";
        int length = name.length();// to find the length of a string 
        char letter = name.charAt(4); // to print a special character from a string.index start from 0.
        int lastindex = name.lastIndexOf("a") ;// to print the last index of a letter.
        String name2 = name.toLowerCase();// convert all char to lowercase.
        name2 = name.toUpperCase();// convert all char to uppercase.
        String name3 = name.trim();// it trim the space .
        name = name.replace("i", "e");// replace the target word with another word.
        System.out.println(name);
        System.out.println(name3);
        System.out.println(name2);
        System.out.println(length);
        System.out.println(letter);
        System.out.println(lastindex);
        

        // more fucntions like .equals its case sensitive if want to ignore just type 
        // .equalsIgnoreCase, .contains,   .isEmpty 

    }
}