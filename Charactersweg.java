package opdrachten;

public class Charactersweg {
	public static void main(String[] args) {
		System.out.println(RemoveChar(args[0]));
	}
	
	//Methode 1
	public static String RemoveChar(String string) {
		String[] weg = {",","h","d"};
		for(int i = 0; i < weg.length; i++) {
			string = string.replace(weg[i], "");
		}
		return string;
	}
}
