//	1560-A
import java.util.Scanner;


public class DislikeOfThrees{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		int requiredIndex = 0;
		int[] values = new int[1000];
		int sum = 1;
		int index = 0;
		while(index < 1000){
			if(sum % 3 != 0 && sum % 10 != 3){
				values[index++] = sum;	
			}	
			sum++;
		}
		for(int i=0; i<testCases; i++){
			requiredIndex = scanner.nextInt();
			System.out.println(values[requiredIndex-1]);
		}
	}
}
