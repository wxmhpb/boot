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

import com.bootdo.wuliao.domain.CheliangxinxiDO;
import com.bootdo.wuliao.service.CheliangxinxiService;
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
@RequestMapping("/wuliao/cheliangxinxi")
public class CheliangxinxiController {
	@Autowired
	private CheliangxinxiService cheliangxinxiService;
	
	@GetMapping()
	@RequiresPermissions("wuliao:cheliangxinxi:cheliangxinxi")
	String Cheliangxinxi(){
	    return "wuliao/cheliangxinxi/cheliangxinxi";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:cheliangxinxi:cheliangxinxi")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CheliangxinxiDO> cheliangxinxiList = cheliangxinxiService.list(query);
		int total = cheliangxinxiService.count(query);
		PageUtils pageUtils = new PageUtils(cheliangxinxiList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("wuliao:cheliangxinxi:add")
	String add(){
	    return "wuliao/cheliangxinxi/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:cheliangxinxi:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		CheliangxinxiDO cheliangxinxi = cheliangxinxiService.get(id);
		model.addAttribute("cheliangxinxi", cheliangxinxi);
	    return "wuliao/cheliangxinxi/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:cheliangxinxi:add")
	public R save( CheliangxinxiDO cheliangxinxi){
		if(cheliangxinxiService.save(cheliangxinxi)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:cheliangxinxi:edit")
	public R update( CheliangxinxiDO cheliangxinxi){
		cheliangxinxiService.update(cheliangxinxi);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:cheliangxinxi:remove")
	public R remove( Integer id){
		if(cheliangxinxiService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:cheliangxinxi:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		cheliangxinxiService.batchRemove(ids);
		return R.ok();
	}
	
}
