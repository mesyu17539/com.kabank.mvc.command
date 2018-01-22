package com.kabank.mvc.command;

import java.util.List;

import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.AttendBean;
import com.kabank.mvc.domain.FoodBean;
import com.kabank.mvc.domain.LottoBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.domain.TelecomBean;

import lombok.Data;

//결합도를 낮추기 위해 만듬.
@Data
public class ResultMap {
	protected MemberBean member;
	protected AccountBean account;
	protected AttendBean attend;
	protected LottoBean lotto;
	protected FoodBean food;
	protected TelecomBean mobile;
	protected String str;
	protected List<String> list;
	protected List<MemberBean> members;
	protected List<AccountBean> accounts;
	protected List<AttendBean> attends;
	protected List<LottoBean> lottos;
	protected List<FoodBean> foods;
	protected List<TelecomBean> mobiles;
}
