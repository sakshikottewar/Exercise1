public class missing {
    public static void main(String args[]){

        // int a[]={1,2,3,4,6};
        //  int en = a.length+1;
        // int total_sum = en * (en+1)/2;
        
        // int sum =0;
        // for(int i=0;i<a.length;i++){
        //     sum = sum+a[i];

        // }
        
        //               System.out.println("Missing number is:"+(total_sum-sum));
            

        int a[]={1,2,3,4,5,6,8};
         int xor1 = a[0];
        for(int i=1;i<a.length;i++){
            xor1 = xor1^a[i];

        }

        int xor2 = 1;
        for(int i =2;i<=a.length+1;i++){
            xor2=xor2^i;
        }
        
                      System.out.println("Missing number is:"+(xor1^xor2));
            
    }
}
