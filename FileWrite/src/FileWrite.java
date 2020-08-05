import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {
		String sentence = " ";
		Scanner input = new Scanner(System.in);

		try {
			FileWriter fw = new FileWriter(
					"C:\\Users\\Katie\\Documents\\Katie Grad School\\Computer Science Fund\\userStrings.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outFile = new PrintWriter(bw);

			while (!sentence.equals("DONE")) {
				System.out.println("Please enter a sentence (type DONE to quit): ");
				sentence = input.nextLine();
				// All lines will print in the text file except for DONE
				if (!sentence.equals("DONE")) {
					outFile.print(sentence);
					outFile.println();
				}

			}

			input.close();
			outFile.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
