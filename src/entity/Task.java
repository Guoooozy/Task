package entity;

import java.util.Date;

public class Task {
    private String id;
    private String task_name;
    private String task_begin_time;
    private String task_end_time;
    private String task_description;
    private String task_state;
    private String staff_id;
    private String emp_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_begin_time() {
        return task_begin_time;
    }

    public void setTask_begin_time(String task_begin_time) {
        this.task_begin_time = task_begin_time;
    }

    public String getTask_end_time() {
        return task_end_time;
    }

    public void setTask_end_time(String task_end_time) {
        this.task_end_time = task_end_time;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public String getTask_state() {
        return task_state;
    }

    public void setTask_state(String task_state) {
        this.task_state = task_state;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public Task(String id, String task_name, String task_begin_time, String task_end_time, String task_description, String task_state, String staff_id, String emp_id) {
        this.id = id;
        this.task_name = task_name;
        this.task_begin_time = task_begin_time;
        this.task_end_time = task_end_time;
        this.task_description = task_description;
        this.task_state = task_state;
        this.staff_id = staff_id;
        this.emp_id = emp_id;
    }


}
