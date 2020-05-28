package service.impl.admin;

import entity.Workers;
import repository.impl.admin.AddWorkerImpl;
import service.AddService;

import java.sql.SQLException;

public class AddServiceImpl implements AddService {
    private AddWorkerImpl addWorker =new AddWorkerImpl();
    @Override
    public Object add(String username,String name, String password, String sex, String birthday, String hire_date, String position, String qualification, String experience, String flag, String super_id) throws SQLException {
        Object object =null;
        Workers workers = new Workers(username,name,password,sex,birthday,hire_date,position,qualification,experience,flag,super_id);
        object = addWorker.add(workers);
        return object;
    }
}
