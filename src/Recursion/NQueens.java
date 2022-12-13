package Recursion;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
          int n=4;
          boolean [][] board= new boolean[n][n];
          N_Queen(board,n,0);
    }
    public static void N_Queen(boolean[][] board,int tq,int row ){
        if(tq==0){
            Display(board);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)==true){
                board[row][col]=true;
                N_Queen(board,tq-1,row+1);
                board[row][col]=false;
            }
        }
    }
    private static boolean isSafe(boolean[][] board,int row,int col){
        int r=row;
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        //vertical
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        //left Diagonal
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            c++;
            r--;
        }
        //right diagonal
        r=row;
        c=col;
        while(r>=0 && c< board.length){
            if(board[r][c]==true){
                return false;
            }
            c++;
            r--;
        }
        return false;
    }
    private static void Display(boolean[][] board){
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
