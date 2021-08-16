package com.superman.com.superman.service.impl;

import com.superman.com.superman.service.AccountService;
import com.superman.dao.AccountDao;
import com.superman.domain.Account;
import com.superman.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void save(Account account) {

        accountDao.save(account);

    }

    @Override
    public List<Account> findAll() {

        List<Account> accountList = accountDao.findAll();
        return accountList;
    }
}
