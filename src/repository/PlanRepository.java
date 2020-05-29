package repository;

import entity.Plan;

import java.util.List;

public interface PlanRepository {
    public void add(Plan plan);
    public List<Plan> findAll();
    public void delPlan(String plan_name);
    public Plan findByplan_name(String plan_name);
}
