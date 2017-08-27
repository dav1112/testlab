package testlab;

public class TestStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] stringarray = {"","","dd"};
		String str = ";dd;;;; ";
		String [] strs = str.split("\\;");
		String str2 = "";
		String [] strs2 = str2.split("\\;");
		
		//System.out.println(stringarray.length);
		System.out.println(strs.length);
		System.out.println(strs2.length);
		
		String strs3[] = new String[0];
		System.out.println(strs3.length);
		
		String str4 = "";
		System.out.println(str4.length());
	}

}
