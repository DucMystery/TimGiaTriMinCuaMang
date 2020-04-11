import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myArr[][] ={{5,4},{8,9},{2,7}};
        System.out.println("Giá trị nhỏ nhất của mảng: "+checkMin(myArr));
    }

    public static int checkMin(int arr[][]){
        int min = arr[0][0];
        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                if (arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
