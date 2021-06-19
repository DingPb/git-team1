/**
 * Project Name:dt60_chapter20
 * File Name:Person.java
 * Package Name:cn.java.homework
 * Date:上午8:53:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.homework;

/**
 * Description: <br/>
 * Date: 上午8:53:23 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class Person {

    private String username;// 用户名

    private String idcard;// 身份证号

    private String gender;// 性别(男、女)

    private String address;// 地址

    public Person() {

        super();
        // Auto-generated constructor stub

    }

    public Person(String username, String idcard, String gender, String address) {
        super();
        this.username = username;
        this.idcard = idcard;
        this.gender = gender;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [username=" + username + ", idcard=" + idcard + ", gender=" + gender + ", address=" + address
                + "]";
    }

}
