package com.github.yanglikun;


import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by yanglikun on 2017/3/27.
 */
public class Iteration extends BaseMain {

    static {
        BaseMain.template = "loop";
        List<String> lists = Lists.newArrayList();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        BaseMain.data.put("lists", lists);
    }


}
