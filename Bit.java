import java.util.Scanner;

public class Bit{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		String operations;
		int result = 0;
		for(int i=0; i<lines; i++){
			operations = scanner.next();
			if(operations.equals("X++") || operations.equals("++X")){
				result++;
			}else{
				result--;
			}
		}
		System.out.println(result);
	}
}
