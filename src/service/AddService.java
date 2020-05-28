package service;

import java.sql.SQLException;

public interface AddService {
    public Object add(String username,String name,String password,String sex,String birthday,String hire_date,String position,String qualification,String experience,String flag,String super_id) throws SQLException;
}
