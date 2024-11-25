/*
 * import java.util.*;
 * 
 * public class practiceSet6 {
 * public static void main(String[] args) {
 * float[] marks = { 82.3f, 55.3f, 96.3f };
 * float sum = 0;
 * for (float f : marks) {
 * sum += f;
 * 
 * }
 * System.out.println("the sum value of these marks is : : "+ sum);
 * 
 * float[] marks = { 82.3f, 55.3f, 96.3f };
 * float sum = 0;
 * for (float f : marks) {
 * sum += f;
 * 
 * }
 * System.out.println("the sum value of these marks is : : "+ sum);
 * System.out.println("the average value of these marks is : : "+
 * sum/marks.length);
 * 
 * int mat1[][] = { { 2, 4, 6 },
 * { 1, 3, 5 } };
 * int mat2[][] = { { 8, 10, 12 },
 * { 7, 9, 11 } };
 * int result[][] = { { 0, 0, 0 },
 * { 0, 0, 0 } };
 * 
 * Matrices Addtion!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * for (int i = 0; i < mat1.length; i++) {
 * for (int j = 0; j < mat1[i].length; j++) {
 * result[i][j] = mat1[i][j] + mat2[i][j];
 * }
 * System.out.println();
 * }
 * 
 * for (int i = 0; i < mat1.length; i++) {
 * for (int j = 0; j < mat1[i].length; j++) {
 * System.out.print(result[i][j] + " ");
 * result[i][j] = mat1[i][j] + mat2[i][j];
 * }
 * System.out.println();
 * }
 * float[] marks = { 82.3f, 55.3f, 96.3f };
 * for (int i = marks.length; i <= 0; i--) {
 * System.out.println(marks);
 * }
 * 
 * Reverse array!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * int[] arr = { 1, 2, 3, 4, 5, 6 };
 * int l = arr.length;
 * int n = Math.floorDiv(2, 2);
 * int temp;
 * for (int i = 0; i < n; i++) {
 * temp = arr[i];
 * arr[i] = arr[l - i - 1];
 * arr[l - i - 1] = temp;
 * }
 * for (int elements : arr) {
 * System.out.print(elements + " ");
 * }
 * 
 * maximum value find!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * int max = 0;
 * for (int e : arr) {
 * if (e > max) {
 * max = e;
 * }
 * }
 * System.out.println("the max value in this array is "+max);
 * 
 * Check Array is sorted or not!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * boolean isSorted = true;
 * int[] arr = { 1, 2, 3, 4, 5, 6 };
 * for (int i = 0; i < arr.length - 1; i++) {
 * if (arr[i] > arr[i + 1]) {
 * isSorted = false;
 * break;
 * }
 * }
 * if (isSorted) {
 * System.out.println("array is sorted");
 * } else {
 * System.out.println("array is not sorted");
 * }
 * }
 * }
 */
