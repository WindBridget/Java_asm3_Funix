package util;
public class NumberUtil {
	public static boolean isInteger(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } 
	    catch (NumberFormatException nfe) {}
	    return false;
	}
	public static boolean isFloat(String str) {
	    try {
	        Float.parseFloat(str);
	        return true;
	    } 
	    catch (NumberFormatException nfe) {}
	    return false;
	}
}
