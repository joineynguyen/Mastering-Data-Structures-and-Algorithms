/*
 * Joiney Nguyen
 * 
 */
public class Prac2 
{
    static void selectionSort(int[] arr)
    {
        int arrSize = arr.length;
        int temp;
               
        for(int i = 0; i < arrSize - 1; i++)
        {
            int currentMinIndex = i;
            
            for(int j = i + 1; j < arrSize; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
           
            if(currentMinIndex != i)
            {
                temp = arr[i];
                arr[i] = arr[currentMinIndex];
                arr[currentMinIndex] = temp;
            }
            
            
        }
    }
	
	static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i ++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {9, 8, 7, 6, 3, 1, 2, 2};
		selectionSort(arr);
		printArray(arr);
		
	}
}
