package GrasshopperSummation;

/*Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
        For example:
        summation(2) -> 3
        1 + 2
        summation(8) -> 36
        1 + 2 + 3 + 4 + 5 + 6 + 7 + 8*/

public class GrassHopper {
    public static int summation(int n) {
        int res = 0;                        //return IntStream.rangeClosed(1,n).sum();
        for (int i = 0; i<= n; i ++){
         res += i;
        }
        return res;
    }
}
