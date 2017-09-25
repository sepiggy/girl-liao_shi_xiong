package cn.sepiggy.imooc.dao;

import cn.sepiggy.imooc.pojo.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    // 通过年龄来查询 (指定字段)
    public List<Girl> findByAge(Integer age);
}
