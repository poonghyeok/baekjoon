package baekjoon_part;

import java.util.Scanner;

public class baek_2231_sol {
	
	public void mainProcess() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 0;
		for(int j = 0; j < 1000000; j++) {
			if(partHap(j) == n) {
				min = j;
				break;
			}
		}
		System.out.println(min);
		
		sc.close();
	}
	public int partHap(int num) {
		int result = num;
		int jari = getJari(num);
		int[] jariArr = getPart(num);
		
		for(int k = jari - 1; k >= 0; k--) {
			result += jariArr[k];
		}
		
		return result;
	}
	
	public int[] getPart(int num) {
		int[] arr;
		arr = new int[getJari(num)];
		
		for(int p = getJari(num) - 1; p >= 0; p--) {
			int mok = num / (int)Math.pow(10, p);
			int dimin = mok*(int)Math.pow(10, p);
			arr[p] = mok;
			num -= dimin;
		}
		
		return arr;
	}
	
	public int getJari(int num) {
		int result = 0;
		int i = 0;
		while(i < 8) {
			int mok = num / (int)(Math.pow(10,i));
			
			if(mok == 0) {
				result = i;
				break;
			}else {
				i++;
			}
			result = i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		baek_2231_sol me = new baek_2231_sol();
		me.mainProcess();
		
	}
}
