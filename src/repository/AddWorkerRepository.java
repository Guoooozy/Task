package repository;

import entity.Workers;

import java.sql.SQLException;

public interface AddWorkerRepository {
    public Workers add(Workers workers) throws SQLException;
}
