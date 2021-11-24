package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ServiceImplKT : ServiceKT {

    @Autowired
    private lateinit var mapper: MapperKT


    override fun fetchOneItem(id: Int) {

        val item: DemoData = mapper.selectSingleItemByID(id)
        println(item)

    }


}
