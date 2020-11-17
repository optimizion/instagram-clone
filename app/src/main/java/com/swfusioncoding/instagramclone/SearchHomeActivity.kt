package com.swfusioncoding.instagramclone

import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_search_home.*

class SearchHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_home)

        et_searchBar.requestFocus()
        val imm: InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        et_searchBar.postDelayed(Runnable {
            et_searchBar.requestFocus()
            imm.showSoftInput(et_searchBar, 0)
        }, 200)

        ib_back.setOnClickListener {
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        val imm: InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(et_searchBar.windowToken, 0)
    }
}