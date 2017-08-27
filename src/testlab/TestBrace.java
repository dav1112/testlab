package testlab;

public class TestBrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " kk  oo uuui-i - iuu   dd ";
		str = str.trim().replaceAll("(\\  )+", "-").replaceAll("(\\-)+", "-");
		System.out.println(str);
	}

}
