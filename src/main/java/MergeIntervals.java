import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    //sort all array based on first values
    //if current interval overlaps with the last merged interval
    // then merge them
    //otherwise add current interval in result list

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        res.add(new int[] {intervals[0][0], intervals[0][1]});

        for(int i=1; i< intervals.length; i++){
            int[] last = res.get(res.size() - 1);
            int[] current = intervals[i];

            if(current[0] <= last[1]){
                last[1] = Math.max(last[1], current[1]);
            }else {
                res.add(new int[] {current[0], current[1]});
            }
        }
        return res.toArray(new int[res.size() - 1][]);
    }
}
