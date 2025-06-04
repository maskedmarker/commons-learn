package org.example.learn.commons.io.file;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextLineTest {

    @Test
    public void test0() throws IOException {
        Path cwd = Paths.get(System.getProperty("user.dir")).toAbsolutePath();
        File data1 = new File(cwd.toFile(), "src/test/resources/data1.txt");
        File data2 = new File(cwd.toFile(), "src/test/resources/data2.txt");

        // 清空
        FileUtils.write(data2, "", StandardCharsets.UTF_8, false);

        // 流式处理
        try(LineIterator lineIterator = FileUtils.lineIterator(data1, StandardCharsets.UTF_8.name())) {
            while (lineIterator.hasNext()) {
                String line = lineIterator.next();
                // 添加处理逻辑
                line = line.toUpperCase();
                FileUtils.write(data2, line, StandardCharsets.UTF_8, true);
            }
        }
    }
}
