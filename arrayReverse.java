public class arrayReverse {
    public static void main(String[] args) {
        int n=3;
        
        int[] arr={1,2,3,4,5,6,7,8};
        int[] arr1=new int[arr.length];
        for(int i=n-1;i>=0;i--)
        {
            arr1[i]=arr[i];
           
            
            System.out.println(arr[i]);
        }
        for(int i=arr.length-1;i>=n;i--)
        {
            arr1[i]=arr[i];
            
            System.out.println(arr[i]);
        }
         System.out.println(arr1[0]);
         for(int i=0;i<arr1.length;i++)
    {
        

    }
    
    }
}
