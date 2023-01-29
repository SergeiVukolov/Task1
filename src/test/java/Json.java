
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.testng.internal.Yaml;
import org.testng.internal.YamlParser;


import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Json {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File readjson = new File("Data/admin_users.json");
        List json1 = objectMapper.readValue(readjson, List.class);
        System.out.println(json1);

        ObjectMapper objectMapper1 = new ObjectMapper(new YAMLFactory());
        List yaml1 = objectMapper1.readValue(new File("Data/admin_users.yaml"), List.class);
        System.out.println(yaml1);

        ObjectMapper objectMapper2 = new ObjectMapper();
        File readjson1 = new File("Data/regular_users.json");
        List json2 = objectMapper2.readValue(readjson1, List.class);
        System.out.println(json2);

        ObjectMapper objectMapper3 = new ObjectMapper(new YAMLFactory());
        List yaml2 = objectMapper3.readValue(new File("Data/regular_users.yaml"), List.class);
        System.out.println(yaml2);


    }
}



