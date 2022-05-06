package baithuchanh4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static ArrayList<Double> readFile() throws FileNotFoundException {

		File txt = new File("C:\\Users\\Admin\\Documents\\workspace-spring-tool-suite-4-4.13.1.RELEASE\\BaiTap\\src\\baithuchanh4\\input.txt");
		Scanner scanner = new Scanner(txt);
		ArrayList<Double> data = new ArrayList<Double>();
		while (scanner.hasNextDouble()) {
			data.add(scanner.nextDouble());
		}
		return data;
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Double> data = readFile();
		data.sort(null);
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\Admin\\Documents\\workspace-spring-tool-suite-4-4.13.1.RELEASE\\BaiTap\\src\\baithuchanh4\\sapxep.txt");
			for (int i = 0; i < data.size(); i++) {
				myWriter.write(data.get(i) + " ");
			}
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}