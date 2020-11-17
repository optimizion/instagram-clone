package com.swfusioncoding.instagramclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.swfusioncoding.instagramclone.Bean.FollowBean
import com.swfusioncoding.instagramclone.Bean.UploadBean
import com.swfusioncoding.instagramclone.R
import kotlinx.android.synthetic.main.list_item_upload.view.*

class UploadAdapter(var listData:ArrayList<UploadBean>) : RecyclerView.Adapter<UploadAdapter.UploadHolder>(){

    override fun onBindViewHolder(holder: UploadHolder, position: Int) {
        var bean = listData.get(position)

        holder.img1?.setBackgroundResource(bean!!.img1!!)
        holder.img2?.setBackgroundResource(bean!!.img2!!)
        holder.img3?.setBackgroundResource(bean!!.img3!!)
    }
    class UploadHolder(var view: View) : RecyclerView.ViewHolder(view) {
        public var img1: ImageButton? = null
        public var img2: ImageButton? = null
        public var img3: ImageButton? = null

        init {
            img1 =  view.findViewById(R.id.img1)
            img2 =  view.findViewById(R.id.img2)
            img3 =  view.findViewById(R.id.img3)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UploadHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_upload, parent, false)
        return UploadHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }


}
