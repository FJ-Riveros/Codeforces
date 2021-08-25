import java.util.Scanner;
import java.util.Arrays;  
import java.util.Collections;  
import java.util.List;
import java.util.ArrayList;

public class Bad_Boy{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		int[][] arr;
		int farY = 0, farX = 0;
		
		for(int i=0; i<tests; i++){
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int posY = scanner.nextInt();
			int posX = scanner.nextInt();
            System.out.println("1 1 " + n + " " + m); 
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
