package service;

import entity.Plan;
import entity.Task;
import entity.Workers;
import javafx.concurrent.Worker;

import java.util.List;

public interface ManagerService {
    public void addManger(Task task);
    public List<Task> showTask(String emp_id);
    public void update(Task task);
    public List<Workers> showPartWorkers(String super_id);
}
