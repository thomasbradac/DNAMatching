import java.util.Scanner;
public class StrandDNA
	{

		public static void main(String[] args)
			{
				DNA();

			}
		
		public static void DNA()
		{
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("Welcome! Provide a 10 character DNA sequence containing A, T, G, and C, and I will print the corresponding strand.");
			String givenStrand = userStringInput.nextLine();
			String[] givenArray = new String[10];
			givenArray = givenStrand.split("");
			String result = "" ;
			
			
			for (int i = 0; i < 10; i++)
				{
					if (givenArray[i].equals("A") || givenArray[i].equals("a"))
						{
							result += "T";
						}
					else if (givenArray[i].equals("T") || givenArray[i].equals("t"))
						{
							result += "A";
						}
					else if (givenArray[i].equals("G") || givenArray[i].equals("g"))
						{
							result += "C";
						}
					else if (givenArray[i].equals("C") || givenArray[i].equals("c"))
						{
							result += "G";
						}
					else
						{
							System.out.println("That is a mutation!");
							System.exit(0);
						}
					
					
				}
		
			System.out.println(result);
				
		}

	}
