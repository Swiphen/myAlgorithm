package com.feng;

import java.io.*;
import java.net.URL;

public class main {
    public static void main(String[] args) throws Exception {
//        System.out.println(new Dynamic().fib(4));
//        System.out.println(new Dynamic().tribonacci2(25));
//        System.out.println((100+400+50+300)/6);
        way_2();
    }


    public static void way_2() throws Exception{
        File dest = new File("d:/test.html");
        InputStream is;//接收字节输入流
        FileOutputStream fos = new FileOutputStream(dest);//字节输出流

        URL wangyi = new URL("http://192.168.1.164:9527/apigw/clgl/webForm/print?inline=true&module=fawen&busiDataId=10a4ea3d08af4274ad311a6eca6e550e&httpPort=9527");
        is = wangyi.openStream();

        BufferedInputStream bis = new BufferedInputStream(is);//为字节输入流加缓冲
        BufferedOutputStream bos = new BufferedOutputStream(fos);//为字节输出流加缓冲

        int length;

        byte[] bytes = new byte[1024*20];
        while((length = bis.read(bytes, 0, bytes.length)) != -1){
            fos.write(bytes, 0, length);
        }

        bos.close();
        fos.close();
        bis.close();
        is.close();
    }
}
