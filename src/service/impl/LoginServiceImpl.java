package service.impl;

import repository.impl.WorkersRepositoryImpl;
import service.LoginService;

public class LoginServiceImpl implements LoginService {
    private WorkersRepositoryImpl workersRepository = new WorkersRepositoryImpl();
    @Override
    public Object login(String username, String password, String type) {
        Object object=null;
        object = workersRepository.login(username,password,type);
        return object;
    }
}
