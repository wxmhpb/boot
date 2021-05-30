package com.bootdo.wuliao.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.wuliao.domain.Liaocang1DO;
import com.bootdo.wuliao.domain.LiaocangDO;
import com.bootdo.wuliao.service.Liaocang1Service;
import com.bootdo.wuliao.service.LiaocangService;
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
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */

@Controller
@RequestMapping("/wuliao/liaocang1")
public class Liaocang1Controller {
	@Autowired
	private Liaocang1Service liaocang1Service;

	@GetMapping()
	@RequiresPermissions("wuliao:liaocang1:liaocang1")
	String Liaocang(){
	    return "wuliao/liaocang1/liaocang1";
	}


	@ResponseBody
	@GetMapping("/list1")
	@RequiresPermissions("wuliao:liaocang1:liaocang1")
	public PageUtils list1(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);
		List<Liaocang1DO> liaocangList = liaocang1Service.list1(query);
		int total = liaocang1Service.count(query);
		PageUtils pageUtils = new PageUtils(liaocangList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("wuliao:liaocang1:add")
	String add(){
	    return "wuliao/liaocang1/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("wuliao:liaocang1:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		Liaocang1DO liaocang = liaocang1Service.get(id);
		model.addAttribute("liaocang1", liaocang);
	    return "wuliao/liaocang1/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("wuliao:liaocang1:add")
	public R save( Liaocang1DO liaocang){
		if(liaocang1Service.save(liaocang)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("wuliao:liaocang1:edit")
	public R update( Liaocang1DO liaocang){
		liaocang1Service.update(liaocang);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("wuliao:liaocang1:remove")
	public R remove( Integer id){
		if(liaocang1Service.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("wuliao:liaocang1:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		liaocang1Service.batchRemove(ids);
		return R.ok();
	}

}
