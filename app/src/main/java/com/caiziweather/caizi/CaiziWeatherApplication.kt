package com.caiziweather.caizi

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

// 全局获取 Context 方式
class CaiziWeatherApplication : Application(){

    companion object {
        // 令牌值
        const val TOKEN = ""
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}