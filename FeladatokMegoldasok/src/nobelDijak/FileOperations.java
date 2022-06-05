package nobelDijak;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import pilotak.Pilotak;

public class FileOperations {
	
	private List<Nobel> nobelList = new ArrayList<Nobel>();
	private BufferedReader br;
	public String fejlec = "";
	private String line;
	private String[] lineSplit;
	
	//2.feladat
	public List<Nobel> fileRead(String fileName) {
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			fejlec = br.readLine();
			
			while(br.ready()) {
				line = br.readLine();
				lineSplit = line.split(";");

				try {
					Nobel nobelObj = new Nobel(
							Integer.parseInt(lineSplit[0]),
							lineSplit[1],
							lineSplit[2],
							lineSplit[3]);
					nobelList.add(nobelObj);
				} catch(ArrayIndexOutOfBoundsException e) {
					Nobel nobelObj = new Nobel(
							Integer.parseInt(lineSplit[0]),
							lineSplit[1],
							lineSplit[2],
							" ");
					nobelList.add(nobelObj);
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
			//e.printStackTrace();
			System.out.println("Beolvasási hiba!" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Túl illetve alul indexelés hiba! " + e);
			e.printStackTrace();
		}
		return nobelList;
	}
	
	//8.feladat
	public void fileWrite(List<Nobel> nobelList) {
		try {
			FileOutputStream fs = new FileOutputStream("orvosi.txt");
			OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");
			
			try {
				for (Nobel nobel : nobelList) {
					if(nobel.getTipus().equals("orvosi")) {
						out.write(nobel.getEv() + ": " + nobel.getKeresztnev() + " " + nobel.getVezeteknev() + "\n");
					}
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				for (Nobel nobel : nobelList) {
					if(nobel.getTipus().equals("orvosi")) {
						out.write(nobel.getEv() + ": " + nobel.getKeresztnev() + "\n");
					}
				}
			}
			
			out.close();
			fs.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("orvosi.txt");
	}

}
