package com.bootdo.wuliao.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.wuliao.domain.WuliaopaixuDO;
import com.bootdo.wuliao.domain.WuliaoshangliaoshunxubiaoDO;
import com.bootdo.wuliao.service.WuliaobaobiaoService;
import com.bootdo.wuliao.service.WuliaopaixuService;
import com.bootdo.wuliao.vo.ProductTotal;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/wuliao/wuliaopaixu")
public class WuliaopaixuController {
    @Autowired
    WuliaobaobiaoService wuliaobaobiaoService;;

    @GetMapping
    String preQuery(){

        return "wuliao/wuliaopaixu/wuliaopaixu.html";
    }

    @Autowired
    private WuliaopaixuService wuliaopaixuService;
    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("wuliao:wuliaopaixu:wuliaopaixu")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<ProductTotal> list = wuliaobaobiaoService.preQuery();
    //    List<WuliaopaixuDO> wuliaopaixuDOList = wuliaopaixuService.list(query);
        int total = wuliaopaixuService.count(query);
        PageUtils pageUtils = new PageUtils(list, total);
        return pageUtils;
    }
}
