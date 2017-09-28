package michael.demo;

import com.google.gson.Gson;
import michael.pojo.Person;

/**
 * @author https://www.iwwenbo.com
 */
public class JsonToJavaDemo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person michael = gson.fromJson("{\"name\":\"Michael\",\"age\":2}",Person.class);
        System.out.println(michael.getAge());
    }
}
