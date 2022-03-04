import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =new ArrayList<>();
        int i;
        for (i = 0; i < 100; i++){
            numbers.add(i+1);
        }

//        evenNumber(numbers); //Bilangan Genap
//        startWithOne(numbers); //Diawali Angka 1
//        sumNumber(numbers); //Jumlah
//        sortedNumbers(numbers); //Sorted
    }

    public static void evenNumber(List<Integer> numbers){
        numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
    }

    public static void startWithOne(List<Integer> numbers){
        numbers.stream().filter(n -> n.toString().startsWith("1")).forEach(System.out::println);
    }

    public static void sumNumber(List<Integer> numbers){
        System.out.println(numbers.stream().reduce(0, (a, b) -> a +b));
    }

    public static void sortedNumbers(List<Integer> numbers){
        numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
