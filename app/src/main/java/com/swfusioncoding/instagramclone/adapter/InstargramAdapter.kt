package com.swfusioncoding.instagramclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//import com.example.instargram_test.R
import com.example.instargram_test.been.InstagramBean
import com.swfusioncoding.instagramclone.R

//import com.example.instargram_test.bean.YoutubeBean
//import kotlinx.android.synthetic.main.list_item_youtube.view.*

//리사이클뷰를 그려주고 데이터를 넣어주는 것
//하나의 item으로 반복적으로 화면에 보여지도록 해준다.
class InstargramAdapter (list:ArrayList<InstagramBean>)  : RecyclerView.Adapter<InstargramAdapter.InstargramHolder>()  {
    var count = 0
    private var mList:ArrayList<InstagramBean>?=null
    init{
        mList = list
    }
    override fun onBindViewHolder(holder: InstargramHolder, position: Int) {
        //데이터를 채워주는 곳
        // 정해진 값이 아니다

        var item = mList?.get(position)

        holder.userImg.setBackgroundResource( item!!.userImg!!)
        holder.userName.setText(item!!.userName!!)
        holder.photoImg.setBackgroundResource(item!!.photoImg!!)
        holder.like.setText(item!!.like!!)
        holder.name.setText(item!!.name!!)
        holder.name_plus.setText(item!!.name_plus!!)

        holder.likeicon?.setOnClickListener({
            if(count == 0) {
                holder.likeicon?.setBackgroundResource(R.drawable.like)
                count = 1
            }
            else {
                holder.likeicon?.setBackgroundResource(R.drawable.ic_like)
                count = 0
            }
        })
    }

    //화면을 그릴 레이아웃 선택
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstargramHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_home, parent, false)
        return InstargramHolder(view)
    }

    //몇번을 반복할지를 적어준다
    override fun getItemCount(): Int {
        return mList!!.size
    }

    //레이아웃에 아이템을 재활용할 수 있게 해주는 클래스
    class InstargramHolder(itemview:View) : RecyclerView.ViewHolder(itemview){
        // 좋아요 버튼 아이콘
        public var likeicon : ImageView? = null

        public var mView:View
        public var userImg:ImageView
        public var userName:TextView
        public var photoImg:ImageView
        public var like:TextView
        public var name:TextView
        public var name_plus:TextView

        init{
            mView = itemView
            likeicon = itemview.findViewById(R.id.likeicon)

            userImg = mView.findViewById(R.id.userImg)
            userName = mView.findViewById(R.id.userName)
            photoImg = mView.findViewById(R.id.photoImg)
            like = mView.findViewById(R.id.like)
            name = mView.findViewById(R.id.name)
            name_plus = mView.findViewById(R.id.name_plus)


        }



    }

}


