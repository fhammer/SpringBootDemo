package com.play.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.play.boot.dao.AccountDao;
import com.play.boot.entity.Account;


@Service
public class AccountService {

	@Autowired
	AccountDao accountDAO;

	public int add(Account account) {
		return accountDAO.add(account);
	}

	public int update(Account account) {
		return accountDAO.update(account);
	}

	public int delete(int id) {
		return accountDAO.delete(id);
	}

	public Account findAccountById(int id) {
		return accountDAO.findAccountById(id);
	}

	public List<Account> findAccountList() {
		return accountDAO.findAccountList();
	}
}
