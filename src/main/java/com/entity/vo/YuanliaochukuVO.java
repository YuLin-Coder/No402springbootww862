package com.entity.vo;

import com.entity.YuanliaochukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 原料出库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-13 19:48:22
 */
public class YuanliaochukuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 原料名称
	 */
	
	private String yuanliaomingcheng;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 出库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukushijian;
				
	
	/**
	 * 设置：原料名称
	 */
	 
	public void setYuanliaomingcheng(String yuanliaomingcheng) {
		this.yuanliaomingcheng = yuanliaomingcheng;
	}
	
	/**
	 * 获取：原料名称
	 */
	public String getYuanliaomingcheng() {
		return yuanliaomingcheng;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：出库时间
	 */
	 
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
			
}