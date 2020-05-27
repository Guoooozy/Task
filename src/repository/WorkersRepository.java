package repository;

import entity.Workers;

public interface WorkersRepository {
    public Workers login(String name, String password,String type);
}
