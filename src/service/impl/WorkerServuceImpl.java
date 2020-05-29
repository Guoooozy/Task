package service.impl;

import entity.Plan;
import repository.PlanRepository;
import repository.impl.PlanReposittoryImpl;
import service.WorkerService;

import javax.security.auth.kerberos.DelegationPermission;
import java.util.ArrayList;
import java.util.List;

public class WorkerServuceImpl implements WorkerService {
    private PlanRepository planRepository = new PlanReposittoryImpl();
    @Override
    public void makePlan(Plan plan) {
        planRepository.add(plan);
    }

    @Override
    public List<Plan> findAll() {
        List<Plan> list = new ArrayList<>();
        list = planRepository.findAll();
        return list;
    }

    @Override
    public void delPlan(String plan_name) {
        planRepository.delPlan(plan_name);
    }

    @Override
    public Plan findBypla_name(String plan_name) {
        Plan plan =null;
        return plan;
    }

}
