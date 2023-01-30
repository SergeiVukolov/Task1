
import com.beust.ah.A;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.Yaml;
import org.testng.internal.YamlParser;


import java.io.File;
import java.io.IOException;
import java.util.*;


public class Json {


    public static void main(String[] args) throws IOException {

        //Parser.pathFile = "Data/admin_users.json";
        List admin_users_json = Parser.getList("Data/admin_users.json");
        List admin_users_yaml = Parser.getList1("Data/admin_users.yaml");
        List regular_users_json = Parser.getList("Data/regular_users.json");
        List regular_users_yaml = Parser.getList1("Data/regular_users.yaml");

        Assert.assertTrue(admin_users_yaml.containsAll(admin_users_json), "Admin_users.yaml doesn't contain Admin_users.json");
        Assert.assertTrue(regular_users_yaml.containsAll(regular_users_json), "Regular_users.yaml contains Regular_users.json");




//        for (int i=0;i < users.size()-1;i++){
//           LinkedHashMap user = (LinkedHashMap) users.get(i);
//            List<Users> listValues = new ArrayList<Users>(user.values());
//            int id = (int) ((LinkedHashMap) ((ArrayList) users).get(0)).get("id");
//            String name = (String) ((LinkedHashMap) ((ArrayList) users).get(0)).get("name");
//            int a=1;







    }
}



