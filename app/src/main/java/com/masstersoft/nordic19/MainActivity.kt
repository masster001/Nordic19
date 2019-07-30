package com.masstersoft.nordic19

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val emptyFragment = EmptyFragment()
        fragmentTransaction.add(R.id.main_activity_container,emptyFragment)
        fragmentTransaction.commit()

        //web.loadUrl("https://yandex.ru/")
    }
}
