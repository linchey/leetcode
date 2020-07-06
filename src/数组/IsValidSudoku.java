package 数组;

public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
                };
        System.out.println(isValidSudoku(board));
    }
    public  static boolean isValidSudoku(char[][] board) {
        //记录一行中1-9出现的次数
        int[][] row=new int[9][9];
        //记录一行中1-9出现的次数
        int[][] col=new int[9][9];
        //记录一块中1-9出现的次数
        int[][] box=new int[9][9];
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                //出现‘.’掠过
                if(board[i][j]=='.')continue;
                //获取数字
                int num=board[i][j]-'1';
                //判断行
                if(row[i][num]==1)return false;
                //判断列
                if (col[j][num]==1) return false;
                /*判断块
                * 获取块标
                * */
                int box_index=(i/3)*3+j/3;
                if (box[box_index][num]==1)return false;
                if(row[i][num] == 0 && col[j][num] == 0 && box[box_index][num] == 0){
                    row[i][num] = 1;
                    col[j][num] = 1;
                    box[box_index][num] = 1;
                }
            }
        }
        return  true;
    }
}
