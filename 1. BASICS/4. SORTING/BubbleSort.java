class BubbleSort{
    public static void main(String[] args) 
    {
        int arr[]={1,3,5,2,4,-9,0,10};                        
        bubbleSort(arr,arr.length);        
    }
    
    public static void bubbleSort(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)    
            {    
                if(arr[j] > arr[j+1])    
                {    
                    int temp = arr[j];    
                    arr[j] = arr[j+1];    
                    arr[j+1] = temp;     
                }     
            }     
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}