public class a_exceptionhandlingRunner {
    public static void main(String args[]){
        method1();
        System.out.println("main method ended");
    }

    private static void method1() {
        method2();
        System.out.println("method1 ended");
    }

    private static void method2() {
        String str = null;
        str.length(); //throws an exception
        System.out.println("method2 ended");
//        because of exception in line str.length() anything written after it cannot
//        be run due to runtime error
    }

}
