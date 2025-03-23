
import java.io.FileWriter;  
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
public class DiaryWriter {
    public static void main(String[] args) {
        String diaryFile = "Diary.txt";
        try(FileWriter fileWriter = new FileWriter(diaryFile);
            BufferedWriter writer = new BufferedWriter(fileWriter) ;
            Scanner scanner = new Scanner(System.in)) {
                String input;
                while (true){
                    input = scanner.nextLine();
                    if ("END".equalsIgnoreCase(input)){
                        break;
                    }
                    writer.write(input);
                    writer.newLine();
                }
    
 }catch(IOException e){
     System.out.println("An error occurred." + e.getMessage());
 }
    }
}
