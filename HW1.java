public class hww{
	static int a,b=1,c;
	public static void Suma(){
		for (int i = 3; i <= 9; i++) {
			a += Math.pow(i, 2);

		}
		}
	public static void Mult() {
		for (int i = 2; i <= 8; i++) {
			b *= i;
		}		
	}
	public static void SumAB(){
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Mult();
		Suma();
		SumAB();
	}
}
