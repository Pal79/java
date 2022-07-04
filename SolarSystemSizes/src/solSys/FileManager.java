package solSys;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
	public List<SolarSystemSizes> solSysSize(String fileName) {
		
		List<SolarSystemSizes> solSysSizeList = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			
			String header = br.readLine();
			
			while(br.ready()) {
				String row = br.readLine();
				String[] rowDatas = row.split("\t");
				
				SolarSystemSizes solSysObj = new SolarSystemSizes(
					rowDatas[0],
					rowDatas[1],
					rowDatas[2]
				);
				solSysSizeList.add(solSysObj);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return solSysSizeList;
	}
}
