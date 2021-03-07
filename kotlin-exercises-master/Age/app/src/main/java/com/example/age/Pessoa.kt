package com.example.age

import java.io.Serializable;
import java.time.Year

class Pessoa: Serializable {
    var name: String
    var year: Int

    constructor(name: String, year: Int) {
        this.name = name
        this.year = year
    }

    fun calculateYear(): Int {
        return 2021 - this.year
    }
}