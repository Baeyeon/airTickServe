package com.baeyeon.book.dao.impl;

import com.baeyeon.book.dao.BelongingDao;
import com.baeyeon.book.pojo.Belonging;

import java.util.List;

public class BelongingDaoImpl extends BaseDao implements BelongingDao {
    @Override
    public int addBelonging(Belonging belonging) {
        String sql = "insert into t_belong(`user_id`,`pass_id`) values(?,?)";
        return update(sql,belonging.getUser_id(),belonging.getPass_id());
    }

    @Override
    public List<Belonging> queryBelongingByInfo(Belonging belonging) {
        String sql = "select `pass_id` from t_belong where user_id = ?";
        return queryForList(Belonging.class,sql,belonging.getUser_id());
    }
}
