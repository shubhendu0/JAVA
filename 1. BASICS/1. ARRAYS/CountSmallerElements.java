package DSA1MockHard;

// Print the no. of elements smaller than element arr[i] . print the result in array form.

class CountSmallerElements {
    public static void main(String[] args){
        int arr[]={1,2,3,4,9,1};
        int n=arr.length;

        int result[]=count(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] count(int arr[],int n){
        int res[]=new int[n];
        for(int i=0;i<n;i++){  
            int j=0,c=0;
            while(j<n){
                if(arr[i]>arr[j])
                    c++;  
                    j++;                                 
            }
            res[i]=c;           
        }
        return res;
    }
}
