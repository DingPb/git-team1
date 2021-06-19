/**
 * Project Name:dt60_chapter20
 * File Name:IoTest.java
 * Package Name:cn.java.file
 * Date:上午10:35:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

/**
 * Description: <br/>
 * Date: 上午10:35:42 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class IoTest {
    /**
     * 
     * Description: 将程序代码中的数据保存到文件中去<br/>
     *
     * @author 丁鹏
     * @throws IOException
     */
    @Test
    public void write2File() throws Exception {
        Scanner input = new Scanner(System.in);
        // 将文件封装成File对象
        File file = new File("c:\\dt60.txt");
        // 1、铺管道
        System.out.print("请录入数据：");
        String str = input.next();// 字节输出流
        FileOutputStream fos = new FileOutputStream(file, true);
        // 2、打开水龙头，将java中的数据保存到磁盘中
        fos.write(str.getBytes());
        // 3、关闭水龙头
        fos.close();
    }

    /**
     * 
     * Description: 将磁盘上保存的数据读取到java代码中<br/>
     *
     * @author 丁鹏
     * @throws Exception
     */
    @Test
    public void read2Java() throws Exception {// 中文乱码
        // 将文件封装成File对象
        File file = new File("d:\\dt60.txt");
        // 1、建立磁盘通完程序代码的管道（字节输入流）
        FileInputStream fis = new FileInputStream(file);
        // 2、打开水龙头，读取数据
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.print((char) len);
        }
        // 3、关闭水龙头
        fis.close();
    }

    @Test
    public void name() {
        int a, x;

        for (a = 0, x = 0; a <= 1 || !(x++ >= 1); a++)

        {

            a++;

            if (x == 2)
                continue;

            if (x++ > a++)
                x++;

        }

    }

    // ------------------------------------综合练习(拷贝视频)------------------------------------------
    @Test
    public void copyVideo() throws Exception {// 免费
        // 1、键c盘通往java代码的管道
        FileInputStream fis = new FileInputStream("c:\\java.avi");
        FileOutputStream fos = new FileOutputStream("d:\\java.avi");
        int len = 0;
        while ((len = fis.read()) != -1) {
            // System.out.print((char) len);
            // 2、将数据保存到D盘
            fos.write(len);

        }
        fis.close();
        fos.close();
    }

    @Test
    public void copyVideoVip() throws Exception {// 收费版本
        // 1、键c盘通往java代码的管道
        FileInputStream fis = new FileInputStream("c:\\java.avi");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("d:\\java.avi");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] car = new byte[1024];// 1025个字符
        int len = 0;// len=-1代表已经办完
        while ((len = bis.read(car)) != -1) {
            // 2.将读取的数据保存到D盘
            // bos.write(car, 0, len);
            System.out.println(new String(car, 0, len));
        }

        // 3、关闭输入流
        bis.close();
        fis.close();

        // 关闭输出流
        bos.close();
        fos.close();
    }
}
