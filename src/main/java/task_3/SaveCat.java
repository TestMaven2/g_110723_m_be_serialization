package task_3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class SaveCat {

    public static void main(String[] args) {

        try {

            File file = new File("cat.xml");
            file.createNewFile();

            Cat cat = new Cat(3, "Black", 4.56);

            JAXBContext context = JAXBContext.newInstance(Cat.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(cat, file);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}