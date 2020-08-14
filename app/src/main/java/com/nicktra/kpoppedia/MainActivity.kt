package com.nicktra.kpoppedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvKpop: RecyclerView
    private var list: ArrayList<Kpop> = arrayListOf()
    private var title: String = "KPOPPedia"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActionBarTitle(title)

        rvKpop = findViewById(R.id.rv_kpop)
        rvKpop.setHasFixedSize(true)

        list.addAll(KpopData.listData)
        showRecyclerList()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerList() {
        rvKpop.layoutManager = LinearLayoutManager(this)
        val listKpopAdapter = ListKpopAdapter(list)
        rvKpop.adapter = listKpopAdapter

        listKpopAdapter.setOnItemClickCallback(object : ListKpopAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Kpop) {
                showSelectedKpop(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvKpop.layoutManager = GridLayoutManager(this, 2)
        val gridKpopAdapter = GridKpopAdapter(list)
        rvKpop.adapter = gridKpopAdapter

        gridKpopAdapter.setOnItemClickCallback(object : GridKpopAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Kpop) {
                showSelectedKpop(data)
            }
        })
    }

    private fun showAbout() {
        val moveAboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(moveAboutIntent)
    }

    private fun showSelectedKpop(kpop: Kpop) {
        Toast.makeText(this, "You select " + kpop.name, Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, kpop.name)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_IMAGE, kpop.photo)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_DETAIL, kpop.detail)
        startActivity(moveWithDataIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.action_about -> {
                showAbout()
            }
        }
        setActionBarTitle(title)
    }
}