import java.util.Arrays;

public class Solution {

    public int[] sort(int[] result) {
        if (result.length < 2) {
            return result;
        } else {
            int[] left = sort(Arrays.copyOfRange(result, 0, result.length / 2));
            int[] right = sort(Arrays.copyOfRange(result, result.length / 2, result.length));
            return merge(left, right);
        }
    }

    public int[] merge(int[] left, int[] right) {
        int counLeft = 0, countRight = 0, resultCount = 0;
        int[] result = new int[left.length + right.length];
        while (counLeft < left.length && countRight < right.length) {
            if (left[counLeft] < right[countRight]) {
                result[resultCount] = left[counLeft];
                counLeft++;
            } else {
                result[resultCount] = right[countRight];
                countRight++;
            }
            resultCount++;
        }
        if (counLeft == left.length) {
            while (countRight < right.length) {
                result[resultCount] = right[countRight];
                countRight++;
                resultCount++;
            }
        }
        if (countRight == right.length) {
            while (counLeft < left.length) {
                result[resultCount] = left[counLeft];
                counLeft++;
                resultCount++;
            }
        }
        return result;
    }
}
