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

import com.bootdo.wuliao.domain.WuliaoDO;
import com.bootdo.wuliao.service.WuliaoService;
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
@RequestMapping("/wuliao/wuliao")
public class WuliaoController {
	@Autowired
	private WuliaoService wuliaoService;
	
	@GetMapping()
	@RequiresPermissions("wuliao:wuliao:wuliao")
	String Wuliao(){
	    return "wuliao/wuliao/wuliao";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:wuliao:wuliao")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WuliaoDO> wuliaoList = wuliaoService.list(query);
		int total = wuliaoService.count(query);
		PageUtils pageUtils = new PageUtils(wuliaoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("wuliao:wuliao:add")
	String add(){
	    return "wuliao/wuliao/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:wuliao:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		WuliaoDO wuliao = wuliaoService.get(id);
		model.addAttribute("wuliao", wuliao);
	    return "wuliao/wuliao/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:wuliao:add")
	public R save( WuliaoDO wuliao){
		if(wuliaoService.save(wuliao)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:wuliao:edit")
	public R update( WuliaoDO wuliao){
		wuliaoService.update(wuliao);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:wuliao:remove")
	public R remove( Integer id){
		if(wuliaoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:wuliao:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		wuliaoService.batchRemove(ids);
		return R.ok();
	}
	
}
