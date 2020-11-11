package com.swfusioncoding.instagramclone

import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instargram_test.been.InstagramBean
import com.swfusioncoding.instagramclone.adapter.InstargramAdapter

class HomeActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_home)

        var image = findViewById<ImageView>(R.id.pica)
        Glide.with(this).load(R.drawable.pica).circleCrop().into(image);

        var instargramBeen1 = InstagramBean()

        instargramBeen1.userName = "차수진"
        instargramBeen1.userImg = R.drawable.rabbit
        instargramBeen1.photoImg = R.drawable.lion
        instargramBeen1.like = "1,999 좋아요"

        var instargramBeen2 = InstagramBean()

        instargramBeen2.userName = "차수진3"
        instargramBeen2.userImg = R.drawable.rabbit
        instargramBeen2.photoImg = R.drawable.friends
        instargramBeen2.like = "1,999 좋아요3"


        var instargramBeen3 = InstagramBean()

        instargramBeen3.userName = "차수진"
        instargramBeen3.userImg = R.drawable.rabbit
        instargramBeen3.photoImg = R.drawable.friends2
        instargramBeen3.like = "1,999 좋아요"

        var data = ArrayList<InstagramBean>()
        data.add(instargramBeen1)
        data.add(instargramBeen2)
        data.add(instargramBeen3)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView_instargram)

        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //recyclerView.layoutManager = layoutManager
        recyclerView?.setLayoutManager(layoutManager)

        var adapter = InstargramAdapter(data)
        recyclerView.adapter = adapter
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_home
    }

    override fun getNavigationMenuItemId(): Int {
        return R.id.action_home
    }
}