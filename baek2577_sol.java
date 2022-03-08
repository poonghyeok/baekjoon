package baekjoon_part;
import java.util.Scanner;

class baek2577_sub {
	public int number = 0;
	public int occur = 0;
	
	
}

class baek2577{
	public int a;
	public int b;
	public int c;
	public int total;
	public int jaritsu = 0;
	public int[] elements = new int[10];
	
	public baek2577(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.total = a*b*c;
		this.jaritsu = getNumbers(this.total);
		
		//initialize the array 'elements'
		int splitTotal = total;
		for(int j = jaritsu-1; j >= 0; j--) {
			int mok = splitTotal / (int)Math.pow(10, j);
			elements[(jaritsu-1)-j] = mok;
			splitTotal = splitTotal - mok*(int)Math.pow(10, j);
		}
	}
	
	public int getNumbers(int input) {
		int result = 0;	
		for(int i = 0; i <= 10; i++) {
			if(input / (int)Math.pow(10,i) != 0) {
				result ++;
			}else {
				break;
			}
		}
		
		return result;
	}
	
	
}

public class baek2577_sol {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		baek2577 aSet = new baek2577(a,b,c);
		baek2577_sub[] arr = new baek2577_sub[10];
		
		
		 for(int j = 0; j < 10; j++) { 
			 arr[j] = new baek2577_sub(); 
			 arr[j].number = j;
		 }
		
		for(int i = 0; i < aSet.jaritsu; i++) {
			int theNum = aSet.elements[i];
			arr[theNum].occur++;
		}
		
		for(int k = 0; k < 10; k++) {
			System.out.println(arr[k].occur);
		}
		
		sc.close();
	}
	
}

