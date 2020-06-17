package service.impl;

import entity.Task;
import entity.Workers;
import javafx.concurrent.Worker;
import repository.ManagerRepository;
import repository.impl.ManagerRepositoryImpl;
import service.ManagerService;

import java.util.ArrayList;
import java.util.List;

public class ManagerServiceImpl implements ManagerService {
    ManagerRepository managerRepository = new ManagerRepositoryImpl();
    @Override
    public void addManger(Task task) {
        managerRepository.add(task);
    }

    @Override
    public List<Task> showTask(String emp_id) {
        List<Task> taskList = new ArrayList<>();
        taskList = managerRepository.showTask(emp_id);
        return taskList;
    }

    @Override
    public void update(Task task) {
        managerRepository.update(task);
    }

    @Override
    public List<Workers> showPartWorkers(String super_id) {
        List<Workers> PartWorkers = new ArrayList<>();
        PartWorkers=managerRepository.showPartWorkers(super_id);
        return PartWorkers;
    }
}
