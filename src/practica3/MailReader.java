/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailReader {
    public static ArrayList <String> read(String name) throws FileNotFoundException, IOException {
        ArrayList<String> mailList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(name)));
        String mail;
        while((mail = reader.readLine()) != null){
            if(!mail.contains("@")) continue;
            mailList.add(mail);
        }
        reader.close();
        return mailList;
        
    }
    
}
