package repository;

import entity.Task;
import entity.Workers;

import java.util.List;

public interface ManagerRepository {
    public void add(Task task);
    public List<Task> showTask(String emp_id);
    public void delTask(String task_name);
    public List<Workers> showPartWorkers(String super_id);
}
