package com.galaxyinternet.model.logonHis;

import java.sql.Timestamp;
import java.util.Date;

import com.galaxyinternet.framework.core.model.BaseEntity;
import com.galaxyinternet.framework.core.model.Pagable;
/**
 * APP端用户登录历史记录
 * @author LZJ
 * @ClassName  : UserLogonHis  
 * @Version  版本   
 * @ModifiedByLZJ  
 * @Copyright  Galaxyinternet  
 * @date  2016年7月11日 下午5:38:56
 */
public class UserLogonHis extends BaseEntity implements Pagable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5719879013966408286L;
	private String accessClient ; // '访问客户端名称',
	private long userId  ; // '用户ID',
	private String  nickName; //'登录名称',
	private Date loginDate ; //'登录日期'
	private Timestamp  initLogonTime ; // '首次登录时间',
	private Timestamp  lastLogonTime ;  // '最后登录时间',
	private Integer  logonTimes;  //'当天登录累计次数',
	//定义的返回时间
	private String inTime;
	//获取用户的登录总数
	private Long strCount;
	
	protected Integer pageSize;
	protected Integer pageNum;


	
	public Timestamp getLastLogonTime() {
		return lastLogonTime;
	}
	public void setLastLogonTime(Timestamp lastLogonTime) {
		this.lastLogonTime = lastLogonTime;
	}
	public String getAccessClient() {
		return accessClient;
	}
	public void setAccessClient(String accessClient) {
		this.accessClient = accessClient;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public Timestamp getInitLogonTime() {
		return initLogonTime;
	}
	public void setInitLogonTime(Timestamp initLogonTime) {
		this.initLogonTime = initLogonTime;
	}
	public Integer getLogonTimes() {
		return logonTimes;
	}
	public void setLogonTimes(Integer logonTimes) {
		this.logonTimes = logonTimes;
	}
	public Long getStrCount() {
		return strCount;
	}
	public void setStrCount(Long strCount) {
		this.strCount = strCount;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	@Override
	public void setDirection(String direction) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getDirection() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setProperty(String property) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getProperty() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
