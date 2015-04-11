package answers.JoySingharath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P5 {

	public static void main(String[] args) throws IOException  {

		List<String> bignums = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("/Users/Joys/Documents/ClaimAcademy/Project1-Java022815/src/resources/longnums.txt"));
		FileWriter wr = new FileWriter("/Users/Joys/Documents/p5a.txt");
		
		while(true) {
			String line = br.readLine();
			if(line.isEmpty())
				break;
			bignums.add(line);
		} br.close();

		Collections.sort(bignums);
		System.out.println(bignums);
		
		for(String s : bignums)
			wr.write(s+ "\n");
		wr.close();

		BigInteger total = new BigInteger(bignums.get(0));
		for(int i = 1; i < bignums.size(); i++) {
			BigInteger j = new BigInteger(bignums.get(i));
			total = total.add(j);
		}
		
		String newtotal = total.toString();
		System.out.println("The first 10 digits total: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(newtotal.charAt(i));
		}
	}


}
