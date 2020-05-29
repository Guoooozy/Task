package repository;

import entity.Plan;
import entity.Workers;

import java.util.List;

public interface WorkersRepository {
    public Workers login(String name, String password,String type);
}
