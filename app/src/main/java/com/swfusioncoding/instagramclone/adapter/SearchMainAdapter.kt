package com.swfusioncoding.instagramclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.swfusioncoding.instagramclone.Bean.Post
import com.swfusioncoding.instagramclone.R

class SearchMainAdapter(private val myDataset: ArrayList<Post>) : RecyclerView.Adapter<SearchMainAdapter.SearchMainHolder>() {


    override fun onBindViewHolder(holder: SearchMainHolder, position: Int) {
        var post = myDataset[position]

        holder.imgBtn1?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn2?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn3?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn4?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn5?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn6?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn7?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn8?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn9?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn10?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn11?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn12?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn13?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn14?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn15?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn16?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn17?.setBackgroundResource(post!!.mainImg!!)
        holder.imgBtn18?.setBackgroundResource(post!!.mainImg!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchMainHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_search_main, parent, false)
        return SearchMainHolder(view)
    }

    override fun getItemCount(): Int {
        return myDataset.size
    }


    class SearchMainHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var imgBtn1 : ImageButton? = null
        var imgBtn2 : ImageButton? = null
        var imgBtn3 : ImageButton? = null
        var imgBtn4 : ImageButton? = null
        var imgBtn5 : ImageButton? = null
        var imgBtn6 : ImageButton? = null
        var imgBtn7 : ImageButton? = null
        var imgBtn8 : ImageButton? = null
        var imgBtn9 : ImageButton? = null
        var imgBtn10 : ImageButton? = null
        var imgBtn11 : ImageButton? = null
        var imgBtn12 : ImageButton? = null
        var imgBtn13 : ImageButton? = null
        var imgBtn14 : ImageButton? = null
        var imgBtn15 : ImageButton? = null
        var imgBtn16 : ImageButton? = null
        var imgBtn17 : ImageButton? = null
        var imgBtn18 : ImageButton? = null

        init {
            imgBtn1 = view.findViewById(R.id.img1)
            imgBtn2 = view.findViewById(R.id.img2)
            imgBtn3 = view.findViewById(R.id.img3)
            imgBtn4 = view.findViewById(R.id.img4)
            imgBtn5 = view.findViewById(R.id.img5)
            imgBtn6 = view.findViewById(R.id.img6)
            imgBtn7 = view.findViewById(R.id.img7)
            imgBtn8 = view.findViewById(R.id.img8)
            imgBtn9 = view.findViewById(R.id.img9)
            imgBtn10 = view.findViewById(R.id.img10)
            imgBtn11 = view.findViewById(R.id.img11)
            imgBtn12 = view.findViewById(R.id.img12)
            imgBtn13 = view.findViewById(R.id.img13)
            imgBtn14 = view.findViewById(R.id.img14)
            imgBtn15 = view.findViewById(R.id.img15)
            imgBtn16 = view.findViewById(R.id.img16)
            imgBtn17 = view.findViewById(R.id.img17)
            imgBtn18 = view.findViewById(R.id.img18)
        }
    }
}