
//throws keyword:
//    a)private static void method() throws interrupted exception
//      private static void method() throws runtime exception
//    in the above its like saying to compiler that the method may throws an exception
//    b)throw new RuntimeException("some string");
//    Once the above line is executed, the program stops running and throws an exception

//Handling an exception:
//    its like handling the exception using try catch

//Basically there are 2 types of exceptions
//1.Runtime exceptions or unchecked exceptions:
//Compiler wont complains about Runtime exception. Its users responsibility to know
//about them by own otherwise leads to runtime errors
//Ex:Null pointer exception,  array out of bounds
//2.Interupted exceptions or checked exceptions:
//If a particular method can throw interrupted exceptions, then compiler wont allow the
//program to run.
//for the compiler to allow program to run, either
//a)We should be handling the interrupted error in the method itself.
//b)We should mention throws keyword in that method signature and also in its parent
//  methods signature and no need of mentioning in child methods because if childs
//  function call is before the exception in present method, then child call successfully
//  executed and if childs call is after the exception in present then it wont even called






public class e_interupted_or_checked_exception {


    private static void method1() throws InterruptedException{
        Thread.sleep(2000);
    }
    private static void method2(){
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws InterruptedException{
        method1();
        method2();
    }
}
