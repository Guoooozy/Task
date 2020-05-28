package entity;


import java.util.Date;

public class Workers {
    private String name;
    private String password;
    private String sex;
    private String birthday;
    private String hire_date;
    private String position;
    private String qualification;
    private String experience;
    private String flag;
    private String super_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getSuper_id() {
        return super_id;
    }

    public void setSuper_id(String super_id) {
        this.super_id = super_id;
    }

    public Workers(String name, String password, String sex, String birthday, String hire_date, String position, String qualification, String experience, String flag, String super_id) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.hire_date = hire_date;
        this.position = position;
        this.qualification = qualification;
        this.experience = experience;
        this.flag = flag;
        this.super_id = super_id;
    }
}
