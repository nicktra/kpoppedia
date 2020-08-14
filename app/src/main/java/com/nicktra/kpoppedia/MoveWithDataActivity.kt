package com.nicktra.kpoppedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataKpopName: TextView = findViewById(R.id.tv_data_kpop_name)
        val tvDataKpopDetail: TextView = findViewById(R.id.tv_data_kpop_detail)
        val imgDataKpop: ImageView = findViewById(R.id.img_data_kpop)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val image = intent.getIntExtra(EXTRA_IMAGE, 0)

        imgDataKpop.setImageResource(image)
        tvDataKpopName.text = name
        tvDataKpopDetail.text = detail

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_share -> {
                val name = intent.getStringExtra(EXTRA_NAME)
                val detail = intent.getStringExtra(EXTRA_DETAIL).take(130)
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "$detail..\n\nFind more about $name on KPOPPedia Apps")
                    type = "text/plain"
                }

                val shareIntent = Intent.createChooser(sendIntent, "Share to ")
                startActivity(shareIntent)
            }
        }
    }
}