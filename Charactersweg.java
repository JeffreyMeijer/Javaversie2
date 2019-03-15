package opdrachten;

public class Charactersweg {
	public static void main(String[] args) {
		System.out.println("Methode 1: " + RemoveChar(args[0]));
		System.out.println("Methode 2: " + Methode2(args[0]));
		System.out.println("Methode 3: " + Methode3(args[0]));
	}
	
	//Methode 1
	public static String RemoveChar(String string) {
		String[] weg = {",","h","d"};
		for(int i = 0; i < weg.length; i++) {
			string = string.replace(weg[i], "");
		}
		return string;
	}
	//Methode 2
	public static String Methode2(String string) {
		return string.replaceAll("[a-e]","");
	}
	//Methode 3
	public static String Methode3(String string) {
		return string.replaceFirst("h", "b");
	}
}