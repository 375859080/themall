package com.huang.mall.search;

import com.alibaba.fastjson.JSON;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallSearchApplicationTests {
    @Qualifier("esRestClient")
    @Autowired
    private RestHighLevelClient client;
    @Test
    public void contextLoads() {
        IndexRequest indexRequest = new IndexRequest("users");
        indexRequest.id("1");
    }

}
