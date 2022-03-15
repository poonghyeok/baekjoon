package baekjoon_part;

import java.util.Scanner;

class dial{
	String word;
	int num;
	int second = 2;
}

public class baek5622 {

	public String[] words = {"1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	
	public void mainProcess() {
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		int resultSec = 0;
		for(int i = 0; i < userInput.length(); i++) {
			String alpha = userInput.substring(i, i+1);
			resultSec += getSeconds(alpha);
			
		}
		System.out.println(resultSec);
		
		sc.close();
		
	}
	
	public int getSeconds(String alpha) {
		int defaultSec = 2;
		for(int j = 0; j < words.length; j++) {
			if(words[j].indexOf(alpha) > -1) {
				defaultSec += j;
				break;
			}
		}
		
		return defaultSec;
	}
	
	public static void main(String[] args) {
		baek5622 me = new baek5622 ();
		me.mainProcess();
	}
}
