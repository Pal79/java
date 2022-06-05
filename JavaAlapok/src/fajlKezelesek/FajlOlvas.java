package fajlKezelesek;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FajlOlvas {
	
public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream("gumiKacsa/adatok.txt"),"UTF-8"));
			//amíg van következõ sor a fájlban, addig fut
			while (br.ready()) {
				String sor = br.readLine();
				System.out.println(sor);
			}
			br.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Nem találom a fájlt a megadott elérési úton!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}

}
