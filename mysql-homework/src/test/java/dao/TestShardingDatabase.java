package dao;

import com.lagou.RunBoot;
import com.lagou.entity.COrder;
import com.lagou.repository.COrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunBoot.class)
public class TestShardingDatabase {

    @Resource
    private COrderRepository cOrderRepository;

    @Test
    public void testShardingBOrder() {
        Random random = new Random();

        for (int i = 0; i <= 20; i++) {
            int companyId = random.nextInt(10);
            COrder order = new COrder();
            order.setDel(false);
            order.setCompanyId(companyId);
            order.setPositionId(3242342);
            order.setUserId(i);
            order.setPublishUserId(1111);
            order.setResumeType(1);
            order.setStatus("AUTO");
            order.setCreateTime(new Date());
            order.setUpdateTime(new Date());
            cOrderRepository.save(order);
        }
    }
}
