package WorkWithFileCSV;

import java.io.IOException;
import java.io.BufferedReader; //позволит нам считывать данные из файла
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        try { //исключение на случай если не можем читать данные из файла
            br = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\EndavaProjectMusicGroups\\groups.txt"));
            String line; //помещаем значения, которые мы будем считывать из файла (считывание по одной строке)
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.print("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error " + e);
            }
        }
    }
}
