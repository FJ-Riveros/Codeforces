import java.util.Scanner;
import java.lang.Math;
public class Beautiful_Matrix{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int column = 1;
		int row = 1;
		for(row = 1; row<=5; row++){
			for(column = 1; column<=5; column++){
				input = scanner.nextInt();
				if(input == 1){
					System.out.println(Math.abs(column - 3) + Math.abs(row - 3));
				}
			}
		}
		
	}
}
