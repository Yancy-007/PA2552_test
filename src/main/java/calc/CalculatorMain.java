package calc;

//test122224444ddadjkl


public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		return a+b;
	}

	public int sub(int a,int b) { return a-b; }

	public int mul(int a, int b) { return a*b; }

	//public int div(int a, int b) {return a/b; }

	public int div(int a, int b) {
		if(b == 0) { return 0;}
	return a/b; }
	public int rem(int a, int b) { return a%b;}
	public int doub(int a) { return 2*a;}
	public int half(int a) { return a/2;}
	public int trip(int a) { return 3*a;}
//	public int divByZero(int a, int b) { return a%b;}
// public int presedence(int a,int b){return a+b;}



}
