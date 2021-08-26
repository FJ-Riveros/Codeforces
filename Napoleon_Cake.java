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
			StringBuilder sb = new StringBuilder();
			int j = 0;
			/*
			for(int j=0; j<size; j++){
				StringBuilder sb = new StringBuilder();
				input = scanner.nextInt();
				if(input == 0){
					stack[j] = 0;
				}else if(input == 1){
					stack[j] = 1;
				}else{
					for(int x= 0; x < input; x++){
						if(j-x >= 0){
							stack[j-x] = 1;
						}
					}
				}
			}*/
			for(int y=0; y<size; y++) input[y] = scanner.nextInt();
			for(j=size-1; j>=0; j--){
				if(input[j] == 0 && stack[j] != 1){
					stack[j] = 0;
				}else if(input[j] == 1){
					stack[j] = 1;
				}else{
					for(int x=0; x<input[j]; x++){
						if(j-x >= 0){
							stack[j-x] = 1;
						}
					}
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
