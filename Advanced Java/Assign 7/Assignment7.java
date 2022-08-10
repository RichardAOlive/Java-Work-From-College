import java.io.*;
import java.util.Scanner;
public class Assignment7
{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\roliv\\Documents\\Homework\\Advanced Java\\Assign 7\\Sequential.txt");

        try {
            FileWriter myWriter = new FileWriter(file);

            myWriter.write("Kolmikko	snowland 88\nTohoku	JR ski ski 89\nYuki snow 87");
           // myWriter.write("Tohoku	JR ski ski 89\n");
            //myWriter.write("Yuki snow 87\n");
            System.out.println("File Created");
            myWriter.close();

           Scanner myReader = new Scanner(file);
           while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
          System.out.println("--------------------------------------------------------------------------------------------------------------------");

            RandomAccessFile rand = new RandomAccessFile("C:\\Users\\roliv\\Documents\\Homework\\Advanced Java\\Assign 7\\Random.txt", "rw");
            byte[] bytes = "Kolmikko	snowland 88\nTohoku	JR ski ski 89\nYuki snow 87".getBytes("UTF-8");
            rand.write(bytes);
            System.out.println("File Created");

            rand.seek(0);
            while(rand.getFilePointer() < rand.length()){
            String read = rand.readLine();
            System.out.println(read);
            }
            rand.close();
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        File rfile = new File("C:\\Users\\roliv\\Documents\\Homework\\Advanced Java\\Assign 7\\Random.txt");
        try {
            Scanner myScanner = new Scanner(rfile);
            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();
                System.out.println(data);
              }
            myScanner.close();
            System.out.println("--------------------------------------------------------------------------------------------------------------------");

            RandomAccessFile sfile = new RandomAccessFile("C:\\Users\\roliv\\Documents\\Homework\\Advanced Java\\Assign 7\\Sequential.txt", "r");
            sfile.seek(0);
            while(sfile.getFilePointer() < sfile.length()){
            String read = sfile.readLine();
            System.out.println(read);
            }
            sfile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}