package com.bootdo.wuliao.service;

import com.bootdo.wuliao.domain.LiaocangDO;
import com.bootdo.wuliao.domain.WuliaoVO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ktt
 * @email 1035964900@qq.com
 * @date 2020-12-21 17:09:17
 */
public interface LiaocangService {
	
	LiaocangDO get(Integer id);
	
	//List<WuliaoVO> list();
	
	int count(Map<String, Object> map);
	
	int save(LiaocangDO liaocang);
	
	int update(LiaocangDO liaocang);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

	List<LiaocangDO> list(Map<String,Object> map);

}
