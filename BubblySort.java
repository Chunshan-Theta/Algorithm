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
    BubblySort myObject = new BubblySort(arr);
  }
 
}

// you can add other public classes to this editor in any order
class BubblySort {
	int[] arr;
    
    private void Output(){
        for(int element : arr) {
         System.out.print(element);
         System.out.print(",");
        }
         System.out.print("\n----------------------\n");
    }

    public int[] BubblySortCompute(int[] arrin){
      for(int i =0;i<arrin.length;i++){
        for(int j =0;j<arrin.length-1;j++){
          if(arrin[j]>arrin[j+1]){
              int temp = arrin[j];
              arrin[j] = arrin[j+1];
              arrin[j+1] = temp;
          }
        }
      }
      return arrin;  
    }

	public BubblySort(int[] arrin) {        
		arr = arrin;
        Output();
		arr = BubblySortCompute(arrin);
        Output();
	}
}
