package repository.impl;

import entity.Plan;
import repository.PlanRepository;
import utils.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlanReposittoryImpl implements PlanRepository {
    @Override
    public void add(Plan plan) {
        String sql = "insert into Plan (id,plan_name,plan_state,feedback,plan_begin_date,plan_end_date,plan_discription,plan_feedback,task_id) values (?,?,?,?,?,?,?,?,?)";
        Connection connection = new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,plan.getId());
            preparedStatement.setString(2,plan.getPlan_name());
            preparedStatement.setString(3,plan.getPlan_state());
            preparedStatement.setString(4,plan.getFeedback());
            preparedStatement.setString(5,plan.getPlan_begin_date());
            preparedStatement.setString(6,plan.getPlan_end_date());
            preparedStatement.setString(7,plan.getPlan_discription());
            preparedStatement.setString(8,plan.getPlan_feedback());
            preparedStatement.setString(9,plan.getTask_id());
            Integer res = null;
            res = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Plan> findAll() {
        List<Plan> list = new ArrayList<>();
        String sql = "select * from Plan";
        Connection connection = new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(new Plan(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void delPlan(String plan_name) {
        String sql = "delete from Plan where plan_name = ?";
        Connection connection = new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Plan findByplan_name(String plan_name) {
        Plan plan = null;
        String sql = "select * from Plan where plan_name = ?";
        Connection connection = new JDBC().getConn();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                plan = new Plan(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return plan;
    }
}
