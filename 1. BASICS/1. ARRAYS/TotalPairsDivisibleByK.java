package DSA1MockMedium;

class TotalPairsDivisibleByK{

    public static void main(String[] args) 
    {
        int arr[]={10,20,30,5,5,5,90};
        int n=arr.length;
        int k=10;   
        int a=paircount(arr,n,k);
        System.out.println(a);
    }

    public static int paircount(int arr[],int n,int k)
    {        
        // to count occurrences of all remainders when divided by K
        int freq[] = new int[k];  
        for (int i = 0; i < n; i++){
            ++freq[arr[i] % k];            
        }     
        // If both pairs are divisible by 'K'
        int sum = freq[0] * (freq[0] - 1) / 2;
        // count for all i and (k-i) freq pairs
        for (int i=1;i<=k/2 && i!=(k-i);i++){
            sum += freq[i] * freq[k-i];
        }   
        if (k%2 == 0)   
            sum += (freq[k/2] * (freq[k/2] - 1)/ 2);
        return sum;
    }  
}  