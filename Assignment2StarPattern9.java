/* Star Pattern9
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/
class Assignment2StarPattern9
{
	public static void main(String args[])
	{
		//Upper-L
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//lower-L
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
	}
}
	