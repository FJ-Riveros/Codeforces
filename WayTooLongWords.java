import java.util.Scanner;
public class WayTooLongWords{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] arr = new String[n+1];
		for(int i=0; i<n; i++){
			arr[i] = input.next();
			if(arr[i].length() > 10){
				System.out.println("" + arr[i].charAt(0) + (arr[i].length() - 2) + arr[i].charAt(arr[i].length()-1));
			}else{
				System.out.println(arr[i]);
			}
		}
	}
}
