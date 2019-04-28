package math.problems;


import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        Arrays.sort(array);
        int i = 0;
        int n = array[i+1]- array[i];


        for(i = 0; i< array.length-1; i++){
            int a = array[i+1]- array[i];
            if(a>n  )
                n = a;

            /*switch(a) {
                case 2:
                    System.out.println((array[i] + array[i+1] ) /2);
                    break;
                default:
            }*/

            if ( a == 2)
            System.out.println((array[i] + array[i+1] ) /2);




        }


        }



    }
