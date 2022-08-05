class QuickSort{
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }            
        } 
        swap(arr,i+1,high);
        return i+1;      
    }

    static void qsort(int arr[],int low,int high)
    {
        if(low<high){
            int pi=partition(arr,low,high);
            qsort(arr,low,pi-1);
            qsort(arr,pi+1,high);            
        }
    }    

    static void printarray(int arr[],int n)
    {
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public static void main(String[] args)
    {
        int arr[]={1,6,2,5,3,4,-9,0};
        int n=arr.length;
        qsort(arr,0,n-1);
        printarray(arr,n);
    }
    
}
