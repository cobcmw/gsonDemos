package michael.pojo;

import java.io.Serializable;

/**
 * 户籍信息实体类
 */
public class Hjxx implements Serializable {

    /**
     * 主键
     */
    private String PID;

    /**
     * 查询单主键
     */
    private String APPLY_ID;

    /**
     * 查询单对象主键
     */
    private String APPLY_OBJECT_ID;

    /**
     * 查询信息源主键
     */
    private String APPLYDS_INFO_ID;

    /**
     * 公民身份证号
     */
    private String GMSFHM;

    /**
     * 姓名
     */
    private String XM;

    /**
     * 性别
     */
    private String XB;

    /**
     * 民族
     */
    private String MZ;

    /**
     * 出生日期
     */
    private String CSRQ;

    /**
     * 出生地国家（地区）
     */
    private String CSD_GJHDQ;

    /**
     * 出生地省市县（区）
     */
    private String CSD_SSXQ;

    /**
     * 出生地详址
     */
    private String CSD_QHNXXDZ;

    /**
     * 籍贯国家（地区）
     */
    private String JG_GJHDQ;

    /**
     * 籍贯省市县（区）
     */
    private String JG_SSXQ;

    /**
     * 文化程度
     */
    private String WHCD;

    /**
     * 婚姻状况
     */
    private String HYZK;

    /**
     * 兵役状况
     */
    private String BYZK;

    /**
     * 身高
     */
    private String SG;

    /**
     * 职业
     */
    private String ZY;

    /**
     * 服务处所
     */
    private String FWCS;

    /**
     * 户籍地址省市县（区）
     */
    private String HJD_SSXQ;

    /**
     * 户籍地址详址
     */
    private String HJD_QHNXXDZ;

    /**
     * 注销标识
     */
    private String ZXBZ;

    /**
     * 所属公安机关名称
     */
    private String PCS;

    private String crtUserId;

    private String crtUserName;

    private String crtTime;

    private String updateUserId;

    private String updateUserName;

    private String updateTime;

    private String remark;

    public Hjxx() {
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getAPPLY_ID() {
        return APPLY_ID;
    }

    public void setAPPLY_ID(String APPLY_ID) {
        this.APPLY_ID = APPLY_ID;
    }

    public String getAPPLY_OBJECT_ID() {
        return APPLY_OBJECT_ID;
    }

    public void setAPPLY_OBJECT_ID(String APPLY_OBJECT_ID) {
        this.APPLY_OBJECT_ID = APPLY_OBJECT_ID;
    }

    public String getAPPLYDS_INFO_ID() {
        return APPLYDS_INFO_ID;
    }

    public void setAPPLYDS_INFO_ID(String APPLYDS_INFO_ID) {
        this.APPLYDS_INFO_ID = APPLYDS_INFO_ID;
    }

    public String getGMSFHM() {
        return GMSFHM;
    }

    public void setGMSFHM(String GMSFHM) {
        this.GMSFHM = GMSFHM;
    }

    public String getXM() {
        return XM;
    }

    public void setXM(String XM) {
        this.XM = XM;
    }

    public String getXB() {
        return XB;
    }

    public void setXB(String XB) {
        this.XB = XB;
    }

    public String getMZ() {
        return MZ;
    }

    public void setMZ(String MZ) {
        this.MZ = MZ;
    }

    public String getCSRQ() {
        return CSRQ;
    }

    public void setCSRQ(String CSRQ) {
        this.CSRQ = CSRQ;
    }

    public String getCSD_GJHDQ() {
        return CSD_GJHDQ;
    }

    public void setCSD_GJHDQ(String CSD_GJHDQ) {
        this.CSD_GJHDQ = CSD_GJHDQ;
    }

    public String getCSD_SSXQ() {
        return CSD_SSXQ;
    }

    public void setCSD_SSXQ(String CSD_SSXQ) {
        this.CSD_SSXQ = CSD_SSXQ;
    }

    public String getCSD_QHNXXDZ() {
        return CSD_QHNXXDZ;
    }

    public void setCSD_QHNXXDZ(String CSD_QHNXXDZ) {
        this.CSD_QHNXXDZ = CSD_QHNXXDZ;
    }

    public String getJG_GJHDQ() {
        return JG_GJHDQ;
    }

    public void setJG_GJHDQ(String JG_GJHDQ) {
        this.JG_GJHDQ = JG_GJHDQ;
    }

    public String getJG_SSXQ() {
        return JG_SSXQ;
    }

    public void setJG_SSXQ(String JG_SSXQ) {
        this.JG_SSXQ = JG_SSXQ;
    }

    public String getWHCD() {
        return WHCD;
    }

    public void setWHCD(String WHCD) {
        this.WHCD = WHCD;
    }

    public String getHYZK() {
        return HYZK;
    }

    public void setHYZK(String HYZK) {
        this.HYZK = HYZK;
    }

    public String getBYZK() {
        return BYZK;
    }

    public void setBYZK(String BYZK) {
        this.BYZK = BYZK;
    }

    public String getSG() {
        return SG;
    }

    public void setSG(String SG) {
        this.SG = SG;
    }

    public String getZY() {
        return ZY;
    }

    public void setZY(String ZY) {
        this.ZY = ZY;
    }

    public String getFWCS() {
        return FWCS;
    }

    public void setFWCS(String FWCS) {
        this.FWCS = FWCS;
    }

    public String getHJD_SSXQ() {
        return HJD_SSXQ;
    }

    public void setHJD_SSXQ(String HJD_SSXQ) {
        this.HJD_SSXQ = HJD_SSXQ;
    }

    public String getHJD_QHNXXDZ() {
        return HJD_QHNXXDZ;
    }

    public void setHJD_QHNXXDZ(String HJD_QHNXXDZ) {
        this.HJD_QHNXXDZ = HJD_QHNXXDZ;
    }

    public String getZXBZ() {
        return ZXBZ;
    }

    public void setZXBZ(String ZXBZ) {
        this.ZXBZ = ZXBZ;
    }

    public String getPCS() {
        return PCS;
    }

    public void setPCS(String PCS) {
        this.PCS = PCS;
    }

    public String getCrtUserId() {
        return crtUserId;
    }

    public void setCrtUserId(String crtUserId) {
        this.crtUserId = crtUserId;
    }

    public String getCrtUserName() {
        return crtUserName;
    }

    public void setCrtUserName(String crtUserName) {
        this.crtUserName = crtUserName;
    }

    public String getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(String crtTime) {
        this.crtTime = crtTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
