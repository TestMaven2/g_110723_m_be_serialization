package task_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;

public class SaveCat {

    public static void main(String[] args) {

        try {

            File file = new File("cat.json");
            file.createNewFile();
            Cat cat = new Cat(3, "Black", 4.56);

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, cat);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}