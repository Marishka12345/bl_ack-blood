package com.example.homeapteka

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_apteka.*


class MainActivity : AppCompatActivity() {

    var adapter: SostavAdapter? = null
    var sostavList = ArrayList<sostav>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpag.adapter = fragmentAdapter //viewpager как в main layout

        tabs.setupWithViewPager(viewpag)// tabs как в main layou
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_beauty -> {
                val randomIntent = Intent(this, Beauty_and_Helth::class.java)
             startActivity(randomIntent)
                return true
            }
            R.id.action_child-> {
                val randomIntent = Intent(this, Child::class.java)
                startActivity(randomIntent)
                return true
            }
            R.id.action_aboutAuthor -> {
                val randomIntent = Intent(this, aboutAuthor::class.java)
                startActivity(randomIntent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
