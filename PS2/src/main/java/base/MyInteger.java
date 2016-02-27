package base;
public class MyInteger {
	
	int iValue;
	public MyInteger(int iValNew) {
		iValue = iValNew;
	}
	public int iValGet() {
		return iValue;
	}
	public boolean isEven() {
		return isEven(iValue);
		}		
	public boolean isOdd() {
		return isOdd(iValue);
		}	
	public boolean isPrime() {
	    return isPrime(iValue);
	}
	public static boolean isEven(int a) {
		return(a%2==0);
	}
	public static boolean isOdd(int a) {
		return(a%2!=0);
	}
	public static boolean isPrime(int a) {
		int i;
		if (a==1) {
			return false;
		}
	    for(i=2;i<=a/2;i++) {
	        if(a%i==0) {
	            return false;
	}
	    }
	    return true;
	}
	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}
	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}
	public static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}
	public boolean equals(int a) {
		return(iValue == a);
	}
	public boolean equals(MyInteger a) {
		return equals(a.iValGet());
		}
}