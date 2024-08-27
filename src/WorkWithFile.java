import java.io.*;
import java.util.HashMap;

public class WorkWithFile {
    static File file = new File("words.txt");;
    static String filePath = file.getAbsolutePath();
    public static void fillHashFromFile(){ //Доделать загрузку данных из файла

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }   catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void SaveChanges(){
        try(FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write(functional.words.toString());
            System.out.println("Изменения успешно сохранены");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
