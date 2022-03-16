package baekjoon_part;

import java.util.Scanner;

public class baek10872 {
	
	public void mainProcess() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(MyFactorial(n));
		sc.close();
	}
	
	public int MyFactorial(int n) {
		if( n == 0) {
			return 1;
		}else {
			return n * MyFactorial(n-1);
		}
	}
	
	public static void main (String[] args) {
		baek10872 me = new baek10872 ();
		me.mainProcess();
	}
	
}

