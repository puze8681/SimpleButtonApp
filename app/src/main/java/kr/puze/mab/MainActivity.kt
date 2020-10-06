package kr.puze.mab

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_pc_1.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://w1.a-b.kr"))) }
        button_pc_2.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://w2.a-b.kr"))) }
        button_pc_3.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://w3.a-b.kr"))) }
        button_mobile_1.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://m1.a-b.kr"))) }
        button_mobile_2.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://m2.a-b.kr"))) }
        button_mobile_3.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://m3.a-b.kr"))) }
        button_call.setOnClickListener { startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:02-583-4598"))) }
    }
}