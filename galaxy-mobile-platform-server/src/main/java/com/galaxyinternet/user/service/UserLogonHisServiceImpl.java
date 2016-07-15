package com.galaxyinternet.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxyinternet.bo.UserLogonHisBO;
import com.galaxyinternet.dao.logonHis.UserLogonHisDAO;
import com.galaxyinternet.framework.core.dao.BaseDao;
import com.galaxyinternet.framework.core.service.impl.BaseServiceImpl;
import com.galaxyinternet.model.logonHis.UserLogonHis;
import com.galaxyinternet.service.UserLogonHisService;

@Service("com.galaxyinternet.user.service.UserLogonHisService")
public class UserLogonHisServiceImpl extends BaseServiceImpl<UserLogonHis> implements UserLogonHisService {
	
	@Autowired
	private UserLogonHisDAO  logonHisDao ;
	
	

	@Override
	protected BaseDao<UserLogonHis, Long> getBaseDao() {
		// TODO Auto-generated method stub
		return logonHisDao;
	}



	@Override
	public void saveLogonHis(UserLogonHis logonEntity) throws Exception {
		// TODO Auto-generated method stub
		logonHisDao.insertUserLogonHis(logonEntity);
	}
	
	public Integer queryCountUserLogon(UserLogonHisBO logonBo)throws Exception{
		return logonHisDao.queryCountUserLogonHis(logonBo);
	}
	
	public UserLogonHis queryUserLogon(UserLogonHisBO logonBo)throws Exception{
		return logonHisDao.getUserLogonHisByParam(logonBo);
	}



	@Override
	public Integer updateUserLogon(UserLogonHis logonEntity) throws Exception {
		// TODO Auto-generated method stub
		return logonHisDao.updateUserLogonHis(logonEntity);
	}
	
	public Integer queryCountTodayLogon(UserLogonHisBO  UserLogonHisbo)throws Exception{
		return  logonHisDao.queryCountTodayLogon(UserLogonHisbo);
	}
	
	

}
