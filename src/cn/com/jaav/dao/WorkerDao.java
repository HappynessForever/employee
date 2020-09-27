package cn.com.jaav.dao;

import cn.com.jaav.pojo.Worker;
import cn.com.jaav.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/*
 * workerDao实现
 */
public class WorkerDao
{
    /*
     * 插入worker
     */
    public boolean insert(Worker worker)
    {
        Connection connection = JDBCUtil.getConnection();
        String sql = "insert into worker(wName, sex, birth, wType, title, years, major, education) values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement psm = connection.prepareStatement(sql);
            psm.setString(1,worker.getwName());
            psm.setString(2,worker.getSex());
            Date date = worker.getBirth();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            psm.setDate(3,sqlDate);
            psm.setString(4,worker.getwName());
            psm.setString(5,worker.getTitle());
            psm.setInt(6,worker.getYears());
            psm.setString(7,worker.getMajor());
            psm.setString(8,worker.getEducation());
            int row = psm.executeUpdate();
            psm.close();
            connection.close();
            /*
             * 如果插入成功即注册成功,返回true
             */
            if (row > 0) {
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    /*
     * 删除worker
     */
    public boolean delete(Worker worker)
    {
        /*
         * 待实现
         */
        return false;
    }

    /*
     * 根据ID查找worker
     */
    public  Worker queryByID(Worker worker)
    {
        Connection connection = JDBCUtil.getConnection();
        String sql = "select * from worker where wID = (?)";
        Worker rworker = null;
        ResultSet resultSet;
        try {
            PreparedStatement psm = connection.prepareStatement(sql);
            psm.setInt(1,worker.getwID());
            resultSet = psm.executeQuery();
            /*
             * 将结果集封装成一个worker
             */
            if (resultSet != null)
            {
                while (resultSet.next())
                {
                    int wID = resultSet.getInt(1);
                    String wName = resultSet.getString(2);
                    String sex = resultSet.getString(3);
                    Date birth = resultSet.getDate(4);
                    String wType = resultSet.getString(5);
                    String title = resultSet.getString(6);
                    int years = resultSet.getInt(7);
                    String major = resultSet.getString(8);
                    String education = resultSet.getString(9);
                    rworker = new Worker(wID,wName,sex,birth,wType,title,years,major,education);
                }
            }
            assert resultSet != null;
            resultSet.close();
            psm.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rworker;
    }

    /*
     * 根据名字查找worker
     */
    public Worker queryByName(Worker worker)
    {
        Connection connection = JDBCUtil.getConnection();
        String sql = "select * from worker where wName = (?)";
        Worker rworker = null;
        ResultSet resultSet;
        try {
            PreparedStatement psm = connection.prepareStatement(sql);
            psm.setString(1,worker.getwName());
            resultSet = psm.executeQuery();
            /*
             * 将结果集封装成一个worker
             */
            if (resultSet != null)
            {
                while (resultSet.next())
                {
                    int wID = resultSet.getInt(1);
                    String wName = resultSet.getString(2);
                    String sex = resultSet.getString(3);
                    Date birth = resultSet.getDate(4);
                    String wType = resultSet.getString(5);
                    String title = resultSet.getString(6);
                    int years = resultSet.getInt(7);
                    String major = resultSet.getString(8);
                    String education = resultSet.getString(9);
                    rworker = new Worker(wID,wName,sex,birth,wType,title,years,major,education);
                }
            }
            assert resultSet != null;
            resultSet.close();
            psm.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rworker;
    }
}
