package com.bootdo.wuliao.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.wuliao.domain.HuayanshiDO;
import com.bootdo.wuliao.service.HuayanshiService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2021-01-12 13:10:03
 */
 
@Controller
@RequestMapping("/wuliao/huayanshi")
public class HuayanshiController {
	@Autowired
	private HuayanshiService huayanshiService;
	
	@GetMapping()
	@RequiresPermissions("wuliao:huayanshi:huayanshi")
	String Huayanshi(){
	    return "wuliao/huayanshi/huayanshi";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:huayanshi:huayanshi")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<HuayanshiDO> huayanshiList = huayanshiService.list(query);
		int total = huayanshiService.count(query);
		PageUtils pageUtils = new PageUtils(huayanshiList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("wuliao:huayanshi:add")
	String add(){
	    return "wuliao/huayanshi/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:huayanshi:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		HuayanshiDO huayanshi = huayanshiService.get(id);
		model.addAttribute("huayanshi", huayanshi);
	    return "wuliao/huayanshi/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:huayanshi:add")
	public R save( HuayanshiDO huayanshi){
		if(huayanshiService.save(huayanshi)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:huayanshi:edit")
	public R update( HuayanshiDO huayanshi){
		huayanshiService.update(huayanshi);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:huayanshi:remove")
	public R remove( Integer id){
		if(huayanshiService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:huayanshi:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		huayanshiService.batchRemove(ids);
		return R.ok();
	}
	
}
