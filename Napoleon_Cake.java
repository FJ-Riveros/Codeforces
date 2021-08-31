import java.util.Scanner;
import java.util.Arrays;  
import java.util.Collections;  
import java.util.List;
import java.util.ArrayList;
//https://codeforces.com/problemset/problem/1501/B

public class Napoleon_Cake{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		int[] stack;
		int[] input;
		int size = 0;
		for(int i=0; i<tests; i++){
			size = scanner.nextInt();
			stack = new int[size];
			input = new int[size];
			int counter = 0;
			StringBuilder sb = new StringBuilder();
			int j = 0;
			for(int y=0; y<size; y++) input[y] = scanner.nextInt();
				for(j=size-1; j>=0; j--){
					if(input[j] == 0 && counter == 0 ){
						stack[j] = 0;
					}else if(input[j] == 0 && counter > 0){
						stack[j] = 1;
						counter--;
					}else{
						if(counter < input[j]){
							counter = input[j] - 1;
						}else{
							counter--;
						}
						stack[j] = 1;
					}
					sb.append(stack[j] + " ");
				}
			System.out.println(sb.reverse().toString().trim());
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
