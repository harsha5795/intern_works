import java.util.List;

public class FPnumber_runner {
    public static void main(String[] args){
        List<Integer> numbers = List.of(4,6,8,13,3,8,6,15);
//        fpsum1(numbers);
//        fpsum2(numbers);
//        sortednumbers(numbers);
//        distinctnumbers(numbers);
//        mappingnumbers(numbers);

    }

    private static void mappingnumbers(List<Integer> numbers) {
        numbers.stream().map(e -> e*e).forEach(e -> System.out.println(e));
    }

    private static void distinctnumbers(List<Integer> numbers) {
        numbers.stream().distinct().forEach(e -> System.out.println(e));
    }

    private static void sortednumbers(List<Integer> numbers) {
        numbers.stream().sorted().forEach(e -> System.out.println(e));
    }

    private static void normalsum(List<Integer> numbers) {
        int sum=0;
        for(int num: numbers){
            sum += num;
        }
        System.out.println(sum);
    }
    private static void fpsum1(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, (num1, num2) -> num1+num2);
        System.out.println(sum);
    }

    private static void fpsum2(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, (num1, num2) -> {
            System.out.println("num1:" + num1 + " " + "num2:" + num2);
            return num1+num2;
        }
        );
        System.out.println(sum);
    }




}
