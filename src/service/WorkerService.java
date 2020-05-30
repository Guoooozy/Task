package service;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import entity.Plan;

import java.util.List;

public interface WorkerService {
    public void makePlan(Plan plan);
    public List<Plan> findAll();
    public void delPlan(String plan_name);
    public Plan findBypla_name(String plan_name);
    public List<Plan> findByot(String plan_name,String plan_begin_date,String task_id,String feedback);
    public void update(String plan_feedback,String plan_name);
}
