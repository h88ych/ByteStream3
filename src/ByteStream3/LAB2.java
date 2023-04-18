
package ByteStream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB2 {
//    public static void main(String[] args) throws FileNotFoundException  {
//        FileOutputStream output = new FileOutputStream("data.dat");
//    }
      
    public static void main(String[] args) throws IOException  {
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            String s = "Hello World";
            byte[] b = s.getBytes();
            output.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
             FileInputStream input = new FileInputStream("data.dat");
            int value;
            while((value = input.read()) != -1){
                System.out.println((char)value);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
