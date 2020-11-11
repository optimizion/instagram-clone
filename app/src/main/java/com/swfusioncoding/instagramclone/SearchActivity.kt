package com.swfusioncoding.instagramclone

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.swfusioncoding.instagramclone.Bean.Post
import com.swfusioncoding.instagramclone.adapter.SearchMainAdapter
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
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_search
    }

    override fun getNavigationMenuItemId(): Int {
        return R.id.action_search
    }

    private fun addData(): ArrayList<Post> {
        val posts: ArrayList<Post> = ArrayList()

        for(i in 1..18) {
            var post = Post()
            post.mainImg = R.drawable.testimg
            posts.add(post)
        }

        return posts
    }
}