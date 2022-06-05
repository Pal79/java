package nobelDijak;

import java.util.List;

public class App {
	
	public static void main(String[] args) {
		FileOperations foObj = new FileOperations();
		List<Nobel> nobelList = foObj.fileRead("nobel.csv");
		Tasks tasksObj = new Tasks();
		
		System.out.print("3.feladat: ");
		System.out.println(tasksObj.arthurBMcdonaldNobelType(nobelList));
		
		System.out.print("4.feladat: ");
		System.out.println(tasksObj.whoGetNobel2017(nobelList));
		
		System.out.println("5.feladat: ");
		tasksObj.whichOrganizationFrom1990OurDays(nobelList);
		
		System.out.println("6.feladat: ");
		tasksObj.curieFamilyFeesAndYears(nobelList);
		
		System.out.println("7.feladat:");
		tasksObj.whichFeeHowManyAll(nobelList);
		
		System.out.print("8.feladat: ");
		foObj.fileWrite(nobelList);
	}

}
