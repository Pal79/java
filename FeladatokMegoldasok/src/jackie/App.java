package jackie;

import java.util.List;

public class App {
	
	public static void main(String[] args) {
		FileOperations foObj = new FileOperations();
		List<JackieStewart> jackieList = foObj.fileRead("jackie.txt");
		Tasks tasksObj = new Tasks();
		
		System.out.print("3.feladat: ");
		System.out.println(tasksObj.howManyDataRow(jackieList));
		
		System.out.print("4.feladat: ");
		System.out.println(tasksObj.whichYearMoreRaces(jackieList));
		
		System.out.println("5.feladat: ");
		tasksObj.whichDecadeHowSuccessful(jackieList);
		
		System.out.print("6.feladat: ");
		foObj.fileWrite(jackieList);
	}

}
