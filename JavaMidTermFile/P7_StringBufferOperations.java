/*7. Apply following functions on StringBuffer object "HELLO"
(i) Append "Java"
(ii) Insert "Java" at index 1
(iii) Replace with "Java" with characters between index 1 to 2
(iv) Delete characters between index 1 and 2 
(v) Reverse the string "HELLO"*/

public class P7_StringBufferOperations {
    public static void main(String[] args) {
		StringBuffer Temp = new StringBuffer("HELLO");
		Temp.append("Java");
		System.out.println(Temp);
		
		Temp = new StringBuffer("HELLO");
		Temp.insert(1, "Java");
		System.out.println(Temp);
		
		Temp = new StringBuffer("HELLO");
		Temp.replace(1, 2, "Java");
		System.out.println(Temp);
		
		Temp = new StringBuffer("HELLO");
		Temp.delete(1, 2);
		System.out.println(Temp);
		
		Temp = new StringBuffer("HELLO");
		Temp.reverse();
		System.out.println(Temp);
	}
}
