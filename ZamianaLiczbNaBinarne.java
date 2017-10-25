//zamiana liczb pobranych z pliku liczby.txt z systemu dziesietnego na binarny oraz zapis
//do osobnego pliku binarne.txt
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;

public class ZamianaLiczbNaBinarne {
	
	public static void main(String[] args) throws FileNotFoundException{
		int i;
		File plik = new File("liczby.txt");
		Scanner odczyt = new Scanner(plik);
		int liczba;
		String str1;
		PrintWriter zapis = new PrintWriter("binarne.txt");
		for(i=0; i<6; i++){
			liczba = odczyt.nextInt();
			str1 = Integer.toBinaryString(liczba);
			System.out.printf("%d= %s \n", liczba, str1);
			zapis.println(str1);
		}
		zapis.close();
	}

}
