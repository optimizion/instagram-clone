package com.swfusioncoding.instagramclone

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


abstract class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private var navigationView: BottomNavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentViewId())
        navigationView = findViewById(R.id.navigation)
        navigationView!!.setOnNavigationItemSelectedListener(this)
    }

    override fun onStart() {
        super.onStart()
        updateNavigationBarState()
    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(0, 0)
    }

    override fun onNavigationItemSelected(item: MenuItem) : Boolean {
        navigationView!!.postDelayed({
            when (item.itemId) {
                R.id.action_home -> startActivity(Intent(this, HomeActivity::class.java))
                R.id.action_search -> startActivity(Intent(this, SearchActivity::class.java))
                R.id.action_upload -> startActivity(Intent(this, UploadActivity::class.java))
                R.id.action_follow -> startActivity(Intent(this, FollowActivity::class.java))
                R.id.action_profile -> startActivity(Intent(this, ProfileActivity::class.java))
            }
            finish()
        }, 150)
        return true
    }

    private fun updateNavigationBarState() {
        val actionId: Int = getNavigationMenuItemId()
        selectBottomNavigationBarItem(actionId)
    }

    private fun selectBottomNavigationBarItem(itemId: Int) {
        val item = navigationView!!.menu.findItem(itemId)
        item.isChecked = true
    }

    abstract fun getContentViewId() : Int

    abstract fun getNavigationMenuItemId() : Int
}