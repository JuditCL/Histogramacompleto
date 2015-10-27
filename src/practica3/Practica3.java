package practica3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Practica3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pathname="C:\\Users\\usuario\\Desktop\\email.txt";
        ArrayList<String> maillist = MailReader.read(pathname);
        Histogram<String> histogram = MailHistogramBuilder.build(maillist);
        HistogramDisplay hitodisplay = new HistogramDisplay(histogram);
        hitodisplay.execute();
    }
    
    
}
