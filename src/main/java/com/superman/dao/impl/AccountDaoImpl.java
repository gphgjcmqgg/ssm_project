package com.superman.dao.impl;

import com.superman.dao.AccountDao;
import com.superman.domain.Account;
import com.superman.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {
            accountMapper.save(account);

    }

    @Override
    public List<Account> findAll() {
            return accountMapper.findAll();
    }
}
