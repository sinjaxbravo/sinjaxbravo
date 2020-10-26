import java.util.ArrayList;
import java.util.List;

public class findMinDifference {
    public static int findMinDifference(List<String> timePoints) {

        boolean[] timeArr = new boolean[1440];
        for (String time : timePoints) {
            StringBuilder temp = new StringBuilder(time);
            int minutes = Integer.parseInt(String.valueOf(temp.substring(0, 2)))
                    * 60 + Integer.parseInt(String.valueOf(temp.substring(3)));
            if (timeArr[minutes]) {
                return 0;
            }
            timeArr[minutes] = true;
        }

        Integer firstTime = null;
        Integer prevTime = null;
        Integer min = Integer.MAX_VALUE;

        for (int i = 0; i < timeArr.length; i++) {
            if (timeArr[i] && firstTime == null) {
                firstTime = i;
                prevTime = i;
            } else if (timeArr[i]) {
                min = Math.min(min,
                        Math.min(i - prevTime, 1440 - i + prevTime));
                prevTime = i;
            }
        }

        min = Math.min(min,
                Math.min(prevTime - firstTime, 1440 - prevTime + firstTime));

        return min;

    }

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("23:00");
        s.add("00:00");

        findMinDifference(s);
        System.out.println(findMinDifference(s));

    }

}
