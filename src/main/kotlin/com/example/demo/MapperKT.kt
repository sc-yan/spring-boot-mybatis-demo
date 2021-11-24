package com.example.demo

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface MapperKT {
    @Select("SELECT * from test_table where id = #{id}")
    fun selectSingleItemByID(id: Int): DemoData
}
