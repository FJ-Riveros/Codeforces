import java.util.Scanner;

public class Team {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		int sum = 0;
		for(int i=0; i<n; i++){
			sum = 0;
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = scanner.nextInt();
			sum = x+y+z;
			if(sum >= 2){
				result++;
			}
		}
		System.out.println(result);
	}
}
