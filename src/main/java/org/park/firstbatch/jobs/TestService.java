package org.park.firstbatch.jobs;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TestService {

    private final TestMapper testMapper;

    public void insertData1() {
        String a = "1";
        testMapper.insertData1(a);

    }

    public void insertData2() {
        throw new RuntimeException();
    }
}
