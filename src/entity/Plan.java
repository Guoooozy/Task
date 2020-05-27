package entity;

import java.util.Date;

public class Plan {
    private Integer id;
    private String paln_name;
    private String plan_state;
    private String feedback;
    private Date plan_begin_date;
    private Date plan_end_date;
    private String plan_discription;
    private String plan_feedback;
    private Integer task_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaln_name() {
        return paln_name;
    }

    public void setPaln_name(String paln_name) {
        this.paln_name = paln_name;
    }

    public String getPlan_state() {
        return plan_state;
    }

    public void setPlan_state(String plan_state) {
        this.plan_state = plan_state;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getPlan_begin_date() {
        return plan_begin_date;
    }

    public void setPlan_begin_date(Date plan_begin_date) {
        this.plan_begin_date = plan_begin_date;
    }

    public Date getPlan_end_date() {
        return plan_end_date;
    }

    public void setPlan_end_date(Date plan_end_date) {
        this.plan_end_date = plan_end_date;
    }

    public String getPlan_discription() {
        return plan_discription;
    }

    public void setPlan_discription(String plan_discription) {
        this.plan_discription = plan_discription;
    }

    public String getPlan_feedback() {
        return plan_feedback;
    }

    public void setPlan_feedback(String plan_feedback) {
        this.plan_feedback = plan_feedback;
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public Plan(Integer id, String paln_name, String plan_state, String feedback, Date plan_begin_date, Date plan_end_date, String plan_discription, String plan_feedback, Integer task_id) {
        this.id = id;
        this.paln_name = paln_name;
        this.plan_state = plan_state;
        this.feedback = feedback;
        this.plan_begin_date = plan_begin_date;
        this.plan_end_date = plan_end_date;
        this.plan_discription = plan_discription;
        this.plan_feedback = plan_feedback;
        this.task_id = task_id;
    }
}
