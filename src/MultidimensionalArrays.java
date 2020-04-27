import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args){
        String rows_and_columns[][] = new String[5][10];
        int i, j;
        for (i=0; i<10; i++){
            for(j=0; j<5; j++) {
                rows_and_columns[j][i] = "row_" + i + " col_" + j;
                if (j == 4) {
                    System.out.print(rows_and_columns[j][i] + "\n");
                }
                else{
                    System.out.print(rows_and_columns[j][i] + " ");
                }
            }
        }

        String multiplication_table[][] = new String[12][12];
        for (i=0;i<12;i++){
            for(j=0;j<12;j++){
                multiplication_table[i][j] = (i+1)*(j+1)+"\t";
                if (j==11){
                System.out.print(multiplication_table[i][j]+"\n");
            }
                else{
                    System.out.print(multiplication_table[i][j]);
                }
            }
        }
    }
}
