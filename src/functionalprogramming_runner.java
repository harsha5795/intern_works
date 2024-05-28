import java.util.List;

public class functionalprogramming_runner {

    public static void main(String args[]){
        List<String> list = List.of("apple", "banana", "cat", "dog");
        printwithFPwithfiltering(list);
    }

    private static void printbasic(List<String> list) {
        for(String string: list){
            System.out.println(string);
        }
    }

    private static void printwithFP(List<String> list) {
        list.stream().forEach(
                element -> System.out.println("element - " + element)
        );
//       here think of forEach as function name and written inside
//       it is function definition which is syntax of a lamda expression
    }

    private static void printwithFPwithfiltering(List<String> list) {
        list.stream().filter(
                element -> element.endsWith("at")
        ).forEach(
                element -> System.out.println("element - " + element)
        );
    }
}
