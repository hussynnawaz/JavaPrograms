
package AllPrograms;


public class Array_Sorting {
    public static void main(String[] args) {        
            
           
        int [] arr = new int [] {5, 2, 8, 7, 1, 10, 22, 95, 65, 47, 18, 9};     
        int temp = 0;    
            
     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
  
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
                   
      
        System.out.println("\nElements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}
