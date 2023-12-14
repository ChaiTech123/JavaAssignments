
public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []numArray={10,20,40,80,20,10,30,30,90,100};
		
		System.out.println("Please find the duplicate elements in the Array");
	
	
		for(int i=0;i<numArray.length-1;i++)
		{
			for(int j=i+1;j<numArray.length;j++)
			{
				if(numArray[i]==numArray[j] && i!=j)
				{
					System.out.println(numArray[i]);
				}
			}
		}
	}

}
