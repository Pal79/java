package jackie;

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

public class FileOperations {
	
	public String header = "";
	
	//2.feladat
	public List<JackieStewart> fileRead(String fileName) {
		List<JackieStewart> jackieList = new ArrayList<JackieStewart>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			
			header = br.readLine();
			
			while(br.ready()) {
				String row =  br.readLine();
				String[] rowDatas = row.split("	");
				
				JackieStewart jackieObj = new JackieStewart(
						Integer.parseInt(rowDatas[0]),
						Integer.parseInt(rowDatas[1]),
						Integer.parseInt(rowDatas[2]),
						Integer.parseInt(rowDatas[3]),
						Integer.parseInt(rowDatas[4]),
						Integer.parseInt(rowDatas[5]));
				
				jackieList.add(jackieObj);
			}
			br.close();
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
		return jackieList;
	}
	
	//6.feladat
	public void fileWrite(List<JackieStewart> jackieList) {
		try {
			FileOutputStream fs = new FileOutputStream("jackie.html");
			OutputStreamWriter out = new OutputStreamWriter(fs, "UTF-8");
			
			String lineBreak = "\n";
			String tab = "\t";
			
			out.write("<!doctype html>" + lineBreak);
			out.write("<html>" + lineBreak);
			out.write(tab + "<head>" + lineBreak);
			out.write(tab+tab + "<style>td {border:1px solid black;}</style>" + lineBreak);
			out.write(tab + "</head>" + lineBreak+lineBreak);
			
			out.write(tab + "<body>" + lineBreak);
			out.write(tab+tab + "<h1>Jackie Stewart</h1>" + lineBreak);
			out.write(tab+tab + "<table>" + lineBreak);
			
			for (JackieStewart item : jackieList) {
				out.write(tab+tab+tab + "<tr>");
				out.write("<td>" + item.getYear() + "</td>");
				out.write("<td>" + item.getRaces() + "</td>");
				out.write("<td>" + item.getWins() + "</td>");
				out.write("<td>" + item.getPodiums() + "</td>");
				out.write("<td>" + item.getPoles() + "</td>");
				out.write("<td>" + item.getFastests() + "</td>");
				out.write("</tr>" + lineBreak);
			}
			
			out.write(tab+tab + "</table>" + lineBreak);
			out.write(tab + "</body>" + lineBreak);
			out.write("</html>");
			
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
		System.out.println("jackie.html");
	}

}
