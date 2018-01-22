package com.kabank.mvc.dao;

import java.util.List;

import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;

public interface MemberDAO {
	public ResultMap selectMembers(String id,String pass);
	public ResultMap memberJoin(MemberBean bean);
	public ResultMap selectMemberById();
	public ResultMap chagePass();
	public ResultMap deleteMember();
	public ResultMap memJoin();
}
