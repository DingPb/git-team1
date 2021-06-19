/**
 * Project Name:dt60_chapter20
 * File Name:HomeWork.java
 * Package Name:cn.java.demo
 * Date:上午8:36:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 上午8:36:04 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class HomeWork {

    public static void main(String[] args) {// 协同开发
        Map<String, Person> aMap = new HashMap<String, Person>();
        do {
            System.out.println("*********************请输入如下选项******************");
            System.out.println("\t\t\t1、信息录入");
            System.out.println("\t\t\t2、信息查询");
            System.out.println("\t\t\t3、信息修改");
            System.out.println("\t\t\t4、信息删除");
            System.out.println("\t\t\t5、退出");
            System.out.println("请输入您的选项：");
            Scanner input = new Scanner(System.in);
            // 接收用户的选项
            int flag = input.nextInt();
            // 判断用户的选项
            switch (flag) {
            case 1:// 添加
                Operation.addPerson(input, aMap);
                break;
            case 2:
                Operation.getAllPerson(aMap);
                break;
            case 3:
                System.out.println("信息修改成功");
                break;
            case 4:
                System.out.println("信息删除成功");
                break;
            case 5:
                System.out.println("退出成功");
                System.exit(0);
                break;
            }
        } while (true);
    }

}
