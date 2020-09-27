package cn.com.jaav.pojo;

/*
 * 企业实体类
 */
public class Company
{
    private int cID;    //企业编号
    private String cName;   //企业名
    private String cType;   //企业类型
    private String leader;  //企业负责人
    private String tel;     //企业联系电话

    public Company(int cID, String cName, String cType, String leader, String tel)
    {
        this.cID = cID;
        this.cName = cName;
        this.cType = cType;
        this.leader = leader;
        this.tel = tel;
    }

    public int getcID()
    {
        return cID;
    }

    public void setcID(int cID)
    {
        this.cID = cID;
    }

    public String getcName()
    {
        return cName;
    }

    public void setcName(String cName)
    {
        this.cName = cName;
    }

    public String getcType()
    {
        return cType;
    }

    public void setcType(String cType)
    {
        this.cType = cType;
    }

    public String getLeader()
    {
        return leader;
    }

    public void setLeader(String leader)
    {
        this.leader = leader;
    }

    public String getTel()
    {
        return tel;
    }

    public void setTel(String tel)
    {
        this.tel = tel;
    }

    @Override
    public String toString()
    {
        return "Company{" +
                "cID=" + cID +
                ", cName='" + cName + '\'' +
                ", cType='" + cType + '\'' +
                ", leader='" + leader + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
