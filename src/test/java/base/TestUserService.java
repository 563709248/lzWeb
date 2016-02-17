package base;

import com.lz.entity.User;
import com.lz.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maven on 2016/2/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-hibernate.xml"})
public class TestUserService {
    private static final Logger logger = LoggerFactory.getLogger(TestUserService.class);

    @Autowired
    private UserService userService;

    @Test
    public void save() {
        User user = new User();
        String oldId = UUID.randomUUID().toString();
        user.setId(oldId);
        user.setUserName("lailingzhi");
        user.setPassWord("lailingzhi");
        String id = userService.save(user);
        logger.info(">>>>>>>>>>>>>>>" + id);
        assertEquals(id, id);
        userService.delete(id);
    }
}
