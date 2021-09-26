
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

	