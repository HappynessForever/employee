package cn.com.jaav.pojo;

public class Job
{
    private int jID;
    private String jName;
    private String educationReq;
    private String titleReq;
    private String jType;
    private String yearsReq;

    public Job(int jID, String jName, String educationReq, String titleReq, String jType, String yearsReq)
    {
        this.jID = jID;
        this.jName = jName;
        this.educationReq = educationReq;
        this.titleReq = titleReq;
        this.jType = jType;
        this.yearsReq = yearsReq;
    }

    public int getjID()
    {
        return jID;
    }

    public void setjID(int jID)
    {
        this.jID = jID;
    }

    public String getjName()
    {
        return jName;
    }

    public void setjName(String jName)
    {
        this.jName = jName;
    }

    public String getEducationReq()
    {
        return educationReq;
    }

    public void setEducationReq(String educationReq)
    {
        this.educationReq = educationReq;
    }

    public String getTitleReq()
    {
        return titleReq;
    }

    public void setTitleReq(String titleReq)
    {
        this.titleReq = titleReq;
    }

    public String getjType()
    {
        return jType;
    }

    public void setjType(String jType)
    {
        this.jType = jType;
    }

    public String getYearsReq()
    {
        return yearsReq;
    }

    public void setYearsReq(String yearsReq)
    {
        this.yearsReq = yearsReq;
    }

    @Override
    public String toString()
    {
        return "Job{" +
                "jID=" + jID +
                ", jName='" + jName + '\'' +
                ", educationReq='" + educationReq + '\'' +
                ", titleReq='" + titleReq + '\'' +
                ", jType='" + jType + '\'' +
                ", yearsReq='" + yearsReq + '\'' +
                '}';
    }
}
