public class c_arrayoutofbounds {
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
            int[] i = {1,2};
            int number = i[3];
        }
        catch(NullPointerException ex){
            System.out.println("Null Pointer exception");
            ex.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array out of bounds exception");
            ex.printStackTrace();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("method2 ended");

    }

}
