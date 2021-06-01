package com.heyx.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heyx.demo.mapper.StudentPointRecordMapper;
import com.heyx.demo.entity.StudentPointRecord;
import org.springframework.stereotype.Service;

/**
 * @author heyongxian
 * @date 2021/6/1 7:38 下午
 */
@Service
public class StudentPointRecordServiceImpl extends ServiceImpl<StudentPointRecordMapper, StudentPointRecord> implements IStudentPointRecordService {
}
