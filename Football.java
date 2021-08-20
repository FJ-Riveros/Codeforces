import java.util.Scanner;

public class Football{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int counter = 1;
		char prev = input.charAt(0);
		String result = "NO";
		for(int i=1; i<input.length(); i++){
			if(input.charAt(i) == prev){
				if(++counter >= 7){
					result = "YES";
					break;
				}
			}else{
				counter = 1;
			}			
			prev = input.charAt(i);
		}
		System.out.println(result);
	}
}
