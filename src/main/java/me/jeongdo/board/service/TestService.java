package me.jeongdo.board.service;

import me.jeongdo.board.mapper.TestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class TestService {

    @Resource
    private TestMapper testMapper;

    @Transactional(readOnly = true)
    public String getCurDatabaseTime() {
        return testMapper.getCurDatabaseTime();
    }
}
