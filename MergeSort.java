class MergeSort
{
    public static void mergesort(int[]a, int p, int r)
    {
        if(p<r)
        {
            int q=(p+r)/2;
            mergesort(a, p, q);
            mergesort(a, q+1, r);
            merge(a,p,q,r);
        }
    }
    public static void merge(int[]a, int p, int q, int r)
    {
       int n1=q-p+1;
       int n2=r-q;
       int[]L=new int[n1];
       int[]R=new int[n2];
       for(int i=0;i<n1;i++)
            L[i]=a[p+i];
       for(int j=0;j<n2;j++)
           R[j]=a[q+1+j];

           int i=0,j=0,k=p;
           while(i<n1 && j<n2)
           {
               if(L[i]<=R[j])
               {
                   a[k]=L[i];
                   i++;
               }
               else{
                   a[k]=R[j];
                   j++;
               }
               k++;
           }
           while(i<n1)
           {
               a[k]=L[i];
               i++;
               k++;
           }
           while(j<n2)
           {
                a[k]=R[j];
                j++;
                k++;
           }
    }
    public static void main(String[]args)
    {
        int[]arr={31,41,59,26,41,58};
        mergesort(arr,0,arr.length-1);
        for(int  i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}