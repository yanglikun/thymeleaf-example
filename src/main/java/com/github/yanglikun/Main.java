package com.github.yanglikun;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by yanglikun on 2017/3/27.
 */
public class Main {

    public static void main(String[] args) {
        //创建引擎
        TemplateEngine templateEngine = new TemplateEngine();
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateEngine.addTemplateResolver(templateResolver);

        //创建上下文
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("name", "yanglikun");
        IContext ctx = new Context(Locale.CHINESE, map);

        //模板+引擎=输出
        String result = templateEngine.process("main", ctx);
        System.out.println(result);
    }

}
