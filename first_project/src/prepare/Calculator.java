package prepare;

public class Calculator {
	public static int result;
    public int multiply(int a, int b) {
    	result = a*b;
        return result ;
    }
    
    public int add(int a, int b) {
    	result = a+b;
        return result ;
    }
    
    public int clear() {
    	result = 0;
        return result ;
    }
    
    public static void main(String[] args) {
    	int aa = 10;
    	int bb = 20;
    	Calculator cal = new Calculator();
		System.out.println("10+20="+cal.add(aa, bb));;
    
    }
    
    
}

