package alapok;

import java.util.Random;

public class VeletlenSzamok {

public static void main(String[] args) {
		
		/**************************************************/
		/*********** V�letlen sz�mok gener�l�sa **********/
		/************************************************/

		//new oper�tor mem�ria ter�let foglal�s - p�ld�nyos�t�s
		//r n�ven l�trej�n az objektum
		//pszeud� v�letlen sz�m - �l v�letlen
		Random r = new Random();
		
		//egy db v�letlen sz�m gener�l�sa 1-100 k�z�tt
		int tesztVelSzam = r.nextInt(100)+1;
		System.out.println("V�letlen sz�m 1-100: " + tesztVelSzam);
		
		//1-2 k�z�tti tartom�nyban v�letlen sz�m:
		int tesztVelSzam2 = r.nextInt(2)+1;
		System.out.println("V�letlen sz�m 1-2: " + tesztVelSzam2);
		
		//5-10 k�z�tti tartom�nyban v�letlen sz�m:
		int tesztVelSzam3 = r.nextInt((10-5)+1)+5;
		System.out.println("V�letlen sz�m 5-10: " + tesztVelSzam3);
		
		//�ltal�nos k�plet: 
		//r.nextInt((max-min)+1)+min;
	}
	
}
