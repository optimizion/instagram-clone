package com.swfusioncoding.instagramclone

import android.os.Bundle

class HomeActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_home
    }

    override fun getNavigationMenuItemId(): Int {
        return R.id.action_home
    }
}