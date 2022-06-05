package fajlKezelesek;

import java.io.FileWriter;
import java.io.IOException;

public class FajlIro {
	
public static void main(String[] args) {
		
		//a m�sodik param�ter append kapcsol�, ha igaz,
		// akkor hozz��rja a megl�v� tartalomhoz
		try {
			FileWriter fw = new FileWriter("gumiKacsa/kimenet.txt", false);
			fw.write("alma...\r\n");
			fw.write("k�rte...\r\n");
			
			int[] tomb = {99,1,14,2};
			for (int item : tomb) {
				fw.write(String.valueOf(item));
				fw.write("\r\n");
			}
			fw.close(); //nagyon fontos a lez�r�s, ha kimarad l�trehozza, de nem �r bele semmit
			System.out.println("Elk�sz�lt a f�jl!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
