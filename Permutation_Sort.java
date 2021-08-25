import java.util.Scanner;
import java.util.Arrays;  
import java.util.Collections;  
import java.util.List;
import java.util.ArrayList;
 

public class Permutation_Sort{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		int size = 0;
		boolean check = false;
		int[] arr;
		for(int i=0; i<tests; i++){
			check = false;
			size = scanner.nextInt();
			arr = new int[size];
			for(int j=0; j<size; j++){
				arr[j] = scanner.nextInt();
				if(arr[j] != j+1) check = true;
			}
			if(!check){
				System.out.println(0);
			}else if(arr[0] == 1 || arr[size-1] == size){
				System.out.println(1);
			}else if(arr[0] == size && arr[size-1] == 1){
				System.out.println(3);
			}else{
				System.out.println(2);
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
