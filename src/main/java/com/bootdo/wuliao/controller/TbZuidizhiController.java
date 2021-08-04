package com.bootdo.wuliao.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.system.domain.*;
import com.bootdo.system.service.ChanpinxinxiService;
import com.bootdo.system.service.WuliaoxinxiService;
import com.bootdo.wuliao.domain.TbZuidizhiDo;
import com.bootdo.wuliao.service.TbZuidizhiService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.wuliao.domain.GongyidanDO;
import com.bootdo.wuliao.service.GongyidanService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
 
@Controller
@RequestMapping("/wuliao/tbZuidizhi")
public class TbZuidizhiController {
	@Autowired
	private TbZuidizhiService tbZuidizhiService;



	@GetMapping()
	@RequiresPermissions("wuliao:tbZuidizhi:tbZuidizhi")
	String TbZuidizhi(){
	    return "wuliao/tbZuidizhi/tbZuidizhi";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:tbZuidizhi:tbZuidizhi")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TbZuidizhiDo> tbZuidizhiList = tbZuidizhiService.list(query);
		int total = tbZuidizhiService.count(query);
		PageUtils pageUtils = new PageUtils(tbZuidizhiList, total);
		return pageUtils;
	}




	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:tbZuidizhi:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TbZuidizhiDo tbZuidizhi = tbZuidizhiService.get(id);
		model.addAttribute("tbZuidizhi", tbZuidizhi);
	    return "wuliao/tbZuidizhi/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:gongyidan:add")
	public R save( TbZuidizhiDo tbZuidizhi){
		if(tbZuidizhiService.save(tbZuidizhi)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:gongyidan:edit")
	public R update( TbZuidizhiDo tbZuidizhi){
		tbZuidizhiService.update(tbZuidizhi);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:tbZuidizhi:remove")
	public R remove( Integer id){
		if(tbZuidizhiService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:tbZuidizhi:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		tbZuidizhiService.batchRemove(ids);
		return R.ok();
	}
	
}
