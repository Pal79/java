package fizzBuzz;

public class FizzBuzz {
	
	public String process(int number) {
		
		String msg = "";
		
		if((number % 5 ) == 0 && (number %3) == 0) {
			msg = "FizzBuzz";
		} else if((number % 5 ) == 0 && (number % 3) != 0) {
			msg = "Buzz";
		} else if((number % 5 ) != 0 && (number % 3) == 0) {
			msg = "Fizz";
		} else {
			msg = "Sem 3-al, sem pedig öttel nem osztható a megadott szám";
		}
		return msg;
	}

}
