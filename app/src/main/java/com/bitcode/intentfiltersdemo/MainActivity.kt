package com.bitcode.intentfiltersdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import com.bitcode.intentfiltersdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowImage.setOnClickListener {
            //var intent = Intent(this, ImageActivity::class.java)

            var intent = Intent("in.bitcode.media.VIEW")
            intent.action = "in.bitcode.media.VIEW"
            intent.addCategory("in.bitcode.category.GENERAL")
            intent.setDataAndType(
                Uri.parse(binding.edtPath.text.toString()),
                "image/png"
            )
            //intent.putExtra("path", binding.edtPath.text.toString())
            startActivity(intent)
        }
    }
}