import java.io.*;

public class FileIO {

    public static void main(String[] args) throws IOException {

        String [] str = {"Benjamin" , "amin" ,"hassan"};
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        for (int i = 0; i<str.length ; i++) {
            writer.write(str[i]+"\n");

        }
        writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line ;

        while((line = reader.readLine()) != null) {

            System.out.println(line);
        }
        reader.close();


        }
}