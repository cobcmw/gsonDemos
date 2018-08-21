package michael.pojo;

import java.io.Serializable;
import java.util.List;

public class HjxxResult implements Serializable {
    private String status;
    private String msg;
    private List<michael.pojo.Hjxx> data;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<michael.pojo.Hjxx> getData() {
        return data;
    }

    public void setData(List<michael.pojo.Hjxx> data) {
        this.data = data;
    }
}
