import java.util.List;
import java.util.Optional;

public class streamterminals {
    public static void main(String args[])
    {
        List<Integer>numbers = List.of(4,2,6,7,1,9);
//        max1(numbers);
        max2(numbers);
    }

    private static void max2(List<Integer> numbers) {
        Optional<Integer> maxi = numbers.stream().reduce((num1, num2)->{
            if(num1>=num2)
                return num1;
            else
                return num2;
        }
        );
        System.out.println(maxi);
    }

    private static void max1(List<Integer> numbers) {
        Optional<Integer> maxi = numbers.stream().max((num1, num2)->Integer.compare(num1,num2));
        System.out.println(maxi);
    }
}
