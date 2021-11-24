package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping
class DemoController {

    companion object {
        const val DEMO = "/demo"


    }

    @Qualifier("serviceImplKT")
    @Autowired
    lateinit var service: ServiceKT


    @GetMapping(value = [DEMO])
    @ResponseBody
    fun demoFunction(id: Int) {


        service.fetchOneItem(id)

    }


}


