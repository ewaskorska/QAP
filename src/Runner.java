import java.io.*;

public class Runner {
    public static void main(String[] args) {
        String instanceFile = "src//instances//KC10-2fl-1rl.dat";
        NSGAII nsga2 = new NSGAII(instanceFile, 100, 100,1, 0.5, 5);
        String results = "data.csv";
        try
        {
            PrintWriter out = new PrintWriter(results);
            out.println("ED, PFS, HV");
            out.println(nsga2.NSGAII());
            out.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Nie da się utworzyć pliku!");
        }
    }
}
