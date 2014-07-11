public class CountOccurrenceInString {

	public static void main(String[] args) {
		String input = "aaaabbccccddddd";
		
		StringBuilder output =new StringBuilder();
		//aaaabbccddd
		
		int count = 0;
		for(int i=0;i<input.length()-1;i++)
		{
			if(input.charAt(i+1) == input.charAt(i))
			{
				 ++count;
			}else
			{
				
				output.append(input.charAt(i));
				output.append(count+1);
				count = 0;
			}
			
		}
		if(!(output.toString().charAt(output.length()-2) == (input.charAt(input.length()-1))))
		{//aabbccddd
			output.append(input.charAt(input.length()-1));
			
			output.append((input.length())- input.indexOf(input.charAt(input.length()-1)));
		}
		System.out.println(output.toString());
	}
}
