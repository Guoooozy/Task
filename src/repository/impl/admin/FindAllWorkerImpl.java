package repository.impl.admin;

import entity.Workers;
import repository.FindAllWorkerRepository;
import utils.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FindAllWorkerImpl implements FindAllWorkerRepository {
    @Override
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
