package com.bootdo.wuliao.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.wuliao.domain.Liaocang2DO;
import com.bootdo.wuliao.service.Liaocang2Service;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author ktt
 * @email 2035964900@qq.com
 * @date 2020-22-22 27:09:27
 */

@Controller
@RequestMapping("/wuliao/liaocang2")
public class Liaocang2Controller {
	@Autowired
	private Liaocang2Service liaocang2Service;

	@GetMapping()
	@RequiresPermissions("wuliao:liaocang2:liaocang2")
	String Liaocang(){
	    return "wuliao/liaocang2/liaocang2";
	}


	@ResponseBody
	@GetMapping("/list2")
	@RequiresPermissions("wuliao:liaocang2:liaocang2")
	public PageUtils list2(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);
		List<Liaocang2DO> liaocangList = liaocang2Service.list2(query);
		int total = liaocang2Service.count(query);
		PageUtils pageUtils = new PageUtils(liaocangList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("wuliao:liaocang2:add")
	String add(){
	    return "wuliao/liaocang2/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:liaocang2:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		Liaocang2DO liaocang = liaocang2Service.get(id);
		model.addAttribute("liaocang2", liaocang);
	    return "wuliao/liaocang2/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:liaocang2:add")
	public R save( Liaocang2DO liaocang){
		if(liaocang2Service.save(liaocang)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:liaocang2:edit")
	public R update( Liaocang2DO liaocang){
		liaocang2Service.update(liaocang);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:liaocang2:remove")
	public R remove( Integer id){
		if(liaocang2Service.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:liaocang2:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		liaocang2Service.batchRemove(ids);
		return R.ok();
	}

}
