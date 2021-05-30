package com.bootdo.wuliao.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.wuliao.domain.WuliaoVO;
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

import com.bootdo.wuliao.domain.LiaocangyuliangbiaoDO;
import com.bootdo.wuliao.service.LiaocangyuliangbiaoService;
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
@RequestMapping("/wuliao/liaocangyuliangbiao")
public class LiaocangyuliangbiaoController {
	@Autowired
	private LiaocangyuliangbiaoService liaocangyuliangbiaoService;
	
	@GetMapping()
	@RequiresPermissions("wuliao:liaocangyuliangbiao:liaocangyuliangbiao")
	String Liaocangyuliangbiao(){
	    return "wuliao/liaocangyuliangbiao/liaocangyuliangbiao";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:liaocangyuliangbiao:liaocangyuliangbiao")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		//List<LiaocangyuliangbiaoDO> liaocangyuliangbiaoList = liaocangyuliangbiaoService.list(query);
		List<LiaocangyuliangbiaoDO> list = liaocangyuliangbiaoService.list(query);
		int total = liaocangyuliangbiaoService.count(query);
		PageUtils pageUtils = new PageUtils(list, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("wuliao:liaocangyuliangbiao:add")
	String add(){
	    return "wuliao/liaocangyuliangbiao/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:liaocangyuliangbiao:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		LiaocangyuliangbiaoDO liaocangyuliangbiao = liaocangyuliangbiaoService.get(id);
		model.addAttribute("liaocangyuliangbiao", liaocangyuliangbiao);
	    return "wuliao/liaocangyuliangbiao/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:liaocangyuliangbiao:add")
	public R save( LiaocangyuliangbiaoDO liaocangyuliangbiao){
		if(liaocangyuliangbiaoService.save(liaocangyuliangbiao)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:liaocangyuliangbiao:edit")
	public R update( LiaocangyuliangbiaoDO liaocangyuliangbiao){
		liaocangyuliangbiaoService.update(liaocangyuliangbiao);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:liaocangyuliangbiao:remove")
	public R remove( Integer id){
		if(liaocangyuliangbiaoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:liaocangyuliangbiao:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		liaocangyuliangbiaoService.batchRemove(ids);
		return R.ok();
	}
	
}
