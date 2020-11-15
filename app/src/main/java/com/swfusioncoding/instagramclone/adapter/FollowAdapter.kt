package com.swfusioncoding.instagramclone.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.swfusioncoding.instagramclone.Bean.FollowBean
import com.swfusioncoding.instagramclone.R

class FollowAdapter (var listData : ArrayList<FollowBean>)  : RecyclerView.Adapter<FollowAdapter.FollowHolder>()  {

    override fun onBindViewHolder(holder: FollowHolder, position: Int) {
        var bean = listData.get(position)
//
//        holder.mainImg?.setBackgroundColor(Color.RED)
//        holder.userImg?.setBackgroundResource(bean!!.userImg!!)
//
//        holder.title?.setText(bean.title)
//        holder.userName?.setText(bean.userName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_follow, parent, false)
        return FollowHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    class FollowHolder(var view: View) : RecyclerView.ViewHolder(view){
//
//        public var mainImg : ImageView? = null
//        public var userImg : ImageView? = null
//        public var title : TextView? = null
//        public var userName : TextView? = null
//
//        init {
//            mainImg = view.findViewById(R.id.mainImg)
//            userImg = view.findViewById(R.id.userImg)
//            title = view.findViewById(R.id.title)
//            userName = view.findViewById(R.id.userName)
//        }
    }
}