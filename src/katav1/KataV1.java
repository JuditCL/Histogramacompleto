package katav1;

import java.io.File;

public class KataV1 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\usuario\\Desktop");
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
