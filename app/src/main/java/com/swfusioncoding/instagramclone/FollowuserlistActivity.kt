package com.swfusioncoding.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class FollowuserlistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_followuserlist)

        var followBack = findViewById<ImageButton>(R.id.followBack_btn)

        followBack?.setOnClickListener(){
            var intent = Intent(this, FollowActivity::class.java)
            startActivity(intent)
        }

    }
}