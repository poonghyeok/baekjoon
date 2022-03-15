package baekjoon_part;

import java.util.Scanner;

public class baek1193 {
	
	public void mainPrcoess() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int boundary = getBoundary(n);
		int locInboundary = n - stackToBoundary(boundary);
			
		System.out.println(getFraction(boundary, locInboundary));
		sc.close();
	}
	
	public String getFraction(int boundary, int locInboundary) {
		int top = 0;
		int bot = 0;
		
		if(isEven(boundary)) {
			top = 1;
			bot = boundary;
			
			for(int i = 1; i < locInboundary; i++) {
				top = top + 1;
				bot = bot -1;
			}
		}else {
			top = boundary;
			bot = 1;
			
			for(int i = 1; i < locInboundary; i++) {
				top = top - 1;
				bot = bot + 1;
			}
		}
		
		return top+"/"+bot;
	}
	
	public boolean isEven(int n) {
		boolean result = false;
		if(n % 2 == 0) {
			result = true;
		}
		return result;
	}
	
	public int getBoundary(int n) {
		int boundary = 0;
		int start = 1;
		int end = start;
		
		while(true) {
			end = start + boundary;
			if(n <= end && n >= start) {
				break;
			}else {
				boundary++;
				start = end + 1;
				
			}
		}
		return boundary+1;
	}
	
	public int stackToBoundary(int boundary) {
		int stack = 0;
		for(int i = 0; i < boundary; i++) {
			stack += i;
		}
		return stack;
	}
	
	public static void main(String[] args) {
		baek1193 me = new baek1193 ();
		me.mainPrcoess();
	}
}
