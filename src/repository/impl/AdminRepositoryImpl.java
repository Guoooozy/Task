package repository.impl;

import entity.Workers;
import repository.AdminRepository;
import utils.JDBC;

import javax.swing.text.ChangedCharSetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminRepositoryImpl implements AdminRepository {
    public Workers add(Workers workers) throws SQLException {
        int ret = 10;
        String s = new String();
        try {
            String sql = "insert into workers (username,name,password,sex,birthday,hire_date,position,qualification,experience,flag,super_id) values (?,?,?,?,?,?,?,?,?,?,?)";
            Connection connection = new JDBC().getConn();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);/*
            preparedStatement.setString(1,workers.getName());
            preparedStatement.setString(2,workers.getPassword());
            preparedStatement.setString(3,workers.getSex());
            preparedStatement.setString(4,workers.getBirthday());
            preparedStatement.setString(5,workers.getHire_date());
            preparedStatement.setString(6,workers.getPosition());
            preparedStatement.setString(7,workers.getQualification());
            preparedStatement.setString(8,workers.getExperience());
            preparedStatement.setString(9,workers.getExperience());
            preparedStatement.setString(10,workers.getFlag());
            preparedStatement.setString(11,workers.getSuper_id());*/

            String username = workers.getUsername();
            String name = workers.getName();
            String password = workers.getPassword();
            String sex = workers.getSex();
            String birthday = workers.getBirthday();
            String hire_date = workers.getHire_date();
            String position = workers.getPosition();
            String qualification = workers.getQualification();
            String experience = workers.getExperience();
            String flag = workers.getFlag();
            String super_id = workers.getSuper_id();

            preparedStatement.setString(1,username);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,password);
            preparedStatement.setString(4,sex);
            preparedStatement.setString(5,birthday);
            preparedStatement.setString(6,hire_date);
            preparedStatement.setString(7,position);
            preparedStatement.setString(8,qualification);
            preparedStatement.setString(9,experience);
            preparedStatement.setString(10,flag);
            preparedStatement.setString(11,super_id);
            ret = preparedStatement.executeUpdate();
            System.out.println(ret);
            if(ret<=0){
                workers = null;
            }
            preparedStatement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return workers;
    }

    public Boolean Del(String name) {
        Boolean boolea = null;
        String sql = "delete from workers where name = ?";
        try {
            Connection connection = new JDBC().getConn();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            int i= preparedStatement.executeUpdate();
            if(i<=0){
                boolea = false;
            }else{
                boolea = true;
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return boolea;
    }

    public List<Workers> find() {
        String sql = "select * from workers";
        List<Workers> list= new ArrayList<>();
        Workers workers = null;
        try {
            Connection connection = new JDBC().getConn();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                workers = new Workers(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11));
                list.add(workers);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
