package com.swfusioncoding.instagramclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.swfusioncoding.instagramclone.R
import kotlinx.android.synthetic.main.fragment_my2.*

class MyFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = arrayListOf(R.drawable.friends2,R.drawable.friends2,R.drawable.friends2,R.drawable.friends2,R.drawable.friends2,R.drawable.friends2,R.drawable.friends2)

        recyclerview_2.adapter = OneAdapter(items)
        recyclerview_2.layoutManager = GridLayoutManager(context, 3)
    }
}
