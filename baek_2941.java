package baekjoon_part;

import java.util.Scanner;


public class baek_2941 {
	
	public String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj","s=","z="};
	
	public void mainProcess() {

		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		int index = 0;
		String tempString = userInput;
		
		while(index < croatia.length) {
			if(tempString.indexOf(croatia[index]) > -1){
				int startIndex = tempString.indexOf(croatia[index]);
				tempString = tempString.replace(croatia[index] ,"?");
			}else{
				index++;
			}
				
		}
		System.out.println(tempString.length());
		
		sc.close();
	}
	
	
	
	
	public static void main(String[] args) {
		
		baek_2941 me = new baek_2941();
		me.mainProcess();
		
	}

}
