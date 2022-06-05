package balkezesek;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FajlKezelo {
	
	public String fejlec = "";
	
	public List<Balkezesek> fajlOlvas(String fajlNev) {
		List<Balkezesek> balkezesekLista = new ArrayList<Balkezesek>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlNev), "UTF-8"));
			
			fejlec = br.readLine();
			
			while(br.ready()) {
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				
				Balkezesek balkezesekObj = new Balkezesek(
						sorAdatok[0],
						sorAdatok[1],
						sorAdatok[2],
						Integer.parseInt(sorAdatok[3]),
						Integer.parseInt(sorAdatok[4]));
				balkezesekLista.add(balkezesekObj);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balkezesekLista;
	}

}
