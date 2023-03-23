package com.arclightcreatives.basicapparchitecture

import java.util.logging.Handler

class Repository {

    fun onRefresh(repodatacallback: Repodatacallback) {
        android.os.Handler().postDelayed({ repodatacallback.onRepodataready("open") }, 2000)
    }

}

interface Repodatacallback {
    fun onRepodataready(data: String)
}