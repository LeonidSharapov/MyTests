import java.util.ArrayList;
import java.util.Arrays;

public class Test5 {
    static int[][]  test(int [][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    Arrays.fill(arr[i], 0);
                    list.add(j);
                    break;
                }
            }
        }
        
        int index = 0;
        for(int i=0;i<list.size();i++){
            for(int j=0; j<arr.length;j++){
                arr[j][list.get(index)]=0;
            }
            index++;
        }
        return arr;
    }
}
