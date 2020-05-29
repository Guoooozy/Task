package repository.impl.admin;

import entity.Workers;
import repository.DelWorkerRepository;
import utils.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DelWorkerImpl implements DelWorkerRepository {
    @Override
    public Boolean Del(String name) {
        Boolean boolea = null;
        String sql = "delete * from worker where name = ?";
        try {
            Connection connection = new JDBC().getConn();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            int i= preparedStatement.executeUpdate();
            if(i<=0){
                boolea = null;
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
}
