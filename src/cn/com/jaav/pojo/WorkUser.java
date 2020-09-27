package cn.com.jaav.pojo;

/*
 * 应聘人员账户表
 */
public class WorkUser
{
    private String wUser;
    private String wPasswd;
    private String wID;

    public WorkUser(String wUser, String wPasswd, String wID)
    {
        this.wUser = wUser;
        this.wPasswd = wPasswd;
        this.wID = wID;
    }

    public String getwUser()
    {
        return wUser;
    }

    public void setwUser(String wUser)
    {
        this.wUser = wUser;
    }

    public String getwPasswd()
    {
        return wPasswd;
    }

    public void setwPasswd(String wPasswd)
    {
        this.wPasswd = wPasswd;
    }

    public String getwID()
    {
        return wID;
    }

    public void setwID(String wID)
    {
        this.wID = wID;
    }

    @Override
    public String toString()
    {
        return "WorkUser{" +
                "wUser='" + wUser + '\'' +
                ", wPasswd='" + wPasswd + '\'' +
                ", wID='" + wID + '\'' +
                '}';
    }
}
