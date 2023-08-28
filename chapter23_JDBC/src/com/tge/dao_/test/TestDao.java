package com.tge.dao_.test;

import com.tge.dao_.dao.ActorDao;
import com.tge.dao_.domain.Actor;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * ClassName: TestDao
 * Package: com.tge.dao_.test
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/28 - 17:29
 * Version:
 */
public class TestDao {

    @Test
    public void testActorDAO(){
        try {
            List<Actor> actors = new ActorDao().queryMulti("select * from actor where id >= ?", Actor.class, 1);
            System.out.println("=====查询结果======");
            for (Actor actor : actors) {
                System.out.println(actor);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
