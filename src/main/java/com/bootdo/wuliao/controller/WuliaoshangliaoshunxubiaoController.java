package com.bootdo.wuliao.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.wuliao.domain.WuliaoshangliaoshunxubiaoDO;
import com.bootdo.wuliao.domain.WuliaoshangliaoshunxubiaoDO;
import com.bootdo.wuliao.service.WuliaoshangliaoshunxubiaoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/wuliao/wuliaoshangliaoshunxubiao")
public class WuliaoshangliaoshunxubiaoController {

    @Autowired
    private WuliaoshangliaoshunxubiaoService wuliaoshangliaoshunxubiaoService;

    @GetMapping()
    @RequiresPermissions("wuliao:wuliaoshangliaoshunxubiao:wuliaoshangliaoshunxubiao")
    String Wuliaoshangliaoshunxubiao() {
        return "wuliao/wuliaoshangliaoshunxubiao/wuliaoshangliaoshunxubiao";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("wuliao:wuliaoshangliaoshunxubiao:wuliaoshangliaoshunxubiao")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<WuliaoshangliaoshunxubiaoDO> wuliaoshangliaoshunxubiaoList = wuliaoshangliaoshunxubiaoService.list(query);
        int total = wuliaoshangliaoshunxubiaoService.count(query);
        PageUtils pageUtils = new PageUtils(wuliaoshangliaoshunxubiaoList, total);
        return pageUtils;
    }

    @ResponseBody
    @GetMapping("/query")
    @RequiresPermissions("wuliao:wuliaoshangliaoshunxubiao:wuliaoshangliaoshunxubiao")
    public String query(@RequestParam("name")String name){
        return wuliaoshangliaoshunxubiaoService.query(name);
    }

    /**
     * 关联查询
     *
     * @param params
     * @return
     * @author
     */
    @ResponseBody
    @GetMapping("/list2")
    @RequiresPermissions("wuliao:wuliaoshangliaoshunxubiao:wuliaoshangliaoshunxubiao")
    public PageUtils list2(@RequestParam Map<String, Object> params) {
        //封装查询条件
        Query query = new Query(params);
        //查询列表数据
        List<WuliaoshangliaoshunxubiaoDO> result = wuliaoshangliaoshunxubiaoService.list2();
        //总记录数
        int total = wuliaoshangliaoshunxubiaoService.count2();
        //封装分页结果
        PageUtils pageUtils = new PageUtils(result, total);
        return pageUtils;
    }
}
