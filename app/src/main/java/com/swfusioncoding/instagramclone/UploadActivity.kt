package com.swfusioncoding.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swfusioncoding.instagramclone.R

class UploadActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_upload
    }

    override fun getNavigationMenuItemId(): Int {
        return R.id.action_upload
    }
}