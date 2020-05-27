package repository.impl;

import entity.Workers;
import repository.WorkersRepository;
import utils.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WorkersRepositoryImpl implements WorkersRepository {
    @Override
    public Workers login(String name, String password,String type) {
        Connection connection = JDBCTools.getConnection();
        String sql = "select * from workers where flag = ? and password = ? and name = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Workers workers = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1,type);
            statement.setString(2,password);
            statement.setString(3,name);
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                workers = new Workers(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getDate(4),resultSet.getDate(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(connection,statement,resultSet);
        }
        return workers;
    }
}
