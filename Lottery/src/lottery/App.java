package lottery;

public class App {

	public static void main(String[] args) {
		int[][] lotteryNumbers = new int[52][5];
		Numbers numbers = new Numbers();
		numbers.matrixArrayUpload(lotteryNumbers);
		
		numbers.matrixArrayWriteOut(lotteryNumbers);
	}

}
