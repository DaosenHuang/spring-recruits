import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        inputMatrix();


    }

    /**
     * 反转字符串顺序
     * 例如 "I love you!" ---> "you! love I"
     */
    public static String reverse(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=ss.length-1; i>=0; i--) {
            sb.append(ss[i]).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * 输入一个数组
     */
    public static void inputMatrix() {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();   //定义矩阵的行数
        int n=scan.nextInt();  //矩阵的列数
        int[][] matrix=new int[m][n]; //m行n列
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int num=scan.nextInt();
                matrix[i][j] = num;
            }
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (j==n-1) {
                    System.out.println(matrix[i][j]+",");
                    continue;
                }
                System.out.print(matrix[i][j]+",");
            }
        }



    }

}
