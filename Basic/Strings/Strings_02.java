package Strings;

public class Strings_02 {
    
    public static void main(String[] args) {
        String name = "JoyBoy";
        System.out.println(name.contains("oy")); // Returns boolean value
        System.out.println(name.endsWith("oy")); // Returns boolean value
        System.out.println(name.charAt(3)); //Returns value at index three[0,1,2,3,4,5]
        System.out.println(name.indexOf("oy")); // Returns index of given value of the first occurence.
        
        System.out.println(name.concat("101")); // Appends a string to the end of another string
        System.out.println(name.toString()); //Returns the value of a String object
        System.out.println(name.trim()); //Removes whitespace from both ends of a string
        
    }
}
