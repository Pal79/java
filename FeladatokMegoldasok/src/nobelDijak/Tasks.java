package nobelDijak;

import java.util.List;

public class Tasks {
	
	private String fee = "";
	private Integer fizikai = 0, kemiai = 0, orvosi = 0, irodalmi = 0, beke = 0, kozgazdasagtani = 0;

	//3.feladat
	public String arthurBMcdonaldNobelType(List<Nobel> nobelList) {
		String name = "Arthur B. McDonald";
		for (Nobel nobel : nobelList) {
			if((nobel.getKeresztnev() + " " + nobel.getVezeteknev()).equals(name)) {
				fee = nobel.getTipus();
			}
		}
		return fee;
	}

	//4.feladat
	public String whoGetNobel2017(List<Nobel> nobelList) {
		for (Nobel nobel : nobelList) {
			if(nobel.getEv().equals(2017) && nobel.getTipus().equals("irodalmi")) {
				fee = nobel.getKeresztnev() + " " + nobel.getVezeteknev(); 
			}
		}
		return fee;
	}

	//5.feladat
	public void whichOrganizationFrom1990OurDays(List<Nobel> nobelList) {
		for (Nobel nobel : nobelList) {
			if(nobel.getVezeteknev().equals(" ") && nobel.getEv() > 1990) {
				System.out.println("\t" + nobel.getKeresztnev());
			}
		}
	}

	//6.feladat
	public void curieFamilyFeesAndYears(List<Nobel> nobelList) {
		for (Nobel nobel : nobelList) {
			if(nobel.getVezeteknev().contains("Curie")) {
				System.out.println("\t" + nobel.getEv() + ": " + nobel.getKeresztnev() + " " + nobel.getVezeteknev() + " (" + nobel.getTipus() + ")");
			}
		}
	}

	//7.feladat
	public void whichFeeHowManyAll(List<Nobel> nobelList) {
		System.out.println("\tfizikai: " + Count("fizikai", fizikai, nobelList) + " db");
		System.out.println("\tkémiai: " + Count("kémiai", kemiai, nobelList) + " db");
		System.out.println("\torvosi: " + Count("orvosi", orvosi, nobelList) + " db");
		System.out.println("\tirodalmi: " + Count("irodalmi", irodalmi, nobelList) + " db");
		System.out.println("\tbéke: " + Count("béke", beke, nobelList) + " db");
		System.out.println("\tközgazdaságtani: " + Count("közgazdaságtani", kozgazdasagtani, nobelList) + " db");
	}
	
	public static int Count(String typeName, Integer count, List<Nobel> nobelList) {
		for (Nobel nobel : nobelList) {
			if(nobel.getTipus().equals(typeName)) {
				count++;
			}
		}
		return count;
	}

}
