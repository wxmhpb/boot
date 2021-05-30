package com.bootdo.wuliao.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.wuliao.domain.LiaocangyuliangbiaoDO;
import com.bootdo.wuliao.domain.WuliaoVO;
import com.bootdo.wuliao.domain.WuliaobaobiaoDO;
import com.bootdo.wuliao.service.WuliaobaobiaoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/wuliao/wuliaobaobiao")
public class WuliaobaobiaoController {
    @Autowired
    private WuliaobaobiaoService wuliaobaobiaoService;

    @GetMapping()
    @RequiresPermissions("wuliao:wuliaobaobiao:wuliaobaobiao")
    String Liaocangyuliangbiao(){
        return "wuliao/wuliaobaobiao/wuliaobaobiao";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("wuliao:wuliaobaobiao:wuliaobaobiao")
    public PageUtils list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        List<WuliaoVO> wuliaobaobiaoList = wuliaobaobiaoService.list(query);
        int total = wuliaobaobiaoService.count(query);
        PageUtils pageUtils = new PageUtils(wuliaobaobiaoList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    @RequiresPermissions("wuliao:wuliaobaobiao:add")
    String add(){
        return "wuliao/wuliaobaobiao/add";
    }

    @GetMapping("/edit/{id}")
    @RequiresPermissions("wuliao:wuliaobaobiao:edit")
    String edit(@PathVariable("id") Integer id, Model model){
        WuliaobaobiaoDO wuliaobaobiao = wuliaobaobiaoService.get(id);
        model.addAttribute("wuliaobaobiao", wuliaobaobiao);
        return "wuliao/wuliaobaobiao/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("wuliao:wuliaobaobiao:add")
    public R save( WuliaobaobiaoDO wuliaobaobiao){
        if(wuliaobaobiaoService.save(wuliaobaobiao)>0){
            return R.ok();
        }
        return R.error();
    }
    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("wuliao:wuliaobaobiao:edit")
    public R update(WuliaobaobiaoDO wuliaobaobiao){
        wuliaobaobiaoService.update(wuliaobaobiao);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping( "/remove")
    @ResponseBody
    @RequiresPermissions("wuliao:wuliaobaobiao:remove")
    public R remove( Integer id){
        if(wuliaobaobiaoService.remove(id)>0){
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping( "/batchRemove")
    @ResponseBody
    @RequiresPermissions("wuliao:wuliaobaobiao:batchRemove")
    public R remove(@RequestParam("ids[]") Integer[] ids){
        wuliaobaobiaoService.batchRemove(ids);
        return R.ok();
    }

}
