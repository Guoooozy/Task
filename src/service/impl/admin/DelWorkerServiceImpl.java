package service.impl.admin;


import repository.DelWorkerRepository;
import repository.impl.admin.DelWorkerImpl;
import service.DelWorkerService;

public class DelWorkerServiceImpl implements DelWorkerService {
    DelWorkerRepository delWorkerRepository = new DelWorkerImpl();
    @Override
    public Object Del(String name) {
        Object object = (Object) delWorkerRepository.Del(name);
        return object;
    }
}
