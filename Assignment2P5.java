/*Assignment2P5
A
B B
C C C
D D D D
E E E E E
*/

class Assignment2P5
{
		public static void main(String args[])
		{
			int alpha=64;
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print((char)(alpha+i)+" ");
				}
				System.out.println();
			}
		}
}