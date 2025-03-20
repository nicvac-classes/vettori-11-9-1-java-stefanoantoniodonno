import java.util.*;
import java.lang.Math;
import java.io.FileReader;
import java.io.FileWriter;

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String nomeFileLettura, nomeFileScrittura, riga;

        System.out.println("Inserire il nome del file da cui leggere ");
        nomeFileLettura = input.nextLine();
        System.out.println("Inserire il nome del file su cui srivere: ");
        nomeFileScrittura = input.nextLine();
        infile = new Scanner(new File(nomeFileLettura));
        outfile = new FileWriter(new File(nomeFileScrittura));
        do {
            riga = infile.nextLine();
            riga = inverso(riga);
            outfile.write(riga + "\n");
        } while (!!infile.hasNextLine());
        infile.close();
        outfile.close();
    }
    
    public static String inverso(String riga) {
        String agir;
        int n, i;

        n = riga.length();
        agir = "";
        for (i = n - 1; i >= 0; i--) {
            agir = agir + riga.charAt(i);
        }
        
        return agir;
    }
}

