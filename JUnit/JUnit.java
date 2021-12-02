public class JUnit {
    /**
     * 
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * 
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            if (a < min)
                min = a;
        }
        return min;
    }

    /**
     * 
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        BMI = (double) Math.round(BMI * 10) / 10;
        if (BMI < 18.5)
            return "Thiếu cân";
        else if (BMI >= 18.5 && BMI <= 22.9)
            return "Bình thường";
        else if (BMI >= 23 && BMI <= 24.9)
            return "Thừa cân";
        else if (BMI >= 25)
            return "Béo phì";
        return null;
    }
}