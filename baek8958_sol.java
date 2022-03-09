package baekjoon_part;

import java.util.Scanner;

class eachAnswer{
	public char OX;
	public int point = 0;
}

class answers{
	String answer;
	int answerLength;
	eachAnswer[] OXs = new eachAnswer[80];
	
	public answers(String answer) {
		this.answer = answer;
		this.answerLength = answer.length();
		getPoint(answer, OXs);
	}
	
	public void getPoint(String answer, eachAnswer[] answerArr) {
		for(int i = 0; i < answerLength; i++) {
			answerArr[i] = new eachAnswer();
			
			answerArr[i].OX = answer.charAt(i);
			
			if(i == 0 && answer.charAt(i) == 'O') {
				answerArr[i].point = 1;
			}else if(i > 0 && answer.charAt(i) == 'O' && answer.charAt(i-1) == 'O'){
				answerArr[i].point = answerArr[i-1].point + 1; 
			}else if(i > 0 && answer.charAt(i) == 'O' && answer.charAt(i-1) != 'O'){
				answerArr[i].point = 1; 
			}else {
				answerArr[i].point = 0;
			}
		}
	}
	
	public void printTotal() {
		int total = 0;
		for(int i = 0; i < this.answerLength; i++) {
			total += this.OXs[i].point;
		}
		System.out.println(total);
	}
}


public class baek8958_sol {
	
	public int num;
	public void mianProcess() {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		answers[] answersArr = new answers[num];
		
		for(int j = 0; j < num; j++) {
			answersArr[j] = new answers(sc.next());
		}
		
		for(int j = 0; j < num; j++) {
			answersArr[j].printTotal();
		}
		
		sc.close();
		
	}

	
	public static void main(String[] args) {
		baek8958_sol sol = new baek8958_sol();
		sol.mianProcess();
		
	}
	

}
