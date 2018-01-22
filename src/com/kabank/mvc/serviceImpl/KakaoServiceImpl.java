package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.impl.KakaoDAOImpl;
import com.kabank.mvc.service.KakaoService;

public class KakaoServiceImpl implements KakaoService{
	public static KakaoServiceImpl getInstance() {
		return new KakaoServiceImpl();
	}
	private KakaoServiceImpl(){}
	@Override
	public ResultMap createACNUM() {
		KakaoDAOImpl.getInstance().aNumcreate();
		return null;
	}
	
}
