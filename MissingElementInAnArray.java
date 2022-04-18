package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,36,8,6,5};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("sorted array is: "+arr[i]);
		}
		
	}

}
