package calNum;

public class SubsetTest {

	public static void main(String[] args) {
		
		findNumbers(new int[]{1,2,3,4,5,6,7,8,9}, 0,0,12,"");
	}
	public static void findNumbers(int[] list, int index, int current, int goal, String result)
	{
		if (list.length < index || current>goal)
			return;
		for (int i = index; i < list.length; i++) {
			if (current + list[i] == goal) {
				System.out.println(result + " " + list[i]);
			}
			else if (current + list[i] < goal) {
				findNumbers(list, i + 1, current + list[i], goal, result + " " + list[i]);
			}
		}
	} 
}
