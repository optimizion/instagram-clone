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
        holder.imgBtn1?.setBackgroundResource(myDataset[0]!!.mainImg!!)
        holder.imgBtn2?.setBackgroundResource(myDataset[1]!!.mainImg!!)
        holder.imgBtn3?.setBackgroundResource(myDataset[2]!!.mainImg!!)
        holder.imgBtn4?.setBackgroundResource(myDataset[3]!!.mainImg!!)
        holder.imgBtn5?.setBackgroundResource(myDataset[4]!!.mainImg!!)
        holder.imgBtn6?.setBackgroundResource(myDataset[5]!!.mainImg!!)
        holder.imgBtn7?.setBackgroundResource(myDataset[6]!!.mainImg!!)
        holder.imgBtn8?.setBackgroundResource(myDataset[7]!!.mainImg!!)
        holder.imgBtn9?.setBackgroundResource(myDataset[8]!!.mainImg!!)
        holder.imgBtn10?.setBackgroundResource(myDataset[9]!!.mainImg!!)
        holder.imgBtn11?.setBackgroundResource(myDataset[10]!!.mainImg!!)
        holder.imgBtn12?.setBackgroundResource(myDataset[11]!!.mainImg!!)
        holder.imgBtn13?.setBackgroundResource(myDataset[12]!!.mainImg!!)
        holder.imgBtn14?.setBackgroundResource(myDataset[13]!!.mainImg!!)
        holder.imgBtn15?.setBackgroundResource(myDataset[14]!!.mainImg!!)
        holder.imgBtn16?.setBackgroundResource(myDataset[15]!!.mainImg!!)
        holder.imgBtn17?.setBackgroundResource(myDataset[16]!!.mainImg!!)
        holder.imgBtn18?.setBackgroundResource(myDataset[17]!!.mainImg!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchMainHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_search_main, parent, false)
        return SearchMainHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
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