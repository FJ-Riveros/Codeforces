import java.util.Scanner;
import java.util.Arrays;  
import java.util.Collections;  
import java.util.List;
import java.util.ArrayList;
 //https://codeforces.com/problemset/problem/1537/B

public class Bad_Boy{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		int[][] arr;
		
		for(int i=0; i<tests; i++){
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int posX = scanner.nextInt() - 1;
			int posY = scanner.nextInt() - 1;
			int firstBallX = 0;
			int firstBallY = 0;
			int secondBallX = 0;
			int secondBallY = 0;
			int maxX = 0;
			int maxY = 0;
			for(int x=0; x<n; x++){
				for(int y=0; y<m; y++){
					if(maxY < Math.abs(posY - y)) maxY = Math.abs(posY - y);
				}
				if(maxX < Math.abs(posX - x)) maxX = Math.abs(posX - x);
			}
			
			for(int x=0; x<n; x++){
				for(int y=0; y<m; y++){
					if(maxY == y && maxX == x){
						System.out.print("X");
					}else if(posX == x && posY == y){ 
						System.out.print("P");
					}else{
						System.out.print("O");
					}
				}
				System.out.println();
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
