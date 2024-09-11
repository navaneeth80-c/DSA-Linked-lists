import java.util.*;

public class MergeSOrt
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int[] array = new int[20];
		for(int i=0;i<20;i++)
		{
			array[i] = rand.nextInt(100);
		}
		printArray(array);
		mergeSort(array,0,array.length-1);
		printArray(array);
	}
	
	public static void printArray(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public static void mergeSort(int[] arry,int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		int mid = start+(end-start)/2;
		mergeSort(arry,start,mid);
		mergeSort(arry,mid+1,end);
		mergeFunction(arry,start,mid,end);
	}
	
	
	public static void mergeFunction(int[] num,int start,int mid,int end)
	{
	int[] newArray = new int[end-start+1];
	int l = start,r=mid+1,j=0;
	
	while(l<=mid && r<=end)
	{
		if(num[l]<num[r])
		{
			newArray[j++] = num[l++];
		}
		else
		{
		newArray[j++] = num[r++];
		}
	
	}
	while(l<=mid)
	{
		newArray[j++] = num[l++];
	}
	while(r<=end)
	{
		newArray[j++] = num[r++];
	}
	 l=start;
	for(int i =0 ;i<newArray.length;i++)
	{
		num[l++] = newArray[i];
	}
	}
	}
