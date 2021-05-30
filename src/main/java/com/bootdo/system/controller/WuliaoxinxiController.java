package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.system.domain.JihaoDO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.WuliaoxinxiDO;
import com.bootdo.system.service.WuliaoxinxiService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-29 17:50:50
 */
 
@Controller
@RequestMapping("/system/wuliaoxinxi")
public class WuliaoxinxiController {
	@Autowired
	private WuliaoxinxiService wuliaoxinxiService;

	
	@GetMapping()
	@RequiresPermissions("system:wuliaoxinxi:wuliaoxinxi")
	String Wuliaoxinxi(){
	    return "system/wuliaoxinxi/wuliaoxinxi";
	}


	@GetMapping("/add")
	@RequiresPermissions("system:wuliaoxinxi:add")
	public String add(){
      return "system/wuliaoxinxi/add";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:wuliaoxinxi:wuliaoxinxi")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WuliaoxinxiDO> wuliaoxinxiList = wuliaoxinxiService.list(query);
		int total = wuliaoxinxiService.count(query);
		PageUtils pageUtils = new PageUtils(wuliaoxinxiList, total);
		return pageUtils;
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:wuliaoxinxi:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		WuliaoxinxiDO wuliaoxinxi = wuliaoxinxiService.get(id);
		model.addAttribute("wuliaoxinxi", wuliaoxinxi);
	    return "system/wuliaoxinxi/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:wuliaoxinxi:add")
	public R save( WuliaoxinxiDO wuliaoxinxi){
		if(wuliaoxinxiService.save(wuliaoxinxi)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:wuliaoxinxi:edit")
	public R update( WuliaoxinxiDO wuliaoxinxi){
		wuliaoxinxiService.update(wuliaoxinxi);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:wuliaoxinxi:remove")
	public R remove( Integer id){
		if(wuliaoxinxiService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:wuliaoxinxi:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		wuliaoxinxiService.batchRemove(ids);
		return R.ok();
	}

//	@GetMapping("/queryList")
//	@ResponseBody
//	public List queryList (@RequestParam(value = "id") Integer id) {
//		//根据数据库Id查询对应的数据类型
//		List<WuliaoxinxiDO> wuliaoxinxiDOS = wuliaoxinxiService.queryList(id);
//		if (wuliaoxinxiDOS == null) {
//			throw new RuntimeException("数据为空！");
//		}
//		return wuliaoxinxiDOS;
//	}



}
