package GetTheMeanOfAnArray;

/* Среднее арифмитечское в массиве с округлением вниз
It's the academic year's end, fateful moment of your school report. The averages must be calculated. All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.

        Return the average of the given array rounded down to its nearest integer.

        The array will never be empty.*/

public class School {

    public static int getAverage(int[] marks){
/*        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return sum / marks.length;
    }*/

        int x = 0;

    for (int i=0; i < marks.length; i++) {
            x += marks[i];
        }
        return Math.round(x / marks.length);
    }

}
