package com.neusoft.domain;

public class TUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.userid
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.amount
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    private Double amount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.userid
     *
     * @return the value of t_user.userid
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.userid
     *
     * @param userid the value for t_user.userid
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.amount
     *
     * @return the value of t_user.amount
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.amount
     *
     * @param amount the value for t_user.amount
     *
     * @mbg.generated Sun Jul 29 09:53:21 CST 2018
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}