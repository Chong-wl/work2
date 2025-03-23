import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class FormatGroceries {

    public static void main(String[] args){
        String inputFile = "E:\\Groceries.txt";
        String outputFile = "E:\\FormattedGroceries.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("| ID | Item | Quantity(KG) | Price(€) |");
            writer.newLine();
            writer.write("| --- | --- | --- | --- |");
            writer.newLine();
            writer.write("|  |  |  | ************************************** |");
            writer.newLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if(parts.length == 4){
                    writer.write("| " + parts[0] + " | " + parts[1] + " | " + parts[2] + " | " + parts[3] + " |");
                    writer.newLine(); 
                }
            }
            writer.write("*********************************************************** The groceries are formatted successfully ***********************************************************");
        } catch (IOException e) {
            System.out.println("An error occurred." + e.getMessage());
    }
  }
}

