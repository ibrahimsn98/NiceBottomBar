package me.ibrahimsn.nicebottombar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import me.ibrahimsn.lib.NiceBottomBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomBar.setActiveItem(1)
        bottomBar.setBadge(2)
        bottomBar.removeBadge(2)

        bottomBar.setBottomBarCallback(object: NiceBottomBar.BottomBarCallback {
            override fun onItemClick(pos: Int) {

            }
        })
    }
}
