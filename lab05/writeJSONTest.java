package JSON;
import com.mysql.cj.xdevapi.JsonArray;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class writeJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstname", "Dang");
        employeeDetails.put("lastname", "Kim Thi");
        employeeDetails.put("website","codelean.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstname","Code");
        employeeDetails2.put("lastname","Lean");
        employeeDetails2.put("website","codelean.vn");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject.put("employee", employeeDetails2);

        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeDetails2);

        try(FileWriter file = new FileWriter("employee.json")) {
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
