import java.util.Scanner;
import java.util.Arrays;  
import java.util.Collections;  
import java.util.List;
import java.util.ArrayList;
 

public class Friends_and_Candies{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		int n = 0, sum = 0, count = 0;
		int[] arr;
		
		for(int i=0; i<tests; i++){
			n = scanner.nextInt();
			arr = new int[n];
			count = 0;
			sum = 0;
			for(int j=0; j<n; j++){
				arr[j] = scanner.nextInt();
				sum += arr[j];
			}
			if(arr.length <= 1) System.out.println(0);
			else{
				if(sum%arr.length == 0){
					for(int y: arr) if(y > sum / arr.length) count++;
					System.out.println(count);
				}else{
					System.out.println(-1);
				}	
			}
		}
	}
	
	static void sort(int[] arrInput){
		List<Integer> list=new ArrayList<Integer>();
		for(int i: arrInput){
			list.add(i);
		}
		Collections.sort(list);
		for(int i=0; i<arrInput.length; i++){
			arrInput[i] = list.get(i);
		}
	}
}
