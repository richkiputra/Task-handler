package com.example.taskhandler

import android.content.Context
import android.content.SharedPreferences


class LocalStorage(private val context: Context) {

    private val key = "com.biceps_studio.androidlayout.utils"
    private val private = 0

    private val fullName = "fullName"
    private val job = "job"
    private val username = "username"


    fun saveFullName(string: String) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(fullName, string)
        editor.apply()
    }

    fun getFullName(): String {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)

        return sharedPreferences.getString(fullName, "")!!
    }

    fun saveJob(int: Int) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putInt(job, int)
        editor.apply()
    }

    fun getJob(): Int {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)

        return sharedPreferences.getInt(job, -1)
    }
    fun saveUsername(string: String) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(username, string)
        editor.apply()
    }

    fun getUsername(): String {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(key, private)

        return sharedPreferences.getString(username, "")!!
    }


}