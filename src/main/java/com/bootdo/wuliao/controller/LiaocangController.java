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

import com.bootdo.wuliao.domain.LiaocangDO;
import com.bootdo.wuliao.service.LiaocangService;
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
@RequestMapping("/wuliao/liaocang")
public class LiaocangController {
	@Autowired
	private LiaocangService liaocangService;
	
	@GetMapping()

	@RequiresPermissions("wuliao:liaocang:liaocang")
	String Liaocang(){
	    return "wuliao/liaocang/liaocang";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("wuliao:liaocang:liaocang")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<LiaocangDO> liaocangList = liaocangService.list(query);
		int total = liaocangService.count(query);
		PageUtils pageUtils = new PageUtils(liaocangList, total);
		return pageUtils;
	}

	
	@GetMapping("/add")
	@RequiresPermissions("wuliao:liaocang:add")
	String add(){
	    return "wuliao/liaocang/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:liaocang:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		LiaocangDO liaocang = liaocangService.get(id);
		model.addAttribute("liaocang", liaocang);
	    return "wuliao/liaocang/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:liaocang:add")
	public R save( LiaocangDO liaocang){
		if(liaocangService.save(liaocang)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:liaocang:edit")
	public R update( LiaocangDO liaocang){
		liaocangService.update(liaocang);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:liaocang:remove")
	public R remove( Integer id){
		if(liaocangService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:liaocang:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		liaocangService.batchRemove(ids);
		return R.ok();
	}
	
}
