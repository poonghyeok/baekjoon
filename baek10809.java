package baekjoon_part;

import java.util.Scanner;

public class baek10809 {

	public String inputStr;
	public int strLen;
	public int arrSize;
	
	public char[] alphabet;
	
	public baek10809(){
		arrSize = getNumofAlphabet();
		this.alphabet = new char[arrSize];
		setAlphabets();
	}
	
	public int getNumofAlphabet() {
		return (int)'z' - (int)'a' + 1;
	}
	
	public void setAlphabets() {
		for(int i = 0; i < arrSize; i++) {
			alphabet[i] = (char)(97+i);
		}
	}
	
	public void mainProces() {
		Scanner sc = new Scanner(System.in);
		inputStr = sc.next(); 
		
		for(int i = 0; i < arrSize; i++) {
			System.out.printf("%d ", inputStr.indexOf(alphabet[i]));
		}
		
		sc.close();
			
	}
	
	
	public static void main(String[] args) {
		baek10809 me = new baek10809();
		me.mainProces();
	}

}
