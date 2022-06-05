package oopFajlAllasok;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Feladatok {
	
	//b. feladat
	public void adatokKiir(List<AllasTarolo> allasokLista) {
		for (AllasTarolo item : allasokLista) {
			System.out.print(item.getId());
			System.out.print("\t");
			System.out.print(item.getMegnevezes());
			System.out.print("\t");
			System.out.print(item.getBruttoFizetes());
			System.out.print("\t");
			System.out.print(item.getElvartTapasztalatiEvek());
			System.out.print("\t");
			System.out.print(item.getTavmunka() ? "Távmunka" : "Nincs távmunka");
			System.out.print("\t");
			System.out.printf("%tF",item.getPublikacioIdeje());
			System.out.println();
		}
	}
		
	//c. feladat
	public void allasokSzamaKiir(List<AllasTarolo> allasokLista) {
		Integer allasokSzama = allasokLista.size();
		System.out.println("Ennyi állás van a rendszerben: "+allasokSzama + " db");
	}
		
	//d. feladat
	public void maxFizetesKiir(List<AllasTarolo> allasokLista) {
		Integer maxFizetes = allasokLista.get(0).getBruttoFizetes();
		for (AllasTarolo item : allasokLista) {
			if (item.getBruttoFizetes()>maxFizetes) {
				maxFizetes = item.getBruttoFizetes();
			}
		}
			
		for (AllasTarolo item : allasokLista) {
			if (item.getBruttoFizetes().equals(maxFizetes)) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.println();
			}
		}		
	}

	//e. feladat
	public int rendszergazdaDbSzamol(List<AllasTarolo> allasokLista) {
		int db = 0;
		for (AllasTarolo item : allasokLista) {
			if (item.getMegnevezes().equals("rendszergazda")) {
				db++;
			}
		}
		return db;
	}

	//f. feladat
	public void tavmunkaAllasokKiir(List<AllasTarolo> allasokLista) {
		for (AllasTarolo item : allasokLista) {
			if (item.getTavmunka()) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.print("\t");
				System.out.print(item.getElvartTapasztalatiEvek());
				System.out.print("\t");
				System.out.print(item.getTavmunka() ? "Távmunka" : "Nincs távmunka");
				System.out.print("\t");
				System.out.printf("%tF",item.getPublikacioIdeje());
				System.out.println();
			}
		}
	}

	//g. feladat
	public double tavmunkaAtlagSzamol(List<AllasTarolo> allasokLista) {
		Integer osszeg = 0;
		Integer tavmunkaDb = 0;
		for (AllasTarolo item : allasokLista) {
			if (item.getTavmunka()) {
				tavmunkaDb++;
				osszeg += item.getBruttoFizetes();
			}
		}
		return (double)osszeg/tavmunkaDb;
	}

	//h. feladat
	public void allasokTapasztalatNelkulKiir(List<AllasTarolo> allasokLista) {
		for (AllasTarolo item : allasokLista) {
			if (item.getElvartTapasztalatiEvek()==0) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.print("\t");
				System.out.print(item.getElvartTapasztalatiEvek());
				System.out.print("\t");
				System.out.print(item.getTavmunka() ? "Távmunka" : "Nincs távmunka");
				System.out.print("\t");
				System.out.printf("%tF",item.getPublikacioIdeje());
				System.out.println();
			}
		}
	}

	//i. feladat
	public void allasokNegyEvnelTobbKiir(List<AllasTarolo> allasokLista) {
		for (AllasTarolo item : allasokLista) {
			if (item.getElvartTapasztalatiEvek()>4) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.print("\t");
				System.out.print(item.getElvartTapasztalatiEvek());
				System.out.print("\t");
				System.out.print(item.getTavmunka() ? "Távmunka" : "Nincs távmunka");
				System.out.print("\t");
				System.out.printf("%tF",item.getPublikacioIdeje());
				System.out.println();
			}
		}
	}

	public void haromHetnelRegebbiAllasokKiir(List<AllasTarolo> allasokLista) {
		Date ma = new Date();
		//System.out.println(ma);
		
		Calendar c = Calendar.getInstance();
		c.setTime(ma);
		c.add(Calendar.DATE,-21);
			
		ma = c.getTime();
		//System.out.println(ma);
			
		for (AllasTarolo item : allasokLista) {
			if (item.getPublikacioIdeje().before(ma)) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.printf("%tF",item.getPublikacioIdeje());
				System.out.println();
			}
		}
	}

	public void legfrissebbAllasIdKiir(List<AllasTarolo> allasokLista) {
		Date legujabbDatum = allasokLista.get(0).getPublikacioIdeje();
		for (AllasTarolo item : allasokLista) {
			if (item.getPublikacioIdeje().compareTo(legujabbDatum)>0) {
				legujabbDatum = item.getPublikacioIdeje();
			}
		}

		for (AllasTarolo item : allasokLista) {
			if (item.getPublikacioIdeje().compareTo(legujabbDatum)==0) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.printf("%tF",item.getPublikacioIdeje());
				System.out.println();
			}
		}
	}

	public String atlagMaxPozicioSzerintMeghataroz(List<AllasTarolo> allasokLista) {
			
		String valasz = null;
		//I. lépés: mindegyik pozicio csak 1X szerepel
			
		//1. megoldás:
//		List<String> poziciok = new ArrayList<String>();
//		for (AllasTarolo item : allasokLista) {
//			if (!poziciok.contains(item.getMegnevezes())) {
//				poziciok.add(item.getMegnevezes());
//			}
//		}
//		System.out.println(poziciok);
			
		//2. megoldás
//		List<String> megnevezesekLista = new ArrayList<String>();
//		for (AllasTarolo item : allasokLista) {
//			megnevezesekLista.add(item.getMegnevezes());
//		}
//		Set<String> poziciok = new HashSet<String>(megnevezesekLista);
//		System.out.println(poziciok);
			
		//3. megoldás
		Set<String> poziciok = new HashSet<String>();
		for (AllasTarolo item : allasokLista) {
			poziciok.add(item.getMegnevezes());
		}
		//System.out.println(poziciok);
			
		//II. lépés: pozíciók szerint átlagosan mennyit lehet keresni
		Map<String, Double> atlagPoziciokSzerint = new HashMap<String, Double>();
		for (String pozicio : poziciok) {
			Double atlagTemp = 0.0;
			Double atlagDb = 0.0;
			for (AllasTarolo item : allasokLista) {
				if (pozicio.equals(item.getMegnevezes())) {
					atlagTemp += item.getBruttoFizetes();
					atlagDb++;
				}
			}
			atlagPoziciokSzerint.put(pozicio, atlagTemp/atlagDb);
		}
		//System.out.println(atlagPoziciokSzerint);
			
		//III. lépés: maximum kiválasztás (átlag alapján)
		Double maxAtlag = 0.0;
		String maxAtlagPozicio = null;
			
		for (Map.Entry<String, Double> item : atlagPoziciokSzerint.entrySet()) {
			if (item.getValue()>maxAtlag) {
				maxAtlag = item.getValue();
				maxAtlagPozicio = item.getKey();
			}
		}
		valasz = maxAtlagPozicio + ", "+maxAtlag;
		return valasz;
	}

}
