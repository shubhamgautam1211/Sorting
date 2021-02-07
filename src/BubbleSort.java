import java.util.Scanner;

public class BubbleSort {

	 static void bubbleSort(int[] arr) {  
	        int size = arr.length;  
	        int swap = 0; 
	        
	         for(int i=0; i < size; i++){  
	                 for(int j=1; j < (size-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 swap = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = swap;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }  
	 
	    public static void main(String[] args) {  
	    	
	    	Scanner s = new Scanner(System.in);
	    	
	    	System.out.println("Enter the length of the array:");
	        int length = s.nextInt();
	        
	        int [] arr = new int[length];
	        System.out.println("Enter the elements of the array:");
	        
	        for(int i=0; i<length; i++ ) {
	           arr[i] = s.nextInt();
	        }
	                 
	                System.out.println("Array Before Bubble Sort");  
	                for(int i=0; i < arr.length; i++){  
	                        System.out.print(arr[i] + " ");  
	                }  
	                System.out.println();  
	                  
	                bubbleSort(arr);//sorting array elements using bubble sort  
	                 
	                System.out.println("Array After Bubble Sort");  
	                for(int i=0; i < arr.length; i++){  
	                        System.out.print(arr[i] + " ");  
	                }  
	   
	        }  

}
