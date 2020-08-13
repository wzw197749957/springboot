package com.wzw.springboot.controller;

import com.google.common.collect.Maps;
import com.wzw.springboot.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ArticleController {
    @Autowired
    private ArticleMapper articleMapper;

    @RequestMapping(value = "/getArticleList")
    public ModelAndView getArticleList() {
        Map<String, Object> model = Maps.newHashMap();
        model.put("list", articleMapper.findAll());
        return new ModelAndView("index", model);
    }
}
