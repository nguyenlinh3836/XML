package JSON;
import java.io.*;
import java.util.*;
import com.mysql.cj.xdevapi.JsonArray;
import org.json.simple.*;
import org.json.simple.parser.*;
public class Main {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader("course.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("name");
            String course = (String)jsonObject.get("course");
            JSONArray subject = (JSONArray)jsonObject.get("subject");
            System.out.println("Name:"+ name);
            System.out.println("Course:" + course);
            System.out.println("Subject:");
            Iterator iterator = subject.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
