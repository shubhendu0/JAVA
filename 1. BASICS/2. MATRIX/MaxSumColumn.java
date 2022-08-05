import java.io.*; 
import java.util.*; 

class MaxSumColumn{
	public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int s[]=new int[N];
        int arr[][]=new int[M][N];
        for(int i=0;i<M;i++) {
            for(int j=0;j<N;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                s[i]=s[i]+arr[j][i];
            }
        }
        Arrays.sort(s);
        System.out.println(s[N-1]);
	}
}