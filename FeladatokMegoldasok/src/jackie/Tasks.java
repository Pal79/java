package jackie;

import java.util.List;

public class Tasks {

	//3.feladat
	public int howManyDataRow(List<JackieStewart> jackieList) {
		int count = 0;
		for (JackieStewart item : jackieList) {
			count++;
		}
		return count;
	}

	//4.feladat
	public int whichYearMoreRaces(List<JackieStewart> jackieList) {
		int max = 0;
		int year = 0;
		for (JackieStewart item : jackieList) {
			if(max < item.getRaces()) {
				max = item.getRaces();
			}
		}
		for (JackieStewart item : jackieList) {
			if(max == item.getRaces()) {
				year = item.getYear();
			}
		}
		return year;
	}

	//5.feladat
	public void whichDecadeHowSuccessful(List<JackieStewart> jackieList) {
		int sixtyYears = 0;
		int seventyYears = 0;
		
		for (JackieStewart item : jackieList) {
			if(1960 <= item.getYear() && 1970 > item.getYear()) {
				sixtyYears += item.getWins() ;
			} else {
				seventyYears += item.getWins();
			}
		}
		
		System.out.println("	60-as évek: " + sixtyYears + " megnyert verseny");
		System.out.println("	70-as évek: " + seventyYears + " megnyert verseny");
	}

}
