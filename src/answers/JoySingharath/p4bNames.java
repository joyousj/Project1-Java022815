package answers.JoySingharath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class p4bNames {

	public static void main(String[] args) throws IOException  {
		List<String> names = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("/Users/Joys/Documents/Project1-Java022815/src/resources/names.txt"));
		FileWriter wr = new FileWriter("/Users/Joys/Documents/Project1-Java022815/src/answers/JoySingharath/p4aNames.txt");
		String[] str = null;

		String line = br.readLine();
		names.add(line);
		br.close();

		for(String s : names)
			str = s.toString().split(",");
		for(int i = 0; i < str.length; i++)
			str[i] = str[i].replaceAll("\"", "");
		Arrays.sort(str);

		for(String s : str)
			wr.write(s + "\n");
		wr.close();

		FileWriter wr2 = new FileWriter("/Users/Joys/Documents/Project1-Java022815/src/answers/JoySingharath/p4aNames.txt");
		long[] namesScores = new long[str.length];
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length(); j++){
				namesScores[i] += (str[i].charAt(j)- 64) * ( i + 1);
			} wr2.write(str[i] + ": " + namesScores[i] + "\n");
		} wr2.close();
		
	
	}
}
