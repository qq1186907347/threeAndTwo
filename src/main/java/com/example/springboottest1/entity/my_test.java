package com.example.springboottest1.entity;

public class my_test {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_test.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_test.test
     *
     * @mbggenerated
     */
    private String test;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_test.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_test.id
     *
     * @return the value of my_test.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_test.id
     *
     * @param id the value for my_test.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_test.test
     *
     * @return the value of my_test.test
     *
     * @mbggenerated
     */
    public String getTest() {
        return test;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_test.test
     *
     * @param test the value for my_test.test
     *
     * @mbggenerated
     */
    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_test.content
     *
     * @return the value of my_test.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_test.content
     *
     * @param content the value for my_test.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}