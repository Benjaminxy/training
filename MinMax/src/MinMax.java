
/*You work at a municipality. A sensor recorded the daily temperature (°C) for 7 days. Find the highest and lowest temperature of the week.

Input: int[] temps = {12, 7, 19, 4, 22, 15, 9};

Expected Output: Max temperature: 22 Min temperature: 4*/




public class MinMax {



    public static void main(String[] args) {
        int[] temps = {12, 7, 19, 4, 22, 15, 9};


        int maxResult = maxTemp(temps);
        int minResult = minTemp(temps);
        System.out.println("Max temperature:"+ maxResult +" Min temperature:" + minResult);

    }


    private static int minTemp(int[] temps) {
        int result = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (result > temps[i]) {
                result = temps[i];

            }


        }
        return result;

    }

    private static int maxTemp(int[] temps) {
        int result = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (result < temps[i]) {
                result = temps[i];

            }


        }
        return result;

    }
}