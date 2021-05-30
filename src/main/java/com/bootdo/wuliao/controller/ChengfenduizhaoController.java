package com.bootdo.wuliao.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.wuliao.domain.ChengfenduizhaoDO;
import com.bootdo.wuliao.service.ChengfenduizhaoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/wuliao/chengfenduizhao")
public class ChengfenduizhaoController {

    @Autowired
    private ChengfenduizhaoService chengfenduizhaoService;

    @GetMapping()
    @RequiresPermissions("wuliao:chengfenduizhao:chengfenduizhao")
    String Chengfenduizhao() {
        return "wuliao/chengfenduizhao/chengfenduizhao";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("wuliao:chengfenduizhao:chengfenduizhao")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<ChengfenduizhaoDO> chengfenduizhaoList = chengfenduizhaoService.list(query);
        int total = chengfenduizhaoService.count(query);
        PageUtils pageUtils = new PageUtils(chengfenduizhaoList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    @RequiresPermissions("wuliao:chengfenduizhao:add")
    String add() {
        return "wuliao/chengfenduizhao/add";
    }

    @GetMapping("/edit/{id}")
    @RequiresPermissions("wuliao:chengfenduizhao:edit")
    String edit(@PathVariable("id") Integer id, Model model) {
        ChengfenduizhaoDO chengfenduizhao = chengfenduizhaoService.get(id);
        model.addAttribute("chengfenduizhao", chengfenduizhao);
        return "wuliao/chengfenduizhao/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("wuliao:chengfenduizhao:add")
    public R save(ChengfenduizhaoDO chengfenduizhao) {
        if (chengfenduizhaoService.save(chengfenduizhao) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("wuliao:chengfenduizhao:edit")
    public R update(ChengfenduizhaoDO chengfenduizhao) {
        chengfenduizhaoService.update(chengfenduizhao);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    @RequiresPermissions("wuliao:chengfenduizhao:remove")
    public R remove(Integer id) {
        if (chengfenduizhaoService.remove(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    @RequiresPermissions("wuliao:chengfenduizhao:batchRemove")
    public R remove(@RequestParam("ids[]") Integer[] ids) {
        chengfenduizhaoService.batchRemove(ids);
        return R.ok();
    }


}
