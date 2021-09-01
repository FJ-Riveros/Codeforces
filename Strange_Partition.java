import java.util.Scanner;
import java.util.Arrays;  
import java.util.Collections;  
import java.util.List;
import java.util.ArrayList;
 

public class Strange_Partition{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		int n=0,x=0;	
		int[] arr;
		for(int i=0; i<tests; i++){
			n = scanner.nextInt();
			x = scanner.nextInt();	
			arr = new int[n];
			for(int j=0; j<n; j++){
				
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
	
	static int lcm(int a, int b){
		boolean stop = false;
		int counter = 2;
		while(!stop){
			if(counter % a == 0 && counter % b == 0){
				stop = true;
			}else{
				counter++;
			}
		}
		return counter;
	}
	
	static int gcd(int a, int b){
		return (a*b)/lcm(a,b);
	}
}
