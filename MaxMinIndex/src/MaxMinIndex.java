public class MaxMinIndex {

/*
Find Max and Min With Their Index
Same temperature sensor as Q1. Find the highest and lowest temperature AND which day number (index + 1) they occurred on.

Input: int[] temps = {12, 7, 19, 4, 22, 15, 9};

Expected Output: Hottest day: Day 5 → 22°C Coldest day: Day 4 → 4°C


 */
    public static void main(String[] args) {


        int[] temps = {12, 7, 19, 4, 22, 15, 9};

        int index = 0;

        int [] max = findMax(temps , index);
        int [] min = finMin(temps , index);

        System.out.println("Hottest day: Day : "+ max[1] + "→" + max[0]  +"°C Coldest day: Day" + min[1] + "→" +  min[0]);


    }

    private static int [] finMin(int[] temps , int index) {
        int maxResult = temps[0];

        for (int i = 1 ; i <temps.length; i++)
        {
            if (maxResult>temps[i]){

                maxResult = temps[i];
                index = (i+1) ;
            }
        }

        return  new int[]{maxResult, index};
    }

    private static int [] findMax(int[] temps , int index) {

        int minResult = temps[0];


        for (int i = 1 ; i<temps.length ; i++) {

            if (minResult <temps[i]) {


                minResult = temps[i];
                index  = (i+1) ;
            }
        }

        return  new int[]{minResult, index};
    }


}
