package com.baeyeon.book.test;

import com.baeyeon.book.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilsTest {
    @Test
    public void testJdbcUtils(){
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
    }
}
