import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {

		String input = "C:\\Users\\Katie\\Documents\\Katie Grad School\\Computer Science Fund\\input.csv";
		File file = new File(input);
		Scanner fileScan = new Scanner(file);

		System.out.println("Maximum values");
		while (fileScan.hasNext()) {
			String str = (fileScan.nextLine());
			// Splits the columns up so I can use an array
			String[] column = str.split(",");
			System.out.println("ROW " + column[0] + ": " + column[4]);

		}
		fileScan.close();

	}

}
