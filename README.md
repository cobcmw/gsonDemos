google gson使用示例代码


## 将Java对象转换为Json字符串





## 将Json字符串转换为Java对象

* 示例1

```
{"name":"Michael","age":2}
```
转换代码：

```
Gson gson = new Gson();
Person michael = gson.fromJson("{\"name\":\"Michael\",\"age\":2}",Person.class);
System.out.println(michael.getAge());
```

* 示例2

```
{"status":"0","msg":"","data":[{"GMSFHM":"3890871234","XM":"王**","XB":"男","MZ":"汉","CSRQ":"1993","CSD_GJHDQ":"出生地国家（地区）","CSD_SSXQ":"出生地省市县（区）","CSD_QHNXXDZ":出生地详址,"JG_GJHDQ":"籍贯国家（地区）","JG_SSXQ":"籍贯省市县（区）","WHCD":"文化程度","HYZK":"婚姻状况","BYZK":"兵役状况","SG":"177","ZY":"职业","FWCS":"服务处所","HJD_SSXQ":"户籍地址省市县（区）","HJD_QHNXXDZ":"户籍地址详址","ZXBZ":"注销标识","PCS":"所属公安机关名称"}]}
```

转换代码：

```
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
```

