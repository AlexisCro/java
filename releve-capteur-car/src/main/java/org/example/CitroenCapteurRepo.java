package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CitroenCapteurRepo implements CapteurRepo {
    final String CHEMIN_FICHIER = "C:\\Users\\alexi\\OneDrive\\Documents\\ISITECH\\java\\releve-capteur-car\\src\\main\\resources\\citroen.csv";

    public List<ReleveCapteur> getAllReleveCapteur() {
        List<ReleveCapteur> releves = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(CHEMIN_FICHIER))) {
            List<String[]> lines = (List<String[]>) csvReader;

            for (String[] line : lines) {

                int id = Integer.parseInt(line[0]);
                String machina = line[1];
                Double releve = Double.parseDouble(line[2]);

                ReleveCapteur values = new ReleveCapteur(id, machina, releve);

                releves.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return releves;
    }
}
