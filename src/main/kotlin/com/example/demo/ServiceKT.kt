package com.example.demo

import org.springframework.stereotype.Repository

@Repository
interface ServiceKT {

    fun fetchOneItem(id: Int)


}
