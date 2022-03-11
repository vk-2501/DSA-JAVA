import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int chess[][] =new int[n][n];
        int r=sc.nextInt();
        int c=sc.nextInt();
        printKnightsTour(chess,r,c,1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        //Base Case
        if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c]!=0){
            return;
        }//subtle baat 3--> write chess[r][c]!=0 after r<0 ... because if written before will give error
        //Because maybe r or c is breaking the boundaries so we have to check before if we check for chess[-1][0] then it will give an error
        else if(upcomingMove==chess.length*chess.length){
            chess[r][c]=upcomingMove;//subtle baat 1-> 25th move abhi dali nahi hai toh daalo usse
            displayBoard(chess);
            chess[r][c]=0;//subtle baat 2--> 25th move daal di hai toh ab hta do
            return;
        }
        
        chess[r][c]=upcomingMove;
        printKnightsTour(chess,r-2,c+1,upcomingMove+1);
        printKnightsTour(chess,r-1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+2,c+1,upcomingMove+1);
        printKnightsTour(chess,r+2,c-1,upcomingMove+1);
        printKnightsTour(chess,r+1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-2,c-1,upcomingMove+1);
        chess[r][c]=0;


    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}