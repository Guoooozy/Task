package service;

import entity.Workers;

import java.sql.SQLException;
import java.util.List;

public interface AdminService {
    public Object add(String username,String name,String password,String sex,String birthday,String hire_date,String position,String qualification,String experience,String flag,String super_id) throws SQLException;
    public Object Del(String name);
    public List<Workers> FindAll();
}
