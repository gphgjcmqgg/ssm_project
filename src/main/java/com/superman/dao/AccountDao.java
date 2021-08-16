package com.superman.dao;

import com.superman.domain.Account;

import java.util.List;

public interface AccountDao {

    // 保存账户数据
    void save(Account account);

    // 查询账户数据
    List<Account> findAll();
}
