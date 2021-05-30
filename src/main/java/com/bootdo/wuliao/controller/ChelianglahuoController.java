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

import com.bootdo.wuliao.domain.ChelianglahuoDO;
import com.bootdo.wuliao.service.ChelianglahuoService;
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
@RequestMapping("/wuliao/chelianglahuo")
public class ChelianglahuoController {
	@Autowired
	private ChelianglahuoService chelianglahuoService;
	
	@GetMapping()
	@RequiresPermissions("wuliao:chelianglahuo:chelianglahuo")
	String Chelianglahuo(){
	    return "wuliao/chelianglahuo/chelianglahuo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:chelianglahuo:chelianglahuo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ChelianglahuoDO> chelianglahuoList = chelianglahuoService.list(query);
		int total = chelianglahuoService.count(query);
		PageUtils pageUtils = new PageUtils(chelianglahuoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("wuliao:chelianglahuo:add")
	String add(){
	    return "wuliao/chelianglahuo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:chelianglahuo:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ChelianglahuoDO chelianglahuo = chelianglahuoService.get(id);
		model.addAttribute("chelianglahuo", chelianglahuo);
	    return "wuliao/chelianglahuo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:chelianglahuo:add")
	public R save( ChelianglahuoDO chelianglahuo){
		if(chelianglahuoService.save(chelianglahuo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:chelianglahuo:edit")
	public R update( ChelianglahuoDO chelianglahuo){
		chelianglahuoService.update(chelianglahuo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:chelianglahuo:remove")
	public R remove( Integer id){
		if(chelianglahuoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:chelianglahuo:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		chelianglahuoService.batchRemove(ids);
		return R.ok();
	}
	
}
