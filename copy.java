import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copy {
	public static void main(String[] args)
	{
        try 
        {
			FileReader fr = new FileReader("a.txt");

			FileWriter fw = new FileWriter("b.txt");

			String str = "";

			int i;

			while ((i = fr.read()) != -1)
            {
            	str += (char)i;
			}

			fw.write(str);

			fr.close();
			fw.close();

			System.out.println("File reading and writing both done");
		}
		catch (IOException e) 
        {
			System.out.println("There are some IOException");
		}
	}
}
