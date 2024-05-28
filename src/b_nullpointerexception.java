

//         try Block: This is where you put the code that might throw an exception.
//         case1 : If there is no exception inside the try, the statements inside
//         the try are normally executed and after it control goes to statements
//         written after the catch inside the method
//         case2 : If an exception occurs in the try block, the normal flow of the program
//         stops, and control is transferred to the catch block. and after executing
//         catch statements, control goes to statements written after the catch
//         inside the method.

//         catch Block: This is where you handle the exception. You can specify what
//         to do if a particular type of exception occurs, such as logging an
//         error message or taking corrective action.

public class b_nullpointerexception {
    public static void main(String args[]){
        method1();
        System.out.println("main method ended");
    }

    private static void method1() {
        method2();
        System.out.println("method1 ended");
    }

    private static void method2() {
        try {
            String str = null;
            str.length();
        }
        catch(NullPointerException ex){
            System.out.println("Null Pointer exception");
            ex.printStackTrace();
//            This stack trace shows the sequence of method calls in the program
//            that were active when the exception occurred. By examining the stack trace,
//            developers can understand where exactly in the code the error happened
//            and what caused it.
        }
        catch (Exception ex) {
//            Exception means universal exception, means all defined exceptions
//            are caught here
            ex.printStackTrace();
            System.out.println("exception message"+ ex.getMessage());
        }
//
        System.out.println("method2 ended");
    }

}
