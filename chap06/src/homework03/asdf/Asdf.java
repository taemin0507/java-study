package homework03.asdf;

public class Asdf {
	public String str(String x,String y) {
		String z = x + y;
		return z;
	}
	
	public int ad(int a, int b) {
		if (a<b) {
			System.out.println("계산할 수 없습니다");
			return 0;
		}else {
			int c = a*b;
			return c;
		}
	}
	
	public boolean str2(String i,String j) {
		if(i == j) {
			return true;
		}else {
			return false;
		}
	}
	
}
