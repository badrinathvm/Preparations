package recent;

/**
 * Created by Badri on 9/26/17.
 */
public class WordSearch {

    public static void main(String[] args) {

        char board[][] = {
                    {'A','B','C','E'},
                    {'S','F','C','S'},
                    {'A','D','E','E'}

        };

        //System.out.println(WordSearch.wordSearch(board,"ABCCED"));

        System.out.println(WordSearch.wordSearch(board,"SEE"));

    }

    public static boolean wordSearch(char[][] board, String word){

        for(int i=0; i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(helper(board,word, i,j,0)){
                    return true;
                }
            }
        }

        return false;
    }

    static boolean helper(char[][] board,String word, int i , int j, int ind){

        if(ind == word.length()){
            return true;
        }

        if( i<0 || j < 0 || i >= board.length || j >= board[0].length){
            return false;
        }

        if(board[i][j] != word.charAt(ind)) return false;
        board[i][j] = ' ';

        if(helper(board,word,i+1,j,ind+1) ||
                helper(board,word,i-1,j,ind+1) ||
                helper(board,word,i,j+1,ind+1) ||
                helper(board,word,i,j-1,ind+1)) {
            return true;
        }

        board[i][j] = word.charAt(ind);


        return false;
    }
}
