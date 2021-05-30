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

import com.bootdo.wuliao.domain.IpduiyingbiaoDO;
import com.bootdo.wuliao.service.IpduiyingbiaoService;
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
@RequestMapping("/wuliao/ipduiyingbiao")
public class IpduiyingbiaoController {
	@Autowired
	private IpduiyingbiaoService ipduiyingbiaoService;
	
	@GetMapping()
	@RequiresPermissions("wuliao:ipduiyingbiao:ipduiyingbiao")
	String Ipduiyingbiao(){
	    return "wuliao/ipduiyingbiao/ipduiyingbiao";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:ipduiyingbiao:ipduiyingbiao")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<IpduiyingbiaoDO> ipduiyingbiaoList = ipduiyingbiaoService.list(query);
		int total = ipduiyingbiaoService.count(query);
		PageUtils pageUtils = new PageUtils(ipduiyingbiaoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("wuliao:ipduiyingbiao:add")
	String add(){
	    return "wuliao/ipduiyingbiao/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:ipduiyingbiao:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		IpduiyingbiaoDO ipduiyingbiao = ipduiyingbiaoService.get(id);
		model.addAttribute("ipduiyingbiao", ipduiyingbiao);
	    return "wuliao/ipduiyingbiao/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:ipduiyingbiao:add")
	public R save( IpduiyingbiaoDO ipduiyingbiao){
		if(ipduiyingbiaoService.save(ipduiyingbiao)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:ipduiyingbiao:edit")
	public R update( IpduiyingbiaoDO ipduiyingbiao){
		ipduiyingbiaoService.update(ipduiyingbiao);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:ipduiyingbiao:remove")
	public R remove( Integer id){
		if(ipduiyingbiaoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:ipduiyingbiao:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		ipduiyingbiaoService.batchRemove(ids);
		return R.ok();
	}
	
}
