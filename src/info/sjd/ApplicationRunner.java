package info.sjd;
import java.util.logging.Logger;

public class ApplicationRunner {
private static Logger logger = Logger.getLogger(ApplicationRunner.class.getSimpleName());
	
	public static int byDivisionRemainder(Integer number) {
		String valueByString = number.toString();
		int amountOfNumerous = valueByString.length();
		int result = 0;
		while(amountOfNumerous != 0) {
			result += number % Math.pow(10, amountOfNumerous) / Math.pow(10,  amountOfNumerous - 1);
			amountOfNumerous--; 
		}
		return result;
	}  
	
	public static int byConvertToChar(int number) {
		Integer wrappedToIntNumber = number;
		String  wrappedToStringNumber = wrappedToIntNumber.toString();
		char[] numerals = wrappedToStringNumber.toCharArray();
		  
		int sumOfNumerals = 0;
		for(char numeral: numerals) { 
			sumOfNumerals += Character.getNumericValue(numeral);
			
		}  
		return sumOfNumerals;
	}
	 
	public static int findPalindrom(int value1, int value2) {
		 
		Integer value = value1 * value2;
		String stringValue = value.toString();
		char[] arrOfNumerals = stringValue.toCharArray();

		Integer maxPalindrom = 0;
		for ( int i = 0; i < arrOfNumerals.length - 2; i++) {
			for ( int j = i + 2; j < arrOfNumerals.length; j ++) {
				boolean isPalindrom = false;
				if (arrOfNumerals[i] == arrOfNumerals[j]) {
					isPalindrom = true;
					int everageAmountOfNumerals = (j + i) / 2;
					for(int k = i; k < everageAmountOfNumerals; k++) {
						for ( int l = j; l > everageAmountOfNumerals; l--) {
							if (arrOfNumerals[k] == arrOfNumerals[l]) {
								isPalindrom = true;
							} 
							else isPalindrom = false;
						}
					}
					if(Integer.valueOf(String.copyValueOf(arrOfNumerals, i, j - i + 1)) > maxPalindrom && isPalindrom == true) {
						maxPalindrom = Integer.valueOf(String.copyValueOf(arrOfNumerals, i, j - i + 1));
					}
				}
			} 
		}
		return maxPalindrom;
	}
	
	public static void main(String[] args) { 
		 
		int number = 12345;
		 
		logger.info("By division remainder: " +byDivisionRemainder(number));
		logger.info("By convert to char: " +byConvertToChar(number));
		logger.info("Max palindrom: " + findPalindrom(4602, 3178));
		
		

		 
		
	} 
}
