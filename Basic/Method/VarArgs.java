package Method;

public class VarArgs {

    /*
     * static int add(int a, int b){
     * return a+b;
     * }
     * 
     * static int add(int a, int b,int c){
     * return a+b;
     * }
     * 
     * static int add(int a, int b,int c ,int d){
     * return a+b;
     * }
     * 
     * Instead of making muliple methods we Use VarArgs(...)variable arguments
     */
    // can also do int add(int x,int...arr) for atlest one input
    
    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Addition of notheing is: "+add());
        System.out.println(add(1, 2));
        System.out.println(add(2, 3, 4));
        System.out.println(add(2, 4, 8, 16));
    }
}
