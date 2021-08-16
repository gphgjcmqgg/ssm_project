package com.superman.com.superman.service;

import com.superman.domain.Account;

import java.util.List;

public interface AccountService {
    // 保存账户数据
    void save(Account account);

    // 查询账户数据
    List<Account> findAll();
}
