package cn.com.jaav.pojo;

import java.util.Date;

public class Need
{
    private int jID;
    private int cID;
    private Date putDate;
    private int people;
    private int payment;

    public Need(int jID, int cID, Date putDate, int people, int payment)
    {
        this.jID = jID;
        this.cID = cID;
        this.putDate = putDate;
        this.people = people;
        this.payment = payment;
    }

    public int getjID()
    {
        return jID;
    }

    public void setjID(int jID)
    {
        this.jID = jID;
    }

    public int getcID()
    {
        return cID;
    }

    public void setcID(int cID)
    {
        this.cID = cID;
    }

    public Date getPutDate()
    {
        return putDate;
    }

    public void setPutDate(Date putDate)
    {
        this.putDate = putDate;
    }

    public int getPeople()
    {
        return people;
    }

    public void setPeople(int people)
    {
        this.people = people;
    }

    public int getPayment()
    {
        return payment;
    }

    public void setPayment(int payment)
    {
        this.payment = payment;
    }

    @Override
    public String toString()
    {
        return "Need{" +
                "jID=" + jID +
                ", cID=" + cID +
                ", putDate=" + putDate +
                ", people=" + people +
                ", payment=" + payment +
                '}';
    }
}
