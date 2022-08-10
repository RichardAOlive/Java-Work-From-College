import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class assign6 {

    public static void main(String args[]) {

        int n = 101;
        int[] numbers = IntStream.range(0, n)
           .toArray();

        System.out.println(Arrays.toString(numbers));
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        Stream<Integer> myStream = Arrays.stream(numbers).boxed();
        ArrayList<Integer> greaterThan50 = myStream.filter(num -> num > 50).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(greaterThan50);
        /*System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        Double avg = myStream.collect(Collectors.averagingInt());
        System.out.println(avg);
        
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////");*/
        

    }

}