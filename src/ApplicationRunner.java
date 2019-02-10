import java.util.logging.Logger;

public class ApplicationRunner {
private static Logger logger = Logger.getLogger(ApplicationRunner.class.getSimpleName());
	
	public static int byDivisionRemainder(int number) {
		
		return (number % 10) + (number % 100 / 10) + (number % 1000 / 100) + (number % 10000/ 1000) + (number % 100000 / 10000);
	}  
	
	public static int byConvertToChar(int number) {
		Integer wrappedToIntNumber = number;
		String  wrappedToStringNumber = wrappedToIntNumber.toString();
		char[] numerals = wrappedToStringNumber.toCharArray();
		 
		int sumOfNumerals = 0;
		for(char numeral: numerals) { 
			sumOfNumerals += Character.digit(numeral, 10);
			
		}  
		return sumOfNumerals;
	}
	 
	public static void main(String[] args) {
		
		int number = 12345;
		
		logger.info("By division remainder: " +byDivisionRemainder(number));
		logger.info("By convert to char: " +byConvertToChar(number));

		 
		
	} 
}
