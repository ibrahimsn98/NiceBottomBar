package me.ibrahimsn.nicebottombar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import me.ibrahimsn.lib.NiceBottomBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomBar.setActiveItem(1)
        bottomBar.setBadge(2)
        bottomBar.removeBadge(2)

        bottomBar.onItemSelected = {
            status.text = "Item $it selected"
        }

        bottomBar.onItemReselected = {
            status.text = "Item $it re-selected"
        }

        bottomBar.onItemLongClick = {
            status.text = "Item $it long click"
        }
    }
}
