package com.swfusioncoding.instagramclone

import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instargram_test.been.InstagramBean
import com.swfusioncoding.instagramclone.adapter.InstargramAdapter
import kotlinx.android.synthetic.main.list_item_home.*

class HomeActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_home)

        var image = findViewById<ImageView>(R.id.pica)
        Glide.with(this).load(R.drawable.pica).circleCrop().into(image);

        var image2 = findViewById<ImageView>(R.id.icon)
        Glide.with(this).load(R.drawable.house).circleCrop().into(image2);

        var instargramBeen1 = InstagramBean()

        instargramBeen1.userName = "wor1dismine"
        instargramBeen1.userImg = R.drawable.rabbit
        instargramBeen1.photoImg = R.drawable.lion
        instargramBeen1.like = "좋아요 112개"
        instargramBeen1.name = instargramBeen1.userName
        instargramBeen1.name_plus = instargramBeen1.userName

        var instargramBeen2 = InstagramBean()

        instargramBeen2.userName = "kate_ohh"
        instargramBeen2.userImg = R.drawable.rabbit
        instargramBeen2.photoImg = R.drawable.friends
        instargramBeen2.like = "좋아요 200개"
        instargramBeen2.name = instargramBeen2.userName
        instargramBeen2.name_plus = instargramBeen2.userName

        var instargramBeen3 = InstagramBean()

        instargramBeen3.userName = "yeexxn_n"
        instargramBeen3.userImg = R.drawable.rabbit
        instargramBeen3.photoImg = R.drawable.friends2
        instargramBeen3.like = "좋아요 300개"
        instargramBeen3.name = instargramBeen3.userName
        instargramBeen3.name_plus = instargramBeen3.userName

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