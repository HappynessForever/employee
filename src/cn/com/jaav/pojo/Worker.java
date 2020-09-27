package cn.com.jaav.pojo;

import java.util.Date;

/*
 * 应聘人员实体类
 */
public class Worker
{
    private int wID;        //编号
    private String wName;   //姓名
    private String sex;     //性别
    private Date birth;     //出生日
    private String wType;   //工作类别
    private String title;   //职称
    private int years;      //工龄
    private String major;   //专业
    private String education;   //学历

    public Worker(int wID, String wName, String sex, Date birth, String wType, String title, int years, String major, String education)
    {
        this.wID = wID;
        this.wName = wName;
        this.sex = sex;
        this.birth = birth;
        this.wType = wType;
        this.title = title;
        this.years = years;
        this.major = major;
        this.education = education;
    }

    public int getwID()
    {
        return wID;
    }

    public void setwID(int wID)
    {
        this.wID = wID;
    }

    public String getwName()
    {
        return wName;
    }

    public void setwName(String wName)
    {
        this.wName = wName;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public Date getBirth()
    {
        return birth;
    }

    public void setBirth(Date birth)
    {
        this.birth = birth;
    }

    public String getwType()
    {
        return wType;
    }

    public void setwType(String wType)
    {
        this.wType = wType;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYears()
    {
        return years;
    }

    public void setYears(int years)
    {
        this.years = years;
    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public String getEducation()
    {
        return education;
    }

    public void setEducation(String education)
    {
        this.education = education;
    }

    @Override
    public String toString()
    {
        return "Worker{" +
                "wID=" + wID +
                ", wName='" + wName + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                ", wType='" + wType + '\'' +
                ", title='" + title + '\'' +
                ", years=" + years +
                ", major='" + major + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
