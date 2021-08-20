import java.util.Scanner;

public class Candies_Division{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int c, k;
		int fence = 0;
		int helper = 0;
		for(int i=0; i<cases; i++){
			c = scanner.nextInt();
			k = scanner.nextInt();
			fence = k / 2;
			if(k == 0){
				System.out.println(0);
			}else if(c % k == 0){
				System.out.println(c);
			}else if(c < k){
				if(c > fence){
					System.out.println(fence);
				}else{
					System.out.println(c);
				}
			}else{
				helper = c % k > fence ? fence : c % k;
				System.out.println(((c/k) * k) + helper);
			}
		}
	}
}
