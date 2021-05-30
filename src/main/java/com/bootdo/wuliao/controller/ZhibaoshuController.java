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

import com.bootdo.wuliao.domain.ZhibaoshuDO;
import com.bootdo.wuliao.service.ZhibaoshuService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2021-01-12 13:08:58
 */
 
@Controller
@RequestMapping("/wuliao/zhibaoshu")
public class ZhibaoshuController {
	@Autowired
	private ZhibaoshuService zhibaoshuService;
	
	@GetMapping()
	@RequiresPermissions("wuliao:zhibaoshu:zhibaoshu")
	String Zhibaoshu(){
	    return "wuliao/zhibaoshu/zhibaoshu";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:zhibaoshu:zhibaoshu")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ZhibaoshuDO> zhibaoshuList = zhibaoshuService.list(query);
		int total = zhibaoshuService.count(query);
		PageUtils pageUtils = new PageUtils(zhibaoshuList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("wuliao:zhibaoshu:add")
	String add(){
	    return "wuliao/zhibaoshu/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:zhibaoshu:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ZhibaoshuDO zhibaoshu = zhibaoshuService.get(id);
		model.addAttribute("zhibaoshu", zhibaoshu);
	    return "wuliao/zhibaoshu/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:zhibaoshu:add")
	public R save( ZhibaoshuDO zhibaoshu){
		if(zhibaoshuService.save(zhibaoshu)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:zhibaoshu:edit")
	public R update( ZhibaoshuDO zhibaoshu){
		zhibaoshuService.update(zhibaoshu);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:zhibaoshu:remove")
	public R remove( Integer id){
		if(zhibaoshuService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:zhibaoshu:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		zhibaoshuService.batchRemove(ids);
		return R.ok();
	}
	
}
