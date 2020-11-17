package com.swfusioncoding.instagramclone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.swfusioncoding.instagramclone.Bean.FollowBean
import com.swfusioncoding.instagramclone.Bean.UploadBean
import com.swfusioncoding.instagramclone.adapter.FollowAdapter
import com.swfusioncoding.instagramclone.adapter.UploadAdapter

class UploadActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_upload)

        var uploadback = findViewById<ImageButton>(R.id.uploadBack_btn)

        uploadback.setOnClickListener({
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        })

        var list = ArrayList<UploadBean>()
        var bean1 = UploadBean()
        bean1.img1 = R.drawable.profileimage_sample_1
        bean1.img2 = R.drawable.profileimage_sample_2
        bean1.img3 = R.drawable.profileimage_sample_3
        var bean2 = UploadBean()
        bean2.img1 = R.drawable.profileimage_sample_4
        bean2.img2 = R.drawable.profileimage_sample_5
        bean2.img3 = R.drawable.profileimage_sample_6
        var bean3 = UploadBean()
        bean3.img1 = R.drawable.profileimage_sample_7
        bean3.img2 = R.drawable.profileimage_sample_8
        bean3.img3 = R.drawable.profileimage_sample_9

        list.add(bean1)
        list.add(bean2)
        list.add(bean3)

//리싸이클러뷰 구현코드
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView_upload)
        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        var adapter = UploadAdapter(list)
        recyclerView.adapter = adapter
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_upload
    }

    override fun getNavigationMenuItemId(): Int {
        return R.id.action_upload
    }
}