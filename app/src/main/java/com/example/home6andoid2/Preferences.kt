package com.example.home6andoid2

import android.content.Context

class PreferencesHelper(context: Context) {

    private val preferencesHelper = context.getSharedPreferences("My pref", Context.MODE_PRIVATE)

    var isHasPermission: Boolean
        get() = preferencesHelper.getBoolean(IS_HAS_PERMISSION_KEY, false)
        set(value){
            preferencesHelper.edit().putBoolean(IS_HAS_PERMISSION_KEY, value).apply()
        }


    companion object{
        private val IS_HAS_PERMISSION_KEY = "permision"
    }
}