package com.swfusioncoding.instagramclone.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instargram_test.been.InstagramBean
import com.swfusioncoding.instagramclone.Bean.FollowBean
import com.swfusioncoding.instagramclone.R
import de.hdodenhof.circleimageview.CircleImageView

class FollowAdapter (var listData:ArrayList<FollowBean>)  : RecyclerView.Adapter<FollowAdapter.FollowHolder>()  {

    override fun onBindViewHolder(holder: FollowHolder, position: Int) {
        var bean = listData.get(position)
        holder.userID?.setText(bean.userID)
        holder.userName?.setText(bean.userName)
        holder.userImg?.setBackgroundResource(bean!!.userImg!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_follow, parent, false)
        return FollowHolder(view)
    }

    override fun getItemCount(): Int {
        return 2
    }

    class FollowHolder(var view: View) : RecyclerView.ViewHolder(view){

        public var userID : TextView? = null
        public var userName:TextView?=null
        public var userImg : ImageView? = null
        init {
            userID = view.findViewById(R.id.userID_txt)
            userName  =view.findViewById(R.id.userName_txt)
            userImg = view.findViewById(R.id.userImg_img)

        }
    }
}