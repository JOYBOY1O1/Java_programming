/*6. Apply following functions on the String "Java".
(i) Try to concat "Welcome" and write down your observation.
(ii) Find character at index 1
(iii) Find index of first 'a'.
(iv) Find index of second 'a'
(v) Compare "Java" to "JAVA"
(vi) Compare "Java" to "JAVA" ignoring the case
(vii) Find the index of first 'a' from last*/

public class P6_StringOperations {
	
    static String TEST = "Java";

	public static void main(String[] args) {
		String concat_String1 = TEST + " Welcome";
        String concat_String2 = TEST.concat(" Welcome");
        
		System.out.println(concat_String1);
        System.out.println(concat_String2);
		
		char ch = TEST.charAt(1);
		System.out.println(ch);
		
		int index_of_first_a = TEST.indexOf('a');
		System.out.println(index_of_first_a);
		
		int index_of_second_a = TEST.indexOf('a', index_of_first_a + 1);
		System.out.println(index_of_second_a);
		
		boolean Case_Sensitive = TEST.equals("JAVA");
		System.out.println(Case_Sensitive);

		boolean Case_Insensitive = TEST.equalsIgnoreCase("JAVA");
		System.out.println(Case_Insensitive);
		
		int index_of_last_a = TEST.lastIndexOf('a');
		System.out.println(index_of_last_a);
	}

}
