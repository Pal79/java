package oopFajlAllasok;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FajlKezelo {
	
	public List<AllasTarolo> fajlBeolvas(String fajlNev) {
		
		List<AllasTarolo> allasokLista = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(fajlNev), "UTF-8"));
			
			//az elsõ sor fejléc - nincs rá szükség
			try {
				
				@SuppressWarnings("unused")
				String fejlec = br.readLine();
				
				//addig futtatjuk, amíg a fájl a fájl végéig nem érunk
				while (br.ready()) {
					
					//I. lépés: 1 sor beolvasása
					String sor = br.readLine();
					
					//ellenõrzés
					//System.out.println(sor);
					
					//II. lépés: határoló mentén szétdaraboljuk az adott sort
					String[] sorAdatok = sor.split(";");
					
					//ellenõrzés
					//System.out.println(sorAdatok[0]);
					
					Boolean tavmunkaTemp = false;
					if (sorAdatok[4].equals("1")) {
						tavmunkaTemp = true;
					}
					
					Date publikacioIdejeTemp = new SimpleDateFormat("yyyy-MM-dd").parse(sorAdatok[5]);
				
					//III. Konstruktor hívás - objektum példány feltöltése adatokkal 
					AllasTarolo allasObj = new AllasTarolo(
							Integer.parseInt(sorAdatok[0]),
							sorAdatok[1],
							Integer.parseInt(sorAdatok[2]),
							Byte.parseByte(sorAdatok[3]),
							tavmunkaTemp,
							publikacioIdejeTemp);
					
					//ellenõrzés
					//System.out.println(allasObj.getId() + " - "+allasObj.getMegnevezes());
					
					//IV. adatszerkezetbe mentés - lista, melyen belül állástárolók vannak
					allasokLista.add(allasObj);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Nem található a fájl a megadott elérési úton...");
		}
		return allasokLista;
	}

}
