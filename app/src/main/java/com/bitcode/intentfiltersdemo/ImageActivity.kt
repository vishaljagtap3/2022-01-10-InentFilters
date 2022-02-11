package com.bitcode.intentfiltersdemo

import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import androidx.appcompat.app.AppCompatActivity
import com.bitcode.intentfiltersdemo.databinding.ImageActivityBinding

class ImageActivity : AppCompatActivity() {

    lateinit var binding: ImageActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())

        binding = ImageActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //var uri  = Uri.parse(intent.getStringExtra("path"))
        //binding.img.setImageURI(uri)

        binding.img.setImageURI(intent.data)
    }
}