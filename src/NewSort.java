import java.util.Scanner;


public class NewSort {
//INSERTION SORT 
	public static void insertionSort(int arr[])
	{  
        int size = arr.length;  
        
        for (int j = 1; j < size; j++) 
        {  
            int key = arr[j];  
            int i = j-1;  
            
            while ( (i > -1) && ( arr [i] > key ) )
            {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
    }  
       
    public static void main(String args[])
    {    
    	
    	Scanner s = new Scanner(System.in);
    	
    	System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        
        int [] arr = new int[length];
        System.out.println("Enter the elements of the array:");
        
        for(int i=0; i<length; i++ ) {
           arr[i] = s.nextInt();
        }
         
        System.out.println("Before Insertion Sort"); 
        
        for(int i:arr)
        {    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");  
        
        for(int i:arr)
        {    
            System.out.print(i+" ");    
        }    
    }    
}