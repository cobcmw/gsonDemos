package michael.demo;

import com.google.gson.Gson;
import michael.pojo.Company;
import michael.pojo.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  https://www.rxblog.xyz
 */
public class JavaToJsonDemo {
    public static void main(String[] args) {
        Person jack = new Person();
        jack.setName("Jack");
        jack.setAge(1);
        Person michael = new Person();
        michael.setName("Michael");
        jack.setAge(5);
        Gson gson = new Gson();
        //示例1
        System.out.println("================示例1==========");
        System.out.println(gson.toJson(jack));

        Company myCompany = new Company();
        myCompany.setAddress("山东济南");
        List<Person> personList = new ArrayList<>();
        personList.add(jack);
        personList.add(michael);
        myCompany.setEmployees(personList);

        //示例2
        System.out.println("================示例2==========");
        System.out.println(gson.toJson(personList));

        //示例3
        System.out.println("================示例3==========");
        System.out.println(gson.toJson(myCompany));


    }
}
