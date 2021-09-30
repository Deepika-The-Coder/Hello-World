Ques1:Find the minimum and maximum element in an array?
	
class  Javaarrayprograms
{
public int max(int[] array){
	int max=0;
	for(int i=0;i<array.length;i++)
	{
		if(array[i]>max){
			max=array[i];
		}
	}
	return max;
}
	public int min(int[]array){
		int min = array[0];
		for (int i=0;i<array.length;i++)
		{
			if(array[i]<min){
				min=array[i];
			}
		}
return min;
	}
	public static void main(String[] args) 
	{
	int array[]=new int[]{53,86,80,54,73,12};
	Javaarrayprograms m=new Javaarrayprograms();
	System.out.println("minimum of array is:" + m.max(array));
		System.out.println("maximum of array is: " +m.min(array));
	}
}

Ques2:Write a program to Reverse the array?

	
class Reverseanarray 
{
	public static void main(String[] args) 
	{
      int []array ={4,6,2,7,8,9};
	  System.out.println("original array :" );
	 for(int i=0;i<array.length;i++){
		 System.out.println(  array[i]+" ");
	 }
	System.out.println();
	 
System.out.println("reverse  array :");

	for(int i=array.length-1;i>=0;i--)
	{
		System.out.println(array[i]+" ");
	}
	}
}

Ques3:wrie a program to sort an array?
	class Sortingofanarray 
{
	public static void main(String[] args) 
	{
		int[]array=new int[]{55,87,65,45,64,34,83,1,3,6};
		int temp=0;
		System.out.println("original array:");
		for(int i=0;i<array.length;i++)
	System.out.println(array[i]);
	
	for(int i=0;i<array.length;i++){
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	System.out.println();
	System.out.println("after sorting array:");
	for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
	}
	}
}
	
Ques6:Find duplicate in an array?
	class Duplicatearray 
{
	public static void main(String[] args) 
	{
		int []array =new int []{7,8,4,9,6,3,2,5,9,9,9};
		System.out.println("Duplicate elements in an array: ");
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j])
					System.out.println(array[j]);
			}
		}

	}
}
		









		

