package helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Armandho
 */

public class Dotenv {
    private final Map<String, String> envVariables;

    public Dotenv(String filePath) {
        this.envVariables = loadEnvVariables(filePath);
    }

    private Map<String, String> loadEnvVariables(String filePath) {
        Map<String, String> variables = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    variables.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return variables;
    }

    public String get(String key) {
        return envVariables.get(key);
    }

}
