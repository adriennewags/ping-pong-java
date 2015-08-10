import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.out;

public class PingPong {
	public static void main(String[] args) {
		String userInput = "32";
		ArrayList<String> arrayList;
		if (validateInput(userInput) == true) {
			arrayList = pingPong(Integer.parseInt(userInput));
			for(Integer i = 0; i < Integer.parseInt(userInput); i++ ) {
				System.out.println(arrayList.get(i));
			}
		}
	}
	public static Boolean validateInput(String userInput) {
		Integer input = 0;
		try {
			input = Integer.parseInt(userInput);
				if(input < 0) {
					return false;
				}
			} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static ArrayList<String> pingPong(Integer userInput) {
		ArrayList<String> pingPongList  = new ArrayList<String>();
		String listOutput;

		for(Integer i = 1; i <=userInput; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				listOutput = "ping-pong";
			}
			else if (i % 3 == 0) {
				listOutput = "ping";
			}
			else if (i % 5 == 0) {
				listOutput = "pong";
			}
			else {
				listOutput = Integer.toString(i);
			}

				pingPongList.add(listOutput);
		}
		return pingPongList;
	}

}
