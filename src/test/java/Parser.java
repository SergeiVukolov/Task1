import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Parser {


   // static String pathFile;

    static List getList(String pathFile) {
        ObjectMapper objectMapper = new ObjectMapper();
        File readjson = new File(pathFile);
        List admin_users_json = null;
        try {
            admin_users_json = objectMapper.readValue(readjson, List.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return admin_users_json;
    }
    static List getList1(String pathFile) {
        ObjectMapper objectMapper1 = new ObjectMapper(new YAMLFactory());
        File readyaml = new File(pathFile);
        List admin_users_yaml = null;
        try {
            admin_users_yaml = objectMapper1.readValue(readyaml, List.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return admin_users_yaml;
    }
}
