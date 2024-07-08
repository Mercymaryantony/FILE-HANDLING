import java.io.FileWriter;
import java.io.FileReader;
public class file{
    public static void main(String[] args)
    {
        String file="f.txt";
        try{
            FileWriter fw = new FileWriter(file);
            fw.write("India is my country.");
            fw.write("\nAll Indians are my brothers and sisters.");
            fw.write("\nI love my country.");
            fw.close();
            System.out.println("Successfully written");
            FileReader fr=new FileReader(file);
            int ch;
            while((ch=fr.read())!=-1)
            {
                System.out.print((char)ch);
            }
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR:"+e.getMessage());
        }

    }
}