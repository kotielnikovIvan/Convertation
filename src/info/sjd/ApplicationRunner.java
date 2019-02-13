package info.sjd;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class ApplicationRunner {

	private static Logger logger = Logger.getLogger(ApplicationRunner.class.getSimpleName());
	
	public static int byDivisionRemainder(int number) {
		String valueByString = String.valueOf(number);
		int amountOfNumerous = valueByString.length();
		int result = 0;
		while(amountOfNumerous != 0) {
			result += number % Math.pow(10, amountOfNumerous) / Math.pow(10,  amountOfNumerous - 1);
			amountOfNumerous--; 
		} 
		return result;
	}  
	
	public static int byConvertToChar(int number) {
		String  strNumber = String.valueOf(number);	  
		int sumOfNumerals = 0;
		int i = 0;
		while(i < strNumber.length()) { 
			sumOfNumerals += Character.getNumericValue(strNumber.charAt(i));
			i++;
		}   
		return sumOfNumerals;  
	}
	
	public static boolean isPalindrom(int value) {
		StringBuffer strBuffer = new StringBuffer(String.valueOf(value));
		int i = 0;
		int j = strBuffer.length() - 1;
		while(i < j) {
			if(strBuffer.charAt(i) != strBuffer.charAt(j)) {
				return false;
			}
			i++; 
			j--;
		} 
		return true;
	} 
	  
	public static int findPalindrom() {
		List<Integer> palindroms = new ArrayList<>();
		for ( int i = 100; i < 999; i++) {
			for ( int j = 100; j < 999; j++) {
				if(isPalindrom(i * j) == true) {
					palindroms.add(i * j);
				}  
			}
		}
		//showList(palindroms);
		return Collections.max(palindroms); 
	}
	
	public static void showList(List<Integer> list) {
		for(int value: list) {
			logger.info("Value of Palindrom: " + value);
		}
	}
	 
	public static void main(String[] args) { 
		 
		int number = 1234567; 
		 
		logger.info("By division remainder: " +byDivisionRemainder(number));
		logger.info("By convert to char: " +byConvertToChar(number));
		logger.info("Max palindrom: " + findPalindrom());
		 
	} 
}
