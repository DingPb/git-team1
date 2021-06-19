/**
 * Project Name:dt60_chapter20
 * File Name:FileTest.java
 * Package Name:cn.java.file
 * Date:上午9:50:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/**
 * Description: <br/>
 * Date: 上午9:50:51 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class FileTest {
    @Test
    public void createFile() throws IOException {
        for (int i = 0; i < 5; i++) {
            // java.txt就是一个具体的对象，这个对象使用File类型来表示
            File file = new File("C:\\java" + i + ".txt");
            // 创建普通文件
            boolean flag = file.createNewFile();
            System.out.println("file.createNewFile()=" + flag);
        }
    }

    /**
     * 
     * Description:创建文件夹 <br/>
     *
     * @author 丁鹏
     * @throws IOException
     */
    @Test
    public void createDirectory() throws IOException {
        // java.txt就是一个具体的对象，这个对象使用File类型来表示
        File file = new File("C:\\java.txt");
        file.mkdir();
    }

    /**
     * 
     * Description:创建文件夹 <br/>
     *
     * @author 丁鹏
     * @throws IOException
     */
    @Test
    public void test() throws IOException {
        File file = new File("c:\\java0.txt");
        // 判断一个文件中是否有数据
        long len = file.length();
        System.out.println("len=" + len);
        boolean flag = file.isFile();
        System.out.println("flag=" + flag);
    }

}
