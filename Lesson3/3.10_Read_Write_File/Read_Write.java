package pp_Read_Write_File;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Read_Write {

	public static void main(String[] args) throws IOException {
            
		//To Read Text File
			FileReader reader = new FileReader("C:\\Users\\Dell\\eclipse-workspace\\Lesson3_Simplilearn_3.1\\src\\pp_Read_Write_File\\MyFile.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            
         //To Write Text File
            FileWriter writer = new FileWriter("C:\\Users\\Dell\\eclipse-workspace\\Lesson3_Simplilearn_3.1\\src\\pp_Read_Write_File\\MyFile.txt", true);
            writer.write("\r\n");
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
            
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        
            
            /*String data = "Pushpak Yogiraj Patil";
            File f1 = new File("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\Lesson3_Simplilearn_3.1\\\\src\\\\pp_Read_Write_File\\\\MyFile.txt");
            if(!f1.exists())
            {
               f1.createNewFile();
            }
            FileWriter fileWritter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write(data);
            bw.close();
            System.out.println("\n");
            System.out.println("Done");*/
	}

}
