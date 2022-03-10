import java.io.*;
import java.util.ArrayList;

public class CSVWriter {

	private File CSVWriter;

	public CSVWriter(File file) {
		this.CSVWriter = file;
	}

	public CSVWriter(String path) {
		this.CSVWriter = new File(path);
	}

	public static void main(String[] args) throws IOException {
		CSVWriter csv = new CSVWriter("allEntity.csv");
		String[] array = { "cikao", "euahuiwad", "iuefiajdojawod", "iefiahiae" };
		ArrayList<String[]> str = new ArrayList<String[]>();
		str.add(array);
		csv.writeParsed(str);
	}

	public void writeParsedSingleEntity(String[] entity) throws IOException {
		FileWriter fw = new FileWriter(CSVWriter, true);
		fw.append("\n");
		fw.append(String.join(",", entity));
		fw.flush();
		fw.close();
	}

	public void writeParsed(ArrayList<String[]> rawData) throws IOException {
		FileWriter fw = new FileWriter(CSVWriter, true);
		for (String[] s : rawData) {
			fw.append("\n");
			fw.append(String.join(",", s));
			fw.append("\n");
		}
		fw.flush();
		fw.close();
	}

}
