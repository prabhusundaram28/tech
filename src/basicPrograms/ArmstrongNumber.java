package basicPrograms;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int rem=0,res=0,num=153;
		
		int n=num;
		while (num>0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
		}
		if (n==res) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not an Armstrong number");
		}
	}

}
