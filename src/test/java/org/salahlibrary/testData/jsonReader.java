package org.salahlibrary.testData;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class jsonReader {
    public List<HashMap<String, String>> getJsonData(String filePath) throws IOException {
        String jsonString = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String, String>> jsonData = mapper.readValue(jsonString, new TypeReference<List<HashMap<String, String>>>() {
        });
        return jsonData;
    }
}
