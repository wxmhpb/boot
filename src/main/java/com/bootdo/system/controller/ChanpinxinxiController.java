package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;


import com.bootdo.system.domain.JihaoDO;
import com.bootdo.system.domain.LuciDO;
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

import com.bootdo.system.domain.ChanpinxinxiDO;
import com.bootdo.system.service.ChanpinxinxiService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2021-01-04 16:43:23
 */
 
@Controller
@RequestMapping("/system/chanpinxinxi")
public class ChanpinxinxiController {
	@Autowired
	private ChanpinxinxiService chanpinxinxiService;

	@GetMapping()
	@RequiresPermissions("system:chanpinxinxi:chanpinxinxi")
	String Chanpinxinxi() {
		return "system/chanpinxinxi/chanpinxinxi";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:chanpinxinxi:chanpinxinxi")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		//查询列表数据
		Query query = new Query(params);
		List<ChanpinxinxiDO> chanpinxinxiList = chanpinxinxiService.list(query);
		int total = chanpinxinxiService.count(query);
		PageUtils pageUtils = new PageUtils(chanpinxinxiList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("system:chanpinxinxi:add")
	String add() {
		return "system/chanpinxinxi/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:chanpinxinxi:edit")
	String edit(@PathVariable("id") Integer id, Model model) {
		ChanpinxinxiDO chanpinxinxi = chanpinxinxiService.get(id);
		model.addAttribute("chanpinxinxi", chanpinxinxi);
		return "system/chanpinxinxi/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:chanpinxinxi:add")
	public R save(ChanpinxinxiDO chanpinxinxi) {
		if (chanpinxinxiService.save(chanpinxinxi) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:chanpinxinxi:edit")
	public R update(ChanpinxinxiDO chanpinxinxi) {
		chanpinxinxiService.update(chanpinxinxi);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("system:chanpinxinxi:remove")
	public R remove(Integer id) {
		if (chanpinxinxiService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:chanpinxinxi:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids) {
		chanpinxinxiService.batchRemove(ids);
		return R.ok();
	}

//	@GetMapping("/find")
//	public List<Map<String,Object>> find(){
//		return chanpinxinxiService.queryList();
//	}

	@GetMapping("/queryList1")
	@ResponseBody
	public List queryList (@RequestParam(value = "id") Integer id) {
		//根据数据库Id查询对应的数据类型
		List<JihaoDO> jihaoDO = chanpinxinxiService.queryList1(id);
		if (jihaoDO == null) {
			throw new RuntimeException("数据为空！");
		}
		return jihaoDO;
	}

	@GetMapping("/queryList2")
	@ResponseBody
	public List queryList1 (@RequestParam(value = "id") Integer id) {
		//根据数据库Id查询对应的数据类型
		List<LuciDO> luciDO = chanpinxinxiService.queryList2(id);
		if (luciDO == null) {
			throw new RuntimeException("数据为空！");
		}
		return luciDO;
	}

}

