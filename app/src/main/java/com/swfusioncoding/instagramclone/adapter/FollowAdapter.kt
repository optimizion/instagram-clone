package com.swfusioncoding.instagramclone.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.instargram_test.been.InstagramBean
import com.swfusioncoding.instagramclone.Bean.FollowBean
import com.swfusioncoding.instagramclone.ProfileActivity
import com.swfusioncoding.instagramclone.R
import com.swfusioncoding.instagramclone.SearchActivity
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.list_item_follow.view.*

class FollowAdapter (var listData:ArrayList<FollowBean>)  : RecyclerView.Adapter<FollowAdapter.FollowHolder>()  {

    override fun onBindViewHolder(holder: FollowHolder, position: Int) {
        var bean = listData.get(position)
        holder.userID?.setText(bean.userID)
        holder.userName?.setText(bean.userName)
        holder.userImg?.setBackgroundResource(bean!!.userImg!!)

        //리싸이클러뷰 아이템을 클릭했을 때
        holder.bindItem(listData[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView?.context, ProfileActivity::class.java )
            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }

        holder.delete_btn?.setOnClickListener {
            listData.removeAt(position)
            notifyDataSetChanged()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_follow, parent, false)
        return FollowHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class FollowHolder(var view: View) : RecyclerView.ViewHolder(view){

        public var userID : TextView? = null
        public var userName:TextView?=null
        public var userImg : ImageView? = null

        public var follow_btn: Button?=null
        public var delete_btn:ImageButton? = null

        //바인드 메서드 구현
        fun bindItem(data:FollowBean){
            var followCheck = false
            //라싸이클러뷰 아이템안에 있는 버튼을 클릭했을 때
            follow_btn?.setOnClickListener {
                Toast.makeText(itemView.context, "팔로우 버튼을 클릭했습니다.", Toast.LENGTH_LONG).show()
                if(!followCheck){
                    follow_btn?.setBackgroundColor(Color.WHITE)
                    follow_btn?.setTextColor(Color.BLACK)
                    followCheck=true
                }
                else{
                    follow_btn?.setBackgroundColor(Color.parseColor("#0080FF"))
                    follow_btn?.setTextColor(Color.WHITE)
                    followCheck=false
                }

            }
            //리싸이클러뷰 아이템을 클릭했을 때
            /*itemView.setOnClickListener({
                Toast.makeText(itemView.context, "아이템을 클릭했습니다.", Toast.LENGTH_LONG).show()
            })*/
        }
        init {
            userID = view.findViewById(R.id.userID_txt)
            userName  =view.findViewById(R.id.userName_txt)
            userImg = view.findViewById(R.id.userImg_img)

            follow_btn = view.findViewById(R.id.follow_btn)
            delete_btn = view.findViewById(R.id.delete_btn)
        }
    }
}