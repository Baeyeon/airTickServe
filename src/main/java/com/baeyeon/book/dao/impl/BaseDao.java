package com.baeyeon.book.dao.impl;

import com.baeyeon.book.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDao {
    //使用Dbutils操作数据库
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * update()方法用来执行：insert/update/delete语句
     * return如果返回-1，执行失败；返回其他表示影响的行数
     */
    public int update(String sql,Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return -1;
    }

    /**
     * 查询返回一个javaBean的sql语句
     *
     * @oaram type 返回的对象类型
     * @param sql 执行的sql语句
     * @param args sql对应的参数值
     * @param <T> 返回的类型的泛型
     */
    public <T> T queryForOne(Class<T> type, String sql, Object... args){
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con,sql,new BeanHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return null;
    }

    /**
     * 查询返回多个javaBean的sql语句
     *
     * @oaram type 返回的对象类型
     * @param sql 执行的sql语句
     * @param args sql对应的参数值
     * @param <T> 返回的类型的泛型
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args){
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return null;
    }

    /**
     * 执行返回某一行的一列（即一个value值）的sql语句
     * @param sql 执行的sql语句
     * @param args sql对应的参数值
     */
    public Object queryForSingleValue(String sql, Object... args){
        Connection conn = JdbcUtils.getConnection();
        try {
            return queryRunner.query(conn,sql,new ScalarHandler(),args);    //newScalarHandler为返回的结果集
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(conn);
        }
        return null;
    }

    public List<Object[]> queryforObjectList(String sql,Object... args){
        Connection conn = JdbcUtils.getConnection();
        try {
            return queryRunner.query(conn,sql,new ArrayListHandler(),args);    //newScalarHandler为返回的结果集
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(conn);
        }
        return null;
    }
}
