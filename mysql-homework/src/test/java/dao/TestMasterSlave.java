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
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RunBoot.class)
public class TestMasterSlave {

    @Resource
    private COrderRepository cOrderRepository;

    @Test
    public void testAdd() {
        COrder order = new COrder();
        order.setDel(false);
        order.setCompanyId(333);
        order.setPositionId(3242342);
        order.setUserId(222222222);
        order.setPublishUserId(1111);
        order.setResumeType(1);
        order.setStatus("AUTO");
        order.setCreateTime(new Date());
        order.setUpdateTime(new Date());
        cOrderRepository.save(order);
    }

    @Test
    public void testFind() {
        List<COrder> list = cOrderRepository.findAll();
        list.forEach(order -> System.out.println(order.getId()));
    }

}
