package valera.ArraysAndString;
import java.util.ArrayList;
import java.util.Arrays;
public class Test6 {
        public static int[][]  test(int[][] arr) {
            ArrayList<Integer> m = new ArrayList<>();
            ArrayList<Integer> n = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 0) {
                        m.add(j);
                        n.add(i);
                    }
                }
            }

            int index = 0;
            for(int i=0;i<m.size();i++){
                for(int j=0; j<arr.length;j++){
                    arr[j][m.get(index)]=0;
                    Arrays.fill(arr[n.get(index)],0);
                }
                index++;
            }
            return arr;
        }
    }

