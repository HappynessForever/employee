package cn.com.jaav.pojo;

import java.util.Date;

public class Pair
{
    private int jID;
    private int wID;
    private int cID;
    private Date pairDate;

    public Pair(int jID, int wID, int cID, Date pairDate)
    {
        this.jID = jID;
        this.wID = wID;
        this.cID = cID;
        this.pairDate = pairDate;
    }

    public int getjID()
    {
        return jID;
    }

    public void setjID(int jID)
    {
        this.jID = jID;
    }

    public int getwID()
    {
        return wID;
    }

    public void setwID(int wID)
    {
        this.wID = wID;
    }

    public int getcID()
    {
        return cID;
    }

    public void setcID(int cID)
    {
        this.cID = cID;
    }

    public Date getPairDate()
    {
        return pairDate;
    }

    public void setPairDate(Date pairDate)
    {
        this.pairDate = pairDate;
    }

    @Override
    public String toString()
    {
        return "Pair{" +
                "jID=" + jID +
                ", wID=" + wID +
                ", cID=" + cID +
                ", pairDate=" + pairDate +
                '}';
    }
}
