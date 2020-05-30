package repository;

import entity.Plan;
import javafx.scene.input.PickResult;

import java.util.List;

public interface PlanRepository {
    public void add(Plan plan);
    public List<Plan> findAll();
    public void delPlan(String plan_name);
    public Plan findByplan_name(String plan_name);
    public List<Plan> findByot(String plan_name,String plan_begin_date,String task_id,String feedback);
    public void update(String plan_feedback,String plan_name);
}
