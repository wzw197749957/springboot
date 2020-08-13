package com.wzw.springboot;

import com.wzw.springboot.domain.Article;
import com.wzw.springboot.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void contextLoads() {
        List<Article> articles = articleMapper.findAll();
        System.out.println(articles);
    }

}
