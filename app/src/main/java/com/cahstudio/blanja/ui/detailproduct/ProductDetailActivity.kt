package com.cahstudio.blanja.ui.detailproduct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.cahstudio.blanja.R
import com.cahstudio.blanja.ui.chart.CartActivity
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.activity_product_detail.toolbar_ivBack

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        product_btnBuy.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }

        toolbar_ivBack.setOnClickListener {
            onBackPressed()
        }
    }
}