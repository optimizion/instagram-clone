package com.swfusioncoding.instagramclone

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.swfusioncoding.instagramclone.R
import kotlinx.android.synthetic.main.activity_profile.*

// 프로필 탭 메인화면
class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        init()
//        tabLayout.tabIconTint = resources.getColorStateList(R.color.tab_icon, null)

        btn_new.setOnClickListener {
            CustomBottomSheetDialogFragment().apply {
                show(supportFragmentManager, CustomBottomSheetDialogFragment.TAG)
            }
        }

        // 프로필 사진 클릭(프로필 편집)
        btn_profileChange.setOnClickListener {
            startActivityForResult(Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI), 0)
        }

        // 프로필 편집 버튼
        btn_profileEdit.setOnClickListener {
            startActivity(Intent(this, EditProfileActivity::class.java))
        }
    }

    private fun init() {
        val tabIconList = arrayListOf(R.drawable.ic_apps_gray_24dp, R.drawable.ic_account_box_gray_24dp)
        //val tabTextList = arrayListOf("HOME", "CHATTING", "NEWS", "SETTING")

        viewPager_profile.adapter = CustomFragmentStateAdapter(this)
        TabLayoutMediator(tabLayout, viewPager_profile) {
                tab, position ->
            tab.setIcon(tabIconList[position])
            //tab.text = tabTextList[position]
        }.attach()
    }

    /* 4개의 프래그먼트를 달아줄 어댑터 */
    inner class CustomFragmentStateAdapter(fragmentActivity: FragmentActivity):
        FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount(): Int {
            return 2
        }

        override fun createFragment(position: Int): Fragment {
            return when(position) {
                0 -> MyFragment1()
                else -> MyFragment2()
            }
        }
    }
}
