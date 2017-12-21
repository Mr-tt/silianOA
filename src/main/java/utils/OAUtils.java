package utils;

public class OAUtils {
	
	/**
	 * ½«Sting[]------>Long[]
	 * @param ss
	 * @return
	 */
	public static Long[] converStringToLong(String[] ss){
		Long[] longs = new Long[ss.length];
		int index = 0;
		for(String s : ss){
			longs[index] = Long.parseLong(s);
			index++;
		}
		return longs;
	}
	
}
