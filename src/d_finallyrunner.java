//        try {
//        // Code that might throw an exception
//        } catch (ExceptionType e) {
//        // Code to handle the exception
//        } finally {
//        // Code that will always be executed
//        }


//        How finally works:
//        Execution: The code in the finally block will always be executed after
//         the try block and any associated catch blocks, regardless of whether an
//         exception was thrown or caught.
//        Resource Cleanup: Commonly used for closing resources like files, network
//         connections, or database connections to ensure they are closed properly
//         even if an exception occurs.

//       You may get doubt that Why there is separate necessity for finally....?
//       because if statements inside the finally are written normally after the
//       catch without keeping inside finally also have the same property right?
//        Sol:The code in a finally block is guaranteed to execute even if the try or
//        catch blocks contain return, break, continue, or throw statements.

import java.util.Scanner;

public class d_finallyrunner {
    public static void main(String args[]){
        Scanner sc=null;
        try {
            sc = new Scanner(System.in);
            int[] num = {12, 13, 14, 15};
            int x = num[5];
        }
        catch(Exception e){
            System.out.println("Exception occured");
            e.printStackTrace();
        }
        finally {
            System.out.println("Scanner going to close");
            sc.close();
        }
        System.out.println("main method completed");
    }
}
