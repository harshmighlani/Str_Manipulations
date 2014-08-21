package calNum;


public class PrintCom {

	public static void main(String[] args) {
		
		printComb(new char[]{'a','b','c','d','e'},4);
	}
	private static void printComb(char[] arr, int targetLength)
	{
		printAllKLengthRec(arr,"",arr.length, targetLength);
	}
	
	// The main recursive method to print all possible strings of length k
    static void printAllKLengthRec(char arrayinput[], String prefix, int arrayLen, int tarLen) {
        if (tarLen == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < arrayLen; ++i) {
            String newPrefix = prefix + arrayinput[i];
            printAllKLengthRec(arrayinput, newPrefix, arrayLen, tarLen - 1);
        }
    }
}
