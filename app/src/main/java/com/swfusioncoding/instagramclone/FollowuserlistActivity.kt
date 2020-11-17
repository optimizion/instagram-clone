package com.swfusioncoding.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.swfusioncoding.instagramclone.Bean.FollowBean
import com.swfusioncoding.instagramclone.adapter.FollowAdapter

class FollowuserlistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_followuserlist)

        var followBack = findViewById<ImageButton>(R.id.followBack_btn)

        followBack?.setOnClickListener(){
            var intent = Intent(this, FollowActivity::class.java)
            startActivity(intent)
        }

        //들어갈 데이터를 만드는 코드
        var list = ArrayList<FollowBean>()
        var bean1 = FollowBean()
        bean1.userID = "hello"
        bean1.userName = "hi"
        bean1.userImg = R.drawable.profileimage_sample_2
        var bean2 = FollowBean()
        bean2.userID = "han_ye_seul"
        bean2.userName = "한예슬"
        bean2.userImg = R.drawable.profileimage_sample_12
        var bean3 = FollowBean()
        bean3.userID = "honey_lee32"
        bean3.userName = "이하의 hanee Lee"
        bean3.userImg = R.drawable.profileimage_sample_10
        var bean4 = FollowBean()
        bean4.userID = "madongseok_"
        bean4.userName = "Don Lee 마동석"
        bean4.userImg = R.drawable.profileimage_sample_7
        var bean5 = FollowBean()
        bean5.userID = "todayhouse"
        bean5.userName = "인테리어 가이드 오늘의 : 정보부터 쇼핑, 시고까지 원룸부터 아파트"
        bean5.userImg = R.drawable.profileimage_sample_3
        var bean6 = FollowBean()
        bean6.userID = "zzangjeolml"
        bean6.userName = "인절미 injolml"
        bean6.userImg = R.drawable.profileimage_sample_18
        var bean7 = FollowBean()
        bean7.userID = "cifndisle20"
        bean7.userName = "코로나 때문에 화가난다. 이 기분을 알어?"
        bean7.userImg = R.drawable.profileimage_sample_1
        var bean8 = FollowBean()
        bean8.userID = "rircd22_dise"
        bean8.userName = "생각나는 대로 적어봅시다."
        bean8.userImg = R.drawable.profileimage_sample_6
        var bean9 = FollowBean()
        bean9.userID = "kb Bank_2020"
        bean9.userName = "KB국민은행 2020 리뉴얼"
        bean9.userImg = R.drawable.profileimage_sample_7
        var bean10 = FollowBean()
        bean10.userID = "conan is"
        bean10.userName = "내 이름은 코난. 탐정이죠"
        bean10.userImg = R.drawable.profileimage_sample_10
        var bean11 = FollowBean()
        bean11.userID = "hi_diehsielx939xdif"
        bean11.userName = "의식의 흐름으로 적고있습니다."
        bean11.userImg = R.drawable.profileimage_sample_8
        var bean12 = FollowBean()
        bean12.userID = "gidhxdus_dd"
        bean12.userName = "저기요 아저씨? 여긴 금연구역이예요."
        bean12.userImg = R.drawable.profileimage_sample_8
        var bean13 = FollowBean()
        bean13.userID = "cicicisososo"
        bean13.userName = "시소"
        bean13.userImg = R.drawable.profileimage_sample_11
        var bean14 = FollowBean()
        bean14.userID = "gicsodxg990dsmks"
        bean14.userName = "지금은 7시 00분.. 언제 자냐?"
        bean14.userImg = R.drawable.profileimage_sample_12
        var bean15 = FollowBean()
        bean15.userID = "ivxidos000sdnc"
        bean15.userName = "사실 난 예술인이 되고 싶었지."
        bean15.userImg = R.drawable.profileimage_sample_13
        var bean16 = FollowBean()
        bean16.userID = "fivols4567didcc_dfe"
        bean16.userName = "노트북 사고싶다.. 데스크탑 사고 싶다... 얼마일까?"
        bean16.userImg = R.drawable.profileimage_sample_14
        var bean17 = FollowBean()
        bean17.userID = "divxd_dd_349"
        bean17.userName = "듀얼 모니터 추첨좀.."
        bean17.userImg = R.drawable.profileimage_sample_15
        var bean18 = FollowBean()
        bean18.userID = "dics_243"
        bean18.userName = "돈 없는 학생은 슬퍼요ㅠㅠ"
        bean18.userImg = R.drawable.profileimage_sample_16
        var bean19 = FollowBean()
        bean19.userID = "bufdawe_dfwfs11"
        bean19.userName = "끝이 보여!!"
        bean19.userImg = R.drawable.profileimage_sample_17
        var bean20 = FollowBean()
        bean20.userID = "oh_yee"
        bean20.userName = "오예!"
        bean20.userImg = R.drawable.profileimage_sample_18


        list.add(bean1)
        list.add(bean2)
        list.add(bean3)
        list.add(bean4)
        list.add(bean5)
        list.add(bean6)
        list.add(bean7)
        list.add(bean8)
        list.add(bean9)
        list.add(bean10)
        list.add(bean11)
        list.add(bean12)
        list.add(bean13)
        list.add(bean14)
        list.add(bean15)
        list.add(bean16)
        list.add(bean17)
        list.add(bean18)
        list.add(bean19)
        list.add(bean20)

//리싸이클러뷰 구현코드
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView_follow)
        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        var adapter = FollowAdapter(list)
        recyclerView.adapter = adapter


    }
}