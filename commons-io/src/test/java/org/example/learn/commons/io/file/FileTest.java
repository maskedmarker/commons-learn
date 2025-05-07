package org.example.learn.commons.io.file;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileTest {

    @Test
    public void test0() throws URISyntaxException {
        String filePathInClassPath = "demo.txt";
        URL url = this.getClass().getClassLoader().getResource(filePathInClassPath);
        System.out.println("url = " + url);
        System.out.println("url.getPath() = " + url.getPath());
        System.out.println("url.getProtocol() = " + url.getProtocol());
        System.out.println("url.getFile() = " + url.getFile());
        System.out.println("url.toURI() = " + url.toURI());

        File file = new File(url.toURI());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
    }

    @Test
    public void test1() throws Exception {
        // 文件路径
        String filePathInClassPath = "demo.txt";
        URL url = this.getClass().getClassLoader().getResource(filePathInClassPath);
        // 使用 FileUtils.readLines 按行读取文件内容
        List<String> lines = FileUtils.readLines(new File(url.toURI()), StandardCharsets.UTF_8);
        System.out.println("文件内容（按行读取）：");
        lines.forEach(System.out::println);
    }

}
