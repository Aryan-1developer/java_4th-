import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // FileWriter + BufferedWriter
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("How many strings do you want to enter? ");
            int n = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Strings:");

            for (int i = 1; i <= n; i++) {

                String str = sc.nextLine();

                bw.write(str);
                bw.newLine();
            }

            bw.close();

            System.out.println("\nData written successfully into file.");

            // FileReader
            FileReader fr = new FileReader("data.txt");

            int ch;

            System.out.println("\nReading Data From File:\n");

            while ((ch = fr.read()) != -1) {

                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {

            System.out.println("Error: " + e);
        }
    }
}