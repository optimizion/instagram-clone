package com.swfusioncoding.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.swfusioncoding.instagramclone.Bean.FollowBean
import com.swfusioncoding.instagramclone.R
import com.swfusioncoding.instagramclone.adapter.FollowAdapter

class FollowActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_follow)
        
//들어갈 데이터를 만드는 코드
        var list = ArrayList<FollowBean>()
        var bean1 = FollowBean()
        bean1.userID = "hello"
        bean1.userName = "hi"
        bean1.userImg = R.drawable.ic_baseline_add_box_24

        var bean2 = FollowBean()
        bean2.userID = "hello"
        bean2.userName = "hi"
        bean2.userImg = R.drawable.ic_baseline_add_box_24

        list.add(bean1)
        list.add(bean2)

//리싸이클러뷰 구현코드
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView_follow)
        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        var adapter = FollowAdapter(list)
        recyclerView.adapter = adapter

    }



    override fun getContentViewId(): Int {
        return R.layout.activity_follow
    }

    override fun getNavigationMenuItemId(): Int {
        return R.id.action_follow
    }
}