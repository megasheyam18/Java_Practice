class hash
{
    public static void main(String[] args)
    {
        int [] arr={1,1,2,3,3,4,4};

        int[] hash=new int[arr.length];

        for(int i=0;i<hash.length;i++)
        {
            hash[i]=0;
                }

                for(int i=0;i<hash.length;i++)
                {
                    hash[arr[i]]++;
                

                if(hash[i]>1)
                {
                    System.out.println(hash[i]);

                }
            }
    }
}