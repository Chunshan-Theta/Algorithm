//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    int[] arr = {51,39,62,32,89,21,3,35,70,34};
    quick_sort myObject = new quick_sort(arr);
    for(int element : myObject.arr) {
        System.out.print(element);
        System.out.print(",");
    }
    
  }
}

class quick_sort {
	int[] arr;
    
    private void Output(){
        for(int element : arr) {
         System.out.print(element);
         System.out.print(",");
        }
         System.out.print("\n----------------------\n");
    }

	private void swap(int x, int y) {
        System.out.print("x="+x);
        System.out.print(",y="+y);
        System.out.print("\n");     
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
        Output();
	}

	private void quick_sort_recursive(int start, int end) {
		if (start >= end)
			return;
		int left = start, right = end - 1;
		
        while (left < right) {
			while (arr[left] < arr[end] && left < right)
				left++;
			while (arr[right] >= arr[end] && left < right)
				right--;
			swap(left, right);
		}
        
        if (arr[left] >= arr[end]){
			swap(left, end);
        }
		else
			left++;
        //set refrence to var.left
		quick_sort_recursive(start, left - 1);//left 
		quick_sort_recursive(left + 1, end);//right 
	}

	public quick_sort(int[] arrin) {        
		arr = arrin;
        Output();
		quick_sort_recursive(0, arr.length - 1);
	}
}

