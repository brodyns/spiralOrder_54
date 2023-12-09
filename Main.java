import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println((new Solution()).spiralOrder(matrix));
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int u = 0;
        int d = matrix.length-1;
        int l = 0;
        int r = matrix[0].length-1;

        while(true){
            for(int i = l; i <= r; i++){
                res.add(matrix[u][i]);
            }
            if(++u > d) break;
            for(int i = u; i <= d; i++){
                res.add(matrix[i][r]);
            }
            if(--r < l) break;
            for (int i = r; i >= l; i--) {
                res.add(matrix[d][i]);
            }
            if(--d < u) break;
            for(int i = d; i >= u; i--){
                res.add(matrix[i][l]);
            }
            if(++l > r) break;
        }
        return res;
    }
}
