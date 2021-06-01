package com.heyx.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.gaotu.uid.UidGenerator;
import com.heyx.demo.entity.StudentPointRecord;
import com.heyx.demo.service.IStudentPointRecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    IStudentPointRecordService service;

    @Resource
    private UidGenerator uidGenerator;

    @Test
    void contextLoads() {
        List<StudentPointRecord> list = service.list(
            new LambdaQueryWrapper<StudentPointRecord>()
            .eq(StudentPointRecord::getStudentId, 43)
        );
        System.out.println(list);
    }

    @Test
    public void testUid(){
        long uid = uidGenerator.getUID();
        System.out.println(uid);
    }

}
