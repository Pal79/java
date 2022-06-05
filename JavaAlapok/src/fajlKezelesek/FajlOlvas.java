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
			//am�g van k�vetkez� sor a f�jlban, addig fut
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
			System.out.println("Nem tal�lom a f�jlt a megadott el�r�si �ton!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}

}
