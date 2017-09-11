/**
 * Created by Badri on 9/8/17.
 */
public class LongestCommonSubSequence {

    public static void main(String[] args) {
        LongestCommonSubSequence.calculate("abcdaf","acbcf");
        LongestCommonSubSequence.longestCommonSubstring("abcdaf","zbcdf");

    }

    public static void  calculate(String m, String n){
        int mLength = m.length();
        int nLength = n.length();

        char x[] = m.toCharArray();
        char y[] = n.toCharArray();

        int temp[][] = new int[mLength+1][nLength+1];
        for (int i=1;i<=mLength;i++){
            for(int j=1;j<=n.length();j++){
                if(x[i-1] == y[j-1]){
                    temp[i][j] = temp[i-1][j-1] + 1;
                }else{
                    temp[i][j] = Math.max(temp[i-1][j] , temp[i][j-1]);
                }
            }
        }
        System.out.println(temp[mLength][nLength]);
    }


    public static void  longestCommonSubstring(String m, String n){
        int mLength = m.length();
        int nLength = n.length();

        char x[] = m.toCharArray();
        char y[] = n.toCharArray();

        int maximum = 0;
        int temp[][] = new int[mLength+1][nLength+1];
        for (int i=1;i<=mLength;i++){
            for(int j=1;j<=n.length();j++){
                if(x[i-1] == y[j-1]){
                    temp[i][j] = temp[i-1][j-1] + 1;
                }else{
                    temp[i][j] = 0;
                }

                if(temp[i][j] > maximum){
                    maximum = temp[i][j];
                }
            }
        }
        System.out.println(maximum);
    }

}
