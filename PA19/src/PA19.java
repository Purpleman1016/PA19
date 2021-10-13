/***Note to student - Copy and paste this file into Eclipse as PA19.java*/
/*
Name:
Block:
Program: PA19
Date:
*/

//All of the imports
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;



class PA19 {
  /*
   * Return an array of numbers that is typed in by the user.
   */
   public static int[] getNumbers(){
    Scanner scan = new Scanner(System.in);
    //In the lines below, ask the user for how large the array will be and read it in with the scanner
    System.out.print("How large is the array going to be: ");
    int arrayLength = scan.nextInt();
    
    //On the line below, make an array the size the user requested.
    //The line that is there by default only makes an array of size 0.
    int[] array = new int[arrayLength];
    
    //In the lines below, ask the user for numbers to fill the array.
    //You will need a loop to do this.
    	int a = 0;
    	for(int i = 0; i < array.length; i++) {
    		System.out.print("Please give me an int: ");
    		a = scan.nextInt();
    		array[i] = a;
    		
    	}




    return array; //This obviously returns the array.
   }

  /*
   * Print the array such that an array holding the numbers 1, 2, and 3 print like
   * [1, 2, 3]
   */
   public static void printArray(int[] array){
     //In this method, you should print on one line the entire array. It of course, returns nothing.
	   System.out.print("[");
	   for(int i = 0; i < array.length; i++) {
		   if(i < array.length - 1) {
			   System.out.print(array[i]+" , ");
		   }
		   System.out.print("");
	   }
	   System.out.print(array[array.length - 1] + "]");
	  
     
   }


  /*
   * Given an array of ints, return true if the number 6 is either the first or last element in the array. 
   * Assume the array will be length 1 or more.
   */
  public static boolean firstLast6(int[] nums) {
	  	if(nums[0] == 6 || nums[nums.length - 1] == 6) {
	  		return true;
		  
		  
	  }
	  	return false;
	  
	  
	  
	  
	  
	  
  }
  /*
   * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
   */
  public static boolean sameFirstLast(int[] nums) {
    if(nums.length > 0 && nums[0] == nums[nums.length - 1] ) {
    	return true;
    }
    return false;
  }
  /*
   * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
   */
  public static int[] reverse3(int[] nums) {
    int[] reverse = new int[nums.length];
    int j = 0;
    	for(int i = nums.length - 1; i >= 0; i--) {
    		reverse[j] = nums[i];
    		j++;
    		
    	}
    	return reverse;
    }
  
  /*
   * Given 2 int arrays, a and b, each at a random length, return a new array length 2 containing their middle elements.
   * For the purpose of this question, only odd numbered lengths will be checked.
   */
  public static int[] middleWay(int[] a, int[] b) {
    int[] finale = new int[2];
    
  }
  /*
   * Return the number of even ints in the given array.
   * Do not assume the array length. You will need a loop!
   */
  public static int countEvens(int[] nums) {
    return 0; //Delete this line. Is included just so the rest of your code complies.
  }

  /*
   * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
   * If the largest and smallest are the same, return 0.
   */
  public static int bigDiff(int[] nums) {
    return 0; //Delete this line. Is included just so the rest of your code complies.
  }

  /*
   * Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). 
   * Return the count of the number of times the elements are equal.
   */
  public static int matchUp(int[] nums1, int[] nums2) {
    return 0; //Delete this line. Is included just so the rest of your code complies.
  }

  /*
   * Given an array, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
   * Note this is different than reverse3 as you now don't know the lenght of the array.
   * Assume the length of the array is at least 1.
   */
  public static int[] reverse(int[] nums) {
    int array[] = new int[0]; //Delete this line. Is included just so the rest of your code complies.
    return array; //Delete this line. Is included just so the rest of your code complies.
  }

  /*
   *****DO NOT MODIFY THE MAIN METHOD*****
   */
  public static void main(String[] args) {
    int[] daArray = getNumbers();
    Scanner scan = new Scanner(System.in);
    System.out.println("Please choose a method you would like to run by calling the number by it: ");
    System.out.println("1) printArray");
    System.out.println("2) firstLast6");
    System.out.println("3) sameFirstLast");
    System.out.println("4) reverse3");
    System.out.println("5) middleWay");
    System.out.println("6) countEvens");
    System.out.println("7) bigDiff");
    System.out.println("8) matchUp");
    System.out.println("9) reverse");
    System.out.print("Choice: ");
    int choice = scan.nextInt(); //Get the user choice
    if(choice==1){
      printArray(daArray);
    }
    else if(choice==2){
      System.out.println("Result was " + firstLast6(daArray));
    }else if(choice==3){
      System.out.println("Result was " + sameFirstLast(daArray));
    }else if(choice==4){
      System.out.print("The array in reverse order is: ");
      printArray(reverse3(daArray));
    }else if(choice==5){
      System.out.println("This one needs another array! Please type it in...");
      int[] daArray2 = getNumbers();
      System.out.print("The array that contains the middle of the two arrays entered is: ");
      printArray(middleWay(daArray, daArray2));
    }else if(choice==6){
      System.out.println("Result was " + countEvens(daArray));
    }else if(choice==7){
      System.out.println("Result was " + bigDiff(daArray));
    }else if(choice==8){
      System.out.println("This one needs another array of size "+ daArray.length +", please type it in...");
      int[] daArray2 = getNumbers();
      if(daArray.length != daArray2.length){
        System.out.println("ERROR: The arrays should have been the same size.");
      }
      else{
        System.out.print("Result was " + matchUp(daArray, daArray2));
      }
    }else if(choice==9){
      System.out.print("The array in reverse should be: ");
      printArray(reverse(daArray));
    }else{
      System.out.println("Error");
    }
  }
}