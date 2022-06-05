package pilotak;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
	
	public String header = "";
	public BufferedReader br;
	
	public List<Pilotak> fajlOlvas(String fileName) {
		List<Pilotak> pList = new ArrayList<Pilotak>();
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			header = br.readLine();
			
			while(br.ready()) {
				String line = br.readLine();
				String[] lineSplit = line.split(";");
				
				//Date bornDate = new SimpleDateFormat("yyyy-MM-dd").parse(lineSplit[1]);
				
				try {
					Pilotak pObj = new Pilotak(
							lineSplit[0],
							lineSplit[1],
							lineSplit[2],
							Integer.parseInt(lineSplit[3]));
					pList.add(pObj);
				} catch (ArrayIndexOutOfBoundsException e) {
					Pilotak pObj = new Pilotak(
							lineSplit[0],
							lineSplit[1],
							lineSplit[2],
							null);
					pList.add(pObj);
				}
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
		
		return pList;
	}

}
