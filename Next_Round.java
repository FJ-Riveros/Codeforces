import java.util.Scanner;

public class Next_Round {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int size, totalPos;
		size = scanner.nextInt();
		int[] arr = new int[size];
		totalPos = scanner.nextInt();
		int result = 0;
		boolean stop = false;
		for(int i=0; i<size; i++){
			arr[i] = scanner.nextInt();
		}
		for(int i=0; i<=totalPos - 1 && !stop; i++){
			if(i == size -1 && arr[i]!= 0 ){
				result++;
			}else if(arr[i] == 0){
				stop = true;
			}else if(i == totalPos - 1 && arr[i] == arr[i+1]){
				totalPos++;
				result++;
			}else{
				result++;
			}
		}
		System.out.println(result);
	}
}
