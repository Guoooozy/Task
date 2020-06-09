package repository.impl;

import com.mysql.cj.jdbc.exceptions.ConnectionFeatureNotAvailableException;
import controller.Admin.add;
import entity.Task;
import entity.Workers;
import repository.ManagerRepository;
import service.ManagerService;
import utils.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.PropertyPermission;

public class ManagerRepositoryImpl implements ManagerRepository {
    @Override
    public void add(Task task) {
        String sql = "insert into Task (id,task_name,task_begin_time,task_end_time,task_description,task_state,staff_id,emp_id) values (?,?,?,?,?,?,?,?)";
        Connection connection = new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,task.getId());
            preparedStatement.setString(2,task.getTask_name());
            preparedStatement.setString(3,task.getTask_begin_time());
            preparedStatement.setString(4,task.getTask_end_time());
            preparedStatement.setString(5,task.getTask_description());
            preparedStatement.setString(6,task.getTask_state());
            preparedStatement.setString(7,task.getStaff_id());
            preparedStatement.setString(8,task.getEmp_id());
            int res = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Task> showTask(String emp_id) {
        List<Task> taskList = new ArrayList<>();
        String sql = "select * from Task where emp_id = ?";
        Connection connection =new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,emp_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                taskList.add(new Task(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8)));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return taskList;
    }

    @Override
    public void delTask(String task_name) {
        String sql = "delete * from Task where task_name = ?";
        Connection connection =new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,task_name);
            int i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Workers> showPartWorkers(String super_id) {
        String sql = "select * from workers where super_id = ?";
        Connection connection = new JDBC().getConn();
        List<Workers> PartWorkers = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,super_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                PartWorkers.add(new Workers(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11)));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  PartWorkers;
    }
}
