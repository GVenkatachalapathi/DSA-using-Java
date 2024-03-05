import java.util.*;

public class TwoDArray
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for 2D");
        int rows=s.nextInt();
        int cols=s.nextInt();
        int arr[][] = new int[rows][cols];
        for(i=0; i<rows; i++){
            for(j=0; j<cols; j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("\nElement to search in the array are: ");
        int x=s.nextInt();
        for(i=0; i<rows; i++){
            for(j=0; j<cols; j++){
                if(arr[i][j]==x){
                    System.out.println("indices"+i+","+j);
                    break;
                }
            }
                }
    }
}