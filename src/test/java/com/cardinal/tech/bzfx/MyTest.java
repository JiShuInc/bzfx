package com.cardinal.tech.bzfx;

import com.alibaba.druid.filter.config.ConfigTools;
<<<<<<< HEAD
import com.cardinal.tech.bzfx.etl.EtlUtil;
=======
import com.cardinal.tech.bzfx.enums.biz.RoleEnum;
>>>>>>> 2a61f3abe18cfca4c898493d3af44d286fbd56dd
import com.cardinal.tech.bzfx.util.UserPasswordEncoder;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

<<<<<<< HEAD
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BzfxApplication.class)
@Slf4j
=======
import java.util.List;

>>>>>>> 2a61f3abe18cfca4c898493d3af44d286fbd56dd
public class MyTest {

    @Autowired
    EtlUtil etlUtil;
    @Test
    public void testDruidPasswordEncrypt() throws Exception {
        ConfigTools.main(new String[]{"Bzfx@2021"});
//        ConfigTools.main(new String[]{"yy@2020AL"});
    }

    @Test
    public void testEncryptPassword() {
//        var encode = new UserPasswordEncoder().encode("Guest2020@bzms");
        var encode = new UserPasswordEncoder().encode("Admin2021@bzfx");
        System.out.println(encode);
    }

    @Test
<<<<<<< HEAD
    public void testEtlUtil() {
        try {
            etlUtil.syncData("457i338r70.qicp.vip:15918","BZKGL","BZKGL");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

=======
    public void testRoleEnum(){
        final var roles = RoleEnum.getRolesById(12345);
        roles.forEach(r-> System.out.println(r.code()));
    }
>>>>>>> 2a61f3abe18cfca4c898493d3af44d286fbd56dd
}