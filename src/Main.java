import com.opencsv.*;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String csvFilename = "woordenlijst.csv";
        CSVReader csvReader = null;
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("output.tex", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            csvReader = new CSVReader(new FileReader(csvFilename), ';');

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] row = null;
        try {
            while((row = csvReader.readNext()) != null) {
                if (writer != null) {
                    writer.println("\\dictentry{" + row[1] + "}{}{"
                            + row[2] + "}{"
                            + row[3] + "}{"
                            + row[0] + "}" +
                                    "{}" +
                                    "{}" +
                                    "{}"
                            );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//...
        try {
            csvReader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
