package com.lq.model;

import com.lq.mapping.annotation.MapClass;
import java.util.Date;
@MapClass("com.lq.entity.SysUser")
public class SysUserModel{
	
	private Integer id;
	private String username;
	private String password;
	private String telephone;
	private String mail;
	private Integer deptId;
	private Integer status;
	private String remark;
	private String operater;
	private Date operateTime;
	private String operateIp;
		
	public void setId(Integer id){
		this.id = id;
	}
	
	public Integer getId(){
		return this.id;
	}
		
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return this.username;
	}
		
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return this.password;
	}
		
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	
	public String getTelephone(){
		return this.telephone;
	}
		
	public void setMail(String mail){
		this.mail = mail;
	}
	
	public String getMail(){
		return this.mail;
	}
		
	public void setDeptId(Integer deptId){
		this.deptId = deptId;
	}
	
	public Integer getDeptId(){
		return this.deptId;
	}
		
	public void setStatus(Integer status){
		this.status = status;
	}
	
	public Integer getStatus(){
		return this.status;
	}
		
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	public String getRemark(){
		return this.remark;
	}
		
	public void setOperater(String operater){
		this.operater = operater;
	}
	
	public String getOperater(){
		return this.operater;
	}
		
	public void setOperateTime(Date operateTime){
		this.operateTime = operateTime;
	}
	
	public Date getOperateTime(){
		return this.operateTime;
	}
		
	public void setOperateIp(String operateIp){
		this.operateIp = operateIp;
	}
	
	public String getOperateIp(){
		return this.operateIp;
	}
		
		
}