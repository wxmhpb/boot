package com.bootdo.wuliao.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.common.utils.DateUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.wuliao.domain.ShengchanjihuaDO;
import com.bootdo.wuliao.service.ShengchanjihuaService;
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
@RequestMapping("/wuliao/shengchanjihua")
public class ShengchanjihuaController {
	@Autowired
	private ShengchanjihuaService shengchanjihuaService;
	
	@GetMapping()
	@RequiresPermissions("wuliao:shengchanjihua:shengchanjihua")
	String Shengchanjihua(){
	    return "wuliao/shengchanjihua/shengchanjihua";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:shengchanjihua:shengchanjihua")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ShengchanjihuaDO> shengchanjihuaList = shengchanjihuaService.list(query);
		int total = shengchanjihuaService.count(query);
		PageUtils pageUtils = new PageUtils(shengchanjihuaList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("wuliao:shengchanjihua:add")
	String add(ModelMap map){
	    List<ShengchanjihuaDO> list=shengchanjihuaService.queryList();
		List<ShengchanjihuaDO> list1=shengchanjihuaService.queryList1();
	    map.addAttribute("shengchanjihuaDO",list);
		map.addAttribute("shengchanjihuaDO1",list1);
		return "wuliao/shengchanjihua/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:shengchanjihua:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ShengchanjihuaDO shengchanjihua = shengchanjihuaService.get(id);
		model.addAttribute("shengchanjihua", shengchanjihua);
	    return "wuliao/shengchanjihua/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:shengchanjihua:add")
	public R save( ShengchanjihuaDO shengchanjihua){
		if(shengchanjihuaService.save(shengchanjihua)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:shengchanjihua:edit")
	public R update( ShengchanjihuaDO shengchanjihua){
		shengchanjihuaService.update(shengchanjihua);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:shengchanjihua:remove")
	public R remove( Integer id){
		if(shengchanjihuaService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:shengchanjihua:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		shengchanjihuaService.batchRemove(ids);
		return R.ok();
	}
	
}
