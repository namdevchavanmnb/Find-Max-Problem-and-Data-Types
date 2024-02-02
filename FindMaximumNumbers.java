package com.DayOne;

import java.util.Arrays;

public class FindMaximumNumbers {
    public class findMaximumNumbers<T extends Comparable<T>>{

        public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
            T max = x;
            if (y.compareTo(max) > 0)
                max = y;
            if (x.compareTo(max) > 0)
                max = z;
            return max;
        }

        public void testMax(T x, T y, T z) {
            T max = x;
            if (y.compareTo(max) > 0)
                max = y;
            if (z.compareTo(max) > 0)
                max = z;
            System.out.println("maximum value is :" + max);
        }

        public static void sort(int[] sortElements) {
            Arrays.sort(sortElements);
            System.out.println(Arrays.toString(sortElements));


        }

        findMaximumNumbers(T x, T y, T z) {
            testMax(x, y, z);
        }


        public void main(String[] args) {
            System.out.printf("Maximum of &d,&d and &d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
            System.out.printf("Maximum of %.if and %.if and %.if is %.if\n\n", 2.3, 4.7, 7.7, maximum(6.6, 8.8, 7.7));
            System.out.printf("Maximum of %s,%s and %s  is\n\n", "Apple", "Banana", "Peach", maximum("Apple", "Peach", "Banana"));
            findMaximumNumbers findMaximumNumbers= new findMaximumNumbers(10,20,30);
            FindMaximumNumbers.findMaximumNumbers.sort(new int[]{15, 2, 3});

        }
    }
}
