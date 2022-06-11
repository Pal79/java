package prime;

public class Prime {
	
	public void isPrime(int num) {
	    boolean prim = true;
	    
	    if (num == 1 || num == 0) {
	    	System.out.println("Az adott szám: " + num + ", nem prímszám!");
	    	prim = false;
	    } else {
	    	for (int j = 2; j <= Math.sqrt(num); j++) {
	    		if (num % j == 0) {
	    			prim = false;
	    			System.out.println("Az adott szám: " + num + ", nem prímszám!");
	    			break;
	    		}
	    	}
	    	if(prim == true) {
	    		System.out.println("Az adott szám: " + num + ", prímszám!");
	    	}
	    }
	}
	
	public void primesWriteOut(int num) {
		boolean isPrime = true;
		int count = 0;
		
		for(int i = 2; i <= num; i++) {
			isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public void primesCount(int num) {
		boolean isPrime = true;
		int count = 0;
		
		for(int i = 2; i <= num; i++) {
			isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				count++;
			}
		}
		System.out.println("Összesen " + count + " prím van 1 és " + num + " között!");
	}
}
