package com.kabank.mvc.command;

import java.util.List;

import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.AttendBean;
import com.kabank.mvc.domain.FoodBean;
import com.kabank.mvc.domain.LottoBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.domain.TelecomBean;
import com.kabank.mvc.enums.Action;
import com.kabank.mvc.util.Enums.TABLE;

import lombok.Data;

@Data
public class Command{
	protected String cmd, dir, page, view, data, colum;//colum:DB의 metadata
	protected Action action;
	protected TABLE table;
	protected MemberBean member;
	protected AccountBean account;
	protected AttendBean attend;
	protected LottoBean lotto;
	protected FoodBean food;
	protected TelecomBean mobile;
}
