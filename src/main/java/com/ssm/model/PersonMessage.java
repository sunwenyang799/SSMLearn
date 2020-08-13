package com.ssm.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

/**
 *人员信息类
 * */
public class PersonMessage {

    //  主键
    private Integer id;

    //  人员编号
    private String no;

    //  姓名
    private String name;

    //  现处部门
    private Integer dept;

    //  创建时间
    private Date createTime;

    //  登录次数
    private Long loginTimes;

    //  当前薪资
    private Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Long loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * 通过传入的人员编号返回现处相同部门的人员列表
     * @param
     * @return
     * */
    public List<PersonMessage> getListByNo(String no){
        File file = new File("");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
