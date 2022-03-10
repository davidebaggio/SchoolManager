import java.io.*;
import java.util.ArrayList;

public class CSVReader {

	private File csvFile;

	public CSVReader(File csv) {
		this.csvFile = csv;
	}

	public CSVReader(String path) {
		csvFile = new File(path);
	}

	public boolean isFileOpen() {
		return csvFile.isFile();
	}

	public static void main(String[] args) throws IOException {
		CSVReader csv = new CSVReader("allEntity.csv");
		ArrayList<String[]> rawData = csv.parseCSV();
		for (String[] array : rawData) {
			for (String s : array) {
				System.out.print(s + " ");
			}
			System.out.println("\n");
		}
	}

	public ArrayList<String[]> parseCSV() throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader(csvFile));
		ArrayList<String[]> parsedArray = new ArrayList<String[]>();
		String row;
		while ((row = bf.readLine()) != null) {
			String[] data = row.split(",");
			parsedArray.add(data);
		}
		bf.close();
		return parsedArray;
	}
}
