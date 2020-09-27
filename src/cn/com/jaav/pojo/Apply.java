package cn.com.jaav.pojo;

import java.util.Date;

public class Apply
{
    private int applyNum;
    private int wID;
    private int jID;
    private Date applyDate;
    private String other;

    public Apply(int applyNum, int wID, int jID, Date applyDate, String other)
    {
        this.applyNum = applyNum;
        this.wID = wID;
        this.jID = jID;
        this.applyDate = applyDate;
        this.other = other;
    }

    public int getApplyNum()
    {
        return applyNum;
    }

    public void setApplyNum(int applyNum)
    {
        this.applyNum = applyNum;
    }

    public int getwID()
    {
        return wID;
    }

    public void setwID(int wID)
    {
        this.wID = wID;
    }

    public int getjID()
    {
        return jID;
    }

    public void setjID(int jID)
    {
        this.jID = jID;
    }

    public Date getApplyDate()
    {
        return applyDate;
    }

    public void setApplyDate(Date applyDate)
    {
        this.applyDate = applyDate;
    }

    public String getOther()
    {
        return other;
    }

    public void setOther(String other)
    {
        this.other = other;
    }

    @Override
    public String toString()
    {
        return "Apply{" +
                "applyNum=" + applyNum +
                ", wID=" + wID +
                ", jID=" + jID +
                ", applyDate=" + applyDate +
                ", other='" + other + '\'' +
                '}';
    }
}
