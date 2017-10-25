//zamiana liczb pobranych z pliku odczyt.txt z systemu dziesietnego na binarny oraz zapis
//do osobnego pliku zapis.txt
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;

public class ZamianaLiczbNaBinarne {
	
	public static void main(String[] args) throws FileNotFoundException{
		int i;
		File plik = new File("odczyt.txt");
		Scanner odczyt = new Scanner(plik);
		int liczba;
		String str1;
		PrintWriter zapis = new PrintWriter("zapis.txt");
		for(i=0; i<6; i++){
			liczba = odczyt.nextInt();
			str1 = Integer.toBinaryString(liczba);
			System.out.printf("%d= %s \n", liczba, str1);
			zapis.println(str1);
		}
		zapis.close();
	}

}
