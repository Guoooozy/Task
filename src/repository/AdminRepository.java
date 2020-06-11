package repository;

import entity.Workers;

import java.sql.SQLException;
import java.util.List;

public interface AdminRepository {
    public Workers add(Workers workers) throws SQLException;//添加
    public Boolean Del(String name);//删除
    public List<Workers> find();//全列表
    public Workers update(Workers workers);
}
