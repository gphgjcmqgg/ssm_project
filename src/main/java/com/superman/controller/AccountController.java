package com.superman.controller;

import com.superman.com.superman.service.AccountService;
import com.superman.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value="/save", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account) {

        accountService.save(account);
        return "保存成功";
    }

    @RequestMapping("/list")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView();

        List<Account> accountList = accountService.findAll();
        modelAndView.addObject("accountList", accountList);
        modelAndView.setViewName("accountList");
        return modelAndView;
    }
}
