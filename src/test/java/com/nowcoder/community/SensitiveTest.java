package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    // 测试过滤敏感词
    @Test
    public void testSensitiveFilter(){
        String text = "这里可以@赌------博，可以!嫖@#!$娼，可以!开$%%#@票吗，哈哈哈！";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }

}
