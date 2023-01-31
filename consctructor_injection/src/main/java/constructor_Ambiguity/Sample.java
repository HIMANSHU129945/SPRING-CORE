package constructor_Ambiguity;

public class Sample {
	
	private int a;
	private int b;
	
	public Sample(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Double Constructor");
	}

	public Sample(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Int Constructor");
	}

	public Sample(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String Constructor");
	}
	
	public void sum() {
		System.out.println("Value Of a Is: "+this.a);
		System.out.println("Value Of b Is: "+this.b);
		System.out.println("Sum Of "+a+" & "+b+" Is: "+(a+b));
		
	}

	@Override
	public String toString() {
		return "Sample [a=" + a + ", b=" + b + "]";
	}

}
