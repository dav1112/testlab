package testlab;

public class TestTryFinally {
	public void testtry() {
		try{
			if(true) {
				return ;
			}
		} finally{
			System.out.println(111);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTryFinally test = new TestTryFinally();
		test.testtry();
	}

}
