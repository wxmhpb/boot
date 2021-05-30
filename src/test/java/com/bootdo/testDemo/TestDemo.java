package com.bootdo.testDemo;

import com.bootdo.wuliao.domain.WuliaoshangliaoshunxubiaoDO;
import com.bootdo.wuliao.service.WuliaoshangliaoshunxubiaoService;
import com.bootdo.wuliao.service.impl.WuliaoshangliaoshunxubiaoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController()
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    WuliaoshangliaoshunxubiaoServiceImpl service;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("a", "b");
        System.out.println(redisTemplate.opsForValue().get("a"));
    }

    @Test
    public void test2() {
        List<WuliaoshangliaoshunxubiaoDO> list = service.list2();
        for (WuliaoshangliaoshunxubiaoDO aDo : list) {
            System.err.println(aDo);
        }
    }
}
