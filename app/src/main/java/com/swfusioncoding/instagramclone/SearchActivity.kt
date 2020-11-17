package com.swfusioncoding.instagramclone

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.swfusioncoding.instagramclone.Bean.Post
import com.swfusioncoding.instagramclone.adapter.SearchMainAdapter
import kotlinx.android.synthetic.main.activity_search.ll_top_bar
import java.util.*

class SearchActivity : MainActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_search)
        val posts: ArrayList<Post> = addData()

        viewManager = LinearLayoutManager(this)
        viewAdapter = SearchMainAdapter(posts)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerview_search_main).apply {
             setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

        ll_top_bar.setOnClickListener {
            val intent = Intent(this, SearchHomeActivity::class.java)
            startActivity(intent)
        }

    }

    override fun getContentViewId(): Int {
        return R.layout.activity_search
    }

    override fun getNavigationMenuItemId(): Int {
        return R.id.action_search
    }

    private fun addData(): ArrayList<Post> {
        val posts: ArrayList<Post> = ArrayList()

        var post1 = Post()
        post1.mainImg = R.drawable.profileimage_sample_1
        var post2 = Post()
        post2.mainImg = R.drawable.profileimage_sample_2
        var post3 = Post()
        post3.mainImg = R.drawable.profileimage_sample_3
        var post4 = Post()
        post4.mainImg = R.drawable.profileimage_sample_4
        var post5 = Post()
        post5.mainImg = R.drawable.profileimage_sample_5
        var post6 = Post()
        post6.mainImg = R.drawable.profileimage_sample_6
        var post7 = Post()
        post7.mainImg = R.drawable.profileimage_sample_7
        var post8 = Post()
        post8.mainImg = R.drawable.profileimage_sample_8
        var post9 = Post()
        post9.mainImg = R.drawable.profileimage_sample_9
        var post10 = Post()
        post10.mainImg = R.drawable.profileimage_sample_10
        var post11 = Post()
        post11.mainImg = R.drawable.profileimage_sample_11
        var post12 = Post()
        post12.mainImg = R.drawable.profileimage_sample_12
        var post13 = Post()
        post13.mainImg = R.drawable.profileimage_sample_13
        var post14 = Post()
        post14.mainImg = R.drawable.profileimage_sample_14
        var post15 = Post()
        post15.mainImg = R.drawable.profileimage_sample_15
        var post16 = Post()
        post16.mainImg = R.drawable.profileimage_sample_16
        var post17 = Post()
        post17.mainImg = R.drawable.profileimage_sample_17
        var post18 = Post()
        post18.mainImg = R.drawable.profileimage_sample_18

        posts.add(post1)
        posts.add(post2)
        posts.add(post3)
        posts.add(post4)
        posts.add(post5)
        posts.add(post6)
        posts.add(post7)
        posts.add(post8)
        posts.add(post9)
        posts.add(post10)
        posts.add(post11)
        posts.add(post12)
        posts.add(post13)
        posts.add(post14)
        posts.add(post15)
        posts.add(post16)
        posts.add(post17)
        posts.add(post18)

        return posts
    }
}