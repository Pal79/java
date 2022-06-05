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
			
			//az els� sor fejl�c - nincs r� sz�ks�g
			try {
				
				@SuppressWarnings("unused")
				String fejlec = br.readLine();
				
				//addig futtatjuk, am�g a f�jl a f�jl v�g�ig nem �runk
				while (br.ready()) {
					
					//I. l�p�s: 1 sor beolvas�sa
					String sor = br.readLine();
					
					//ellen�rz�s
					//System.out.println(sor);
					
					//II. l�p�s: hat�rol� ment�n sz�tdaraboljuk az adott sort
					String[] sorAdatok = sor.split(";");
					
					//ellen�rz�s
					//System.out.println(sorAdatok[0]);
					
					Boolean tavmunkaTemp = false;
					if (sorAdatok[4].equals("1")) {
						tavmunkaTemp = true;
					}
					
					Date publikacioIdejeTemp = new SimpleDateFormat("yyyy-MM-dd").parse(sorAdatok[5]);
				
					//III. Konstruktor h�v�s - objektum p�ld�ny felt�lt�se adatokkal 
					AllasTarolo allasObj = new AllasTarolo(
							Integer.parseInt(sorAdatok[0]),
							sorAdatok[1],
							Integer.parseInt(sorAdatok[2]),
							Byte.parseByte(sorAdatok[3]),
							tavmunkaTemp,
							publikacioIdejeTemp);
					
					//ellen�rz�s
					//System.out.println(allasObj.getId() + " - "+allasObj.getMegnevezes());
					
					//IV. adatszerkezetbe ment�s - lista, melyen bel�l �ll�st�rol�k vannak
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
			System.out.println("Nem tal�lhat� a f�jl a megadott el�r�si �ton...");
		}
		return allasokLista;
	}

}
