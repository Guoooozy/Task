package service.impl;

import entity.Workers;
import repository.AdminRepository;
import repository.impl.AdminRepositoryImpl;
import service.AdminService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    AdminRepository adminRepository = new AdminRepositoryImpl();
    @Override
    public Object add(String username,String name, String password, String sex, String birthday, String hire_date, String position, String qualification, String experience, String flag, String super_id) throws SQLException {
        Object object =null;
        Workers workers = new Workers(username,name,password,sex,birthday,hire_date,position,qualification,experience,flag,super_id);
        object = adminRepository.add(workers);
        return object;
    }

    public Object Del(String name) {
        Object object = (Object) adminRepository.Del(name);
        return object;
    }

    @Override
    public List<Workers> FindAll(){
        List <Workers> list = new ArrayList<>();
        list = adminRepository.find();
        return list;
    }

}
