package cn.sepiggy.imooc.service;

import cn.sepiggy.imooc.dao.GirlRepository;
import cn.sepiggy.imooc.pojo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    // 只有查询的时候不需要加事务; 增, 删, 改的情况即使是操作单条数据也需要加事务
    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBBBBB");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

}
