package com.jf.Service;

import com.jf.pojo.Account;

import java.util.List;
import java.util.Map;

public interface IAccountService {
    String findNameById(int id);

    void executeTest();

    int updateInsert(Account account);

    void updateEdit(String id);

    void updateDelete();

    int totalCount();

    List<Map<String, Object>> findAll();

    Map<String, Object> findOne();
}
