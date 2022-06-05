package balkezesek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Feladatok {

	//3.feladat
	public int hanyAdatsor(List<Balkezesek> balkezesekLista) {
		int szamol = 0;
		
		for (Balkezesek item : balkezesekLista) {
			szamol++;
		}
		return szamol;
	}

	//4.feladat
	public void testmagCentimeter(List<Balkezesek> balkezesekLista) {
		double cm = 2.54;
		
		for (Balkezesek item : balkezesekLista) {
			System.out.println("	" + item.getNev() + ", " + (float)(item.getMagassag() * cm) + " cm");
		}
	}

	//5.feladat
	public void evszamEllenoriz() {
		int szam = szamKer();
		if(1990 <= szam && szam <= 1999) {
			System.out.println(szam);
		} else {
			System.out.println("Hibás adat!");
			szamKer();
		}
	}
	public int szamKer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Kérek egy 1990 és 1999 közötti évszámot: ");
		int bekertSzam = 0;
		try {
			bekertSzam = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bekertSzam;
	}

	public void atlagsuly(List<Balkezesek> balkezesekLista) {
		 System.out.println(atlagSzamitas(balkezesekLista));
	}
	
	public double atlagSzamitas(List<Balkezesek> balkezesekLista) {
		double visszater = 0;
		int szamol = 0;
		double[] elsoTomb = elsoEvekKonvert(balkezesekLista);
		double[] utolsoTomb = utolsoEvekKonvert(balkezesekLista);
		int i = 0;
		
		for (Balkezesek item : balkezesekLista) {
			if(elsoTomb[i] >= 1990 && utolsoTomb[i] <= 1990) {
				visszater += item.getSuly();
				szamol++;
			}
			i++;
		}
		
		return (float)visszater/szamol;
	}
	
	public double[] elsoEvekKonvert(List<Balkezesek> balkezesekLista) {
		double[] lista = new double[hanyAdatsor(balkezesekLista)];
		int i = 0;
		
		for (String item : elsoDatumLevalogat(balkezesekLista)) {
			String temp = item;
			String[] tempDarabol = temp.split("-");
				
			lista[i] = Integer.parseInt(tempDarabol[0]);
			i++;
		}
		return lista;
	}
	public double[] utolsoEvekKonvert(List<Balkezesek> balkezesekLista) {
		double[] lista = new double[hanyAdatsor(balkezesekLista)];
		int i = 0;
		
		for (String item : elsoDatumLevalogat(balkezesekLista)) {
			String temp = item;
			String[] tempDarabol = temp.split("-");
				
			lista[i] = Integer.parseInt(tempDarabol[0]);
			i++;
		}
		return lista;
	}
	
	public List<String> elsoDatumLevalogat(List<Balkezesek> balkezesekLista) {
		List<String> elsoLista = new ArrayList<String>();
		
		for (Balkezesek item : balkezesekLista) {
			elsoLista.add(item.getElso());
		}
		return elsoLista;
	}
	public List<String> masodikDatumLevalogat(List<Balkezesek> balkezesekLista) {
		List<String> masodikLista = new ArrayList<String>();
		
		for (Balkezesek item : balkezesekLista) {
			masodikLista.add(item.getElso());
		}
		return masodikLista;
	}

}
