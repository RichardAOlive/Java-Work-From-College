import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CommonAlgorithmsRevisited
{
   public static void main(String[] args)
   {
      try{
      File myFile = new File("C:\\Users\\Roliv\\Documents\\Homework\\Adv java Exam 2\\numbers.txt");
      if (myFile.createNewFile()){
         System.out.println("File created :" + myFile.getName());
     } else{
         System.out.println("File already exists");
     }
      FileWriter myWriter = new FileWriter("C:\\Users\\Roliv\\Documents\\Homework\\Adv java Exam 2\\numbers.txt");
      int n = 20;
      int[] squares = IntStream.range(-10, n)
         .map(i -> i * i)
         .toArray();

      int len = squares.length;
      for (int i = 0; i < len; i++) {
      myWriter.write(squares[i] + "\n");
      }
      System.out.println(Arrays.toString(squares));
      myWriter.close();
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

      Scanner myReader = new Scanner(myFile);

      int [] numbers = new int [30];
      int k = 0;
      while(myReader.hasNextInt()){
         numbers[k++] = myReader.nextInt();
      }
      System.out.println(Arrays.toString(numbers));
      myReader.close();
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

      int numbersSum = IntStream.of(numbers).sum();
      OptionalDouble numbersAverage = IntStream.of(numbers).average();
      OptionalInt numbersLargest = IntStream.of(numbers).max();
      OptionalInt numbersSmallest = IntStream.of(numbers).min();

      System.out.println("numbersSum: " + numbersSum);
      System.out.println("numbersAverage: " + numbersAverage);
      System.out.println("numbersLargest: " + numbersLargest);
      System.out.println("numbersSmallest: " + numbersSmallest);
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

      double[] values = { 32, 54, 67.5, 29, 35, 80, 115, 44.5, 100, 65 };
      double total = DoubleStream.of(values).sum();
      double average = DoubleStream.of(values).average().orElse(0);
      double largest = DoubleStream.of(values).max().orElse(Double.MIN_VALUE);
      double smallest = DoubleStream.of(values).min().orElse(Double.MAX_VALUE);
      System.out.println("total: " + total);
      System.out.println("average: " + average);
      System.out.println("largest: " + largest);
      System.out.println("smallest: " + smallest);

      String str = "How much wood could a woodchuck chuck?";
      long spaces = str.codePoints()
         .filter(ch -> ch == 'o')
         .count();
      System.out.println("o in str: " + spaces);
      System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

      String result = DoubleStream.of(values)
         .mapToObj(v -> "" + v)
         .collect(Collectors.joining(" | "));
      System.out.println(result);

      OptionalDouble result2 = DoubleStream.of(values)
         .filter(v -> v > 100)
         .findFirst();
      System.out.println(result2);

      n = values.length;
      int pos = IntStream.range(0, n)
         .filter(i -> values[i] == 100)
         .findFirst()
         .orElse(-1);
      System.out.println("pos: " + pos);

       }catch(IOException e) {
         System.out.println("An error occured");
         e.printStackTrace();
      }
   }
}
