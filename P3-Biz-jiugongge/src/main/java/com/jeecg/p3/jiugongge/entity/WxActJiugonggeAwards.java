package com.jeecg.p3.jiugongge.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActJiugonggeAwards:配置<br>
 * @author junfeng.zhou
 * @since：2015年11月16日 11时07分12秒 星期一 
 * @version:1.0
 */
public class WxActJiugonggeAwards implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	private String jwidName;
	public String getJwidName() {
		return jwidName;
	}
	public void setJwidName(String jwidName) {
		this.jwidName = jwidName;
	}
	
	
}
