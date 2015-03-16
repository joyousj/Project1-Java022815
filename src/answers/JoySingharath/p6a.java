package answers.JoySingharath;

public class p6a {


	public static String rankToString(int rank) {
		switch(rank) {
		case 0: return "Bust";
		case 1: return "Pair";
		case 2: return "Two Pair";
		case 3: return "3 of a Kind";
		case 4: return "Straight";
		case 5: return "Flush";
		case 6: return "Full House";
		case 7: return "4 of a Kind";
		case 8: return "Straight Flush";
		case 9: return "Royal Flush";
		default: return "Error";
		}
	}
}
