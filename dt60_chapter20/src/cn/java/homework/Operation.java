/**
 * Project Name:dt60_chapter20
 * File Name:Operation.java
 * Package Name:cn.java.homework
 * Date:上午9:07:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.homework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 上午9:07:35 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class Operation {
    /**
     * 
     * Description: 添加用户数据<br/>
     *
     * @author 丁鹏
     */
    public static void addPerson(Scanner input, Map<String, Person> aMap) {
        System.out.println("开始录入公民信息");
        System.out.print("（1）请输入姓名：");
        String username = input.next();
        System.out.print("（2）请输入身份证号：");
        String idcard = input.next();
        System.out.print("（3）请输入性别：");
        String gender = input.next();
        System.out.print("（4）请输入地址：");
        String address = input.next();
        // 将记录封装到Person对象中
        Person person = new Person(username, idcard, gender, address);
        // 将Person对象添加到Map容器中，以idcard作为key，以person对象作为值value
        aMap.put(idcard, person);
        System.out.println("信息录入成功");
    }

    /**
     * 
     * Description: 查询所有<br/>
     *
     * @author 丁鹏
     */
    public static void getAllPerson(Map<String, Person> aMap) {
        // 开始遍历容器
        System.out.println("所有人信息列表如下：");
        for (Entry<String, Person> entry : aMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("信息查询成功");
    }
}
