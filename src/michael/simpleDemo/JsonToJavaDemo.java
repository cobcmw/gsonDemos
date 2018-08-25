package michael.simpleDemo;

import com.google.gson.Gson;
import michael.simpleDemo.pojo.Hjxx;
import michael.simpleDemo.pojo.HjxxResult;
import michael.simpleDemo.pojo.Person;

import java.util.List;

/**
 * @author https://www.rxblog.xyz
 */
public class JsonToJavaDemo {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Person michael = gson.fromJson("{\"name\":\"Michael\",\"age\":2}", Person.class);
        System.out.println(michael.getAge());

        String jsonStr = "{\"status\":\"0\",\"msg\":\"\",\"data\":[{\"GMSFHM\":\"3890871234\",\"XM\":\"王**\",\"XB\":\"男\",\"MZ\":\"汉\",\"CSRQ\":\"1993\",\"CSD_GJHDQ\":\"出生地国家（地区）\",\"CSD_SSXQ\":\"出生地省市县（区）\",\"CSD_QHNXXDZ\":出生地详址,\"JG_GJHDQ\":\"籍贯国家（地区）\",\"JG_SSXQ\":\"籍贯省市县（区）\",\"WHCD\":\"文化程度\",\"HYZK\":\"婚姻状况\",\"BYZK\":\"兵役状况\",\"SG\":\"177\",\"ZY\":\"职业\",\"FWCS\":\"服务处所\",\"HJD_SSXQ\":\"户籍地址省市县（区）\",\"HJD_QHNXXDZ\":\"户籍地址详址\",\"ZXBZ\":\"注销标识\",\"PCS\":\"所属公安机关名称\"}]}";
        HjxxResult result = gson.fromJson(jsonStr, HjxxResult.class);
        if ("0".equals(result.getStatus())) {
            List<Hjxx> hjxxList = result.getData();
            //入库
            if (hjxxList != null && hjxxList.size() > 0) {
                for (Hjxx hjxx : hjxxList) {
                    System.out.println(hjxx.getMZ());
                }
            }
        }
    }


}
