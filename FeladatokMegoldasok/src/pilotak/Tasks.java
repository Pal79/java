package pilotak;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tasks {
	
	private Integer count = 0, min = 100;
	private String lastLineName;
	private SimpleDateFormat sdf = new SimpleDateFormat("Y.m.d");
	private String nemzetiseg = "";
	private Set<Integer> rajtszamok = new HashSet<Integer>();

	//3.feladat
	public int howManyDataLine(List<Pilotak> pilotakLista) {
		for (Pilotak pilotak : pilotakLista) {
			count++;
		}
		return count;
		
	}

	//4.feladat
	public String lastLinePilotName(List<Pilotak> pList) {
		lastLineName = pList.get(pList.size()-1).getNev();
		return lastLineName;
	}

	//5.feladat
	public void bornBeforeNineteenthCentury(List<Pilotak> pList) {
		try {
			for (Pilotak pilotak : pList) {
				Date bornDate = sdf.parse(pilotak.getSzuletesi_datum());
					
				if(bornDate.before(sdf.parse("1901.01.01"))) {
					System.out.println("\t" + pilotak.getNev() + " (" + pilotak.getSzuletesi_datum() + ")");
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//6.feladat
	public String lowerStartNumberPilotNation(List<Pilotak> pList) {
		for (Pilotak pilotak : pList) {
			if(pilotak.getRajtszam() != null) {
				if(min > pilotak.getRajtszam()) {
					min = pilotak.getRajtszam();
				}
			}
		}
		//System.out.println(min);
		for (Pilotak pilotak : pList) {
			if(pilotak.getRajtszam()!=null) {
				rajtszamok.add(pilotak.getRajtszam());
				if(pilotak.getRajtszam().equals(min)) {
					nemzetiseg = pilotak.getNemzetiseg();
				}
			}
		}
		return nemzetiseg;
	}

	//7.feladat
	public void whichStartNumbersEgal(List<Pilotak> pList) {
		for (Integer rajtszam : rajtszamok) {
			count = 0;
			for (Pilotak pilota : pList) {
				if(pilota.getRajtszam() == rajtszam) {
					count++;
				}
			}
			if(count > 1) {
				System.out.print(rajtszam + ", ");
			}
		}
	}
	
//	public void fajlKiir(List<Pilotak> pilotak) {
//		for (Pilotak pilotak2 : pilotak) {
//			System.out.print(pilotak2.getNev() + ";");
//			System.out.print(pilotak2.getSzuletesi_datum() + ";");
//			System.out.print(pilotak2.getNemzetiseg() + ";");
//			System.out.println(pilotak2.getRajtszam());
//		}
//	}
	
}
