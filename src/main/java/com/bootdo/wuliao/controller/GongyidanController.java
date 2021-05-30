package com.bootdo.wuliao.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.system.domain.*;
import com.bootdo.system.service.ChanpinxinxiService;
import com.bootdo.system.service.WuliaoxinxiService;
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
@RequestMapping("/wuliao/gongyidan")
public class GongyidanController {
	@Autowired
	private GongyidanService gongyidanService;

	@Autowired
	private WuliaoxinxiService wuliaoxinxiService;

	@Autowired
	private ChanpinxinxiService chanpinxinxiService;

	@GetMapping()
	@RequiresPermissions("wuliao:gongyidan:gongyidan")
	String Gongyidan(){
	    return "wuliao/gongyidan/gongyidan";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:gongyidan:gongyidan")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GongyidanDO> gongyidanList = gongyidanService.list(query);
		int total = gongyidanService.count(query);
		PageUtils pageUtils = new PageUtils(gongyidanList, total);
		return pageUtils;
	}


	@GetMapping("/add")
	@RequiresPermissions("wuliao:gongyidan:add")
	public String add(ModelMap map){
		//查询列表数据
		List<WuliaoxinxiDO> list=wuliaoxinxiService.queryList();
		List<GangzhongzuDO> list1=chanpinxinxiService.queryList();
		map.addAttribute("chanpinxinxiDO",list1);
		map.addAttribute("wuliaoxinxiDO",list);
		return "wuliao/gongyidan/add";
	}
	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:gongyidan:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		GongyidanDO gongyidan = gongyidanService.get(id);
		model.addAttribute("gongyidan", gongyidan);
	    return "wuliao/gongyidan/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:gongyidan:add")
	public R save( GongyidanDO gongyidan){
		if(gongyidanService.save(gongyidan)>0){
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
	public R update( GongyidanDO gongyidan){
		gongyidanService.update(gongyidan);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:gongyidan:remove")
	public R remove( Integer id){
		if(gongyidanService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:gongyidan:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		gongyidanService.batchRemove(ids);
		return R.ok();
	}
	
}
