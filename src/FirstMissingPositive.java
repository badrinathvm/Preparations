/**
 * Created by Badri on 7/23/17.
 */
public class FirstMissingPositive {

    public static void main(String[] args) {
        int a[] = {3,4,-1,1};
        System.out.println(FirstMissingPositive.firstMissingPositive(a));
    }


        public static int firstMissingPositive(int[] A) {
            // Start typing your Java solution below
            // DO NOT write main() function
            int n=A.length;
            //System.out.println(n);
            for(int i=0;i<n;i++){
                if(A[i]>0&&A[i]<=n){
                    int val = A[i]-1;
                    if(val!=i && A[val]!=A[i]){
                        int temp=A[val];
                        A[val]=A[i];
                        A[i]=temp;
                        i--;
                    }
                }
            }
            for(int i=0;i<n;i++)
                if(A[i]!=i+1)
                    return i+1;
            return n+1;
        }

}
