import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadGroceries {
    public static void main(String[] args) {
    String path = "E:\\Groceries.txt";
   try(FileReader fileread = new FileReader(path);
      BufferedReader reader = new BufferedReader(fileread)){
        String line = reader.readLine();
        while(line != null){
            System.out.println(line);
            line = reader.readLine();
        }
    }catch(IOException e){
        System.out.println("Error reading file: " + e.getMessage());
    }
    }

}
