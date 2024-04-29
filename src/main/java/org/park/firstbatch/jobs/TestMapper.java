package org.park.firstbatch.jobs;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    void insertData1(String data);

    void insertData2(String data);
}
