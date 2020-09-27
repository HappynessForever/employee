package cn.com.jaav.pojo;

public class CompanyUser
{
    private String cUser;
    private String cPasswd;
    private int cID;

    public CompanyUser(String cUser, String cPasswd, int cID)
    {
        this.cUser = cUser;
        this.cPasswd = cPasswd;
        this.cID = cID;
    }

    public String getcUser()
    {
        return cUser;
    }

    public void setcUser(String cUser)
    {
        this.cUser = cUser;
    }

    public String getcPasswd()
    {
        return cPasswd;
    }

    public void setcPasswd(String cPasswd)
    {
        this.cPasswd = cPasswd;
    }

    public int getcID()
    {
        return cID;
    }

    public void setcID(int cID)
    {
        this.cID = cID;
    }

    @Override
    public String toString()
    {
        return "CompanyUser{" +
                "cUser='" + cUser + '\'' +
                ", cPasswd='" + cPasswd + '\'' +
                ", cID=" + cID +
                '}';
    }
}
