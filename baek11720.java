package baekjoon_part;

import java.util.Scanner;

public class baek11720 {
	
	public int num = 0;
	public String input; 
	public int[] numArr;
	
	public void mainProcess() {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		input = sc.next();
		numArr = new int[num];
		
		setElements();
		System.out.println(getSum());
		sc.close();
	}
	
	public void setElements() {
		
		for(int i = 0; i < num; i++) {
			
			numArr[i] = charToint(input.charAt(i));
			
		}
	}
	

	public int getSum() {
		int result = 0;
		for(int i = 0; i < num; i++) {
			result += numArr[i];
		}
		return result;
	}
	
	public int charToint(char spell) {
		return ((int)spell) - 48;
	}

	public static void main(String[] args) {
		baek11720 me = new baek11720();
		me.mainProcess();
	}
	

}
