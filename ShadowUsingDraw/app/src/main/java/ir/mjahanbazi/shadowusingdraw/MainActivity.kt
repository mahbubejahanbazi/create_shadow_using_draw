package ir.mjahanbazi.shadowusingdraw

import android.graphics.BlurMaskFilter
import android.graphics.Paint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout1: DrawShadow = findViewById(R.id.layout_1)
        layout1.setPaintStyle(Paint.Style.FILL)
        val layout2: DrawShadow = findViewById(R.id.layout_2)
        layout2.setPaintStyle(Paint.Style.FILL)
        layout2.setBlurMaskFilter(BlurMaskFilter(20f,BlurMaskFilter.Blur.NORMAL))
        val layout3: DrawShadow = findViewById(R.id.layout_3)
        layout3.setPaintStyle(Paint.Style.FILL)
        layout3.setBlurMaskFilter(BlurMaskFilter(20f,BlurMaskFilter.Blur.SOLID))
        val layout4: DrawShadow = findViewById(R.id.layout_4)
        layout4.setPaintStyle(Paint.Style.FILL)
        layout4.setBlurMaskFilter(BlurMaskFilter(20f,BlurMaskFilter.Blur.INNER))
        val layout5: DrawShadow = findViewById(R.id.layout_5)
        layout5.setPaintStyle(Paint.Style.FILL)
        layout5.setBlurMaskFilter(BlurMaskFilter(20f,BlurMaskFilter.Blur.OUTER))
        val layout6: DrawShadow = findViewById(R.id.layout_6)
        layout6.setPaintStyle(Paint.Style.STROKE)
        layout6.setStrokeWidth(10f)
        val layout7: DrawShadow = findViewById(R.id.layout_7)
        layout7.setPaintStyle(Paint.Style.STROKE)
        layout7.setStrokeWidth(10f)
        layout7.setBlurMaskFilter(BlurMaskFilter(20f,BlurMaskFilter.Blur.NORMAL))
        val layout8: DrawShadow = findViewById(R.id.layout_8)
        layout8.setPaintStyle(Paint.Style.STROKE)
        layout8.setStrokeWidth(10f)
        layout8.setBlurMaskFilter(BlurMaskFilter(20f,BlurMaskFilter.Blur.SOLID))
        val layout9: DrawShadow = findViewById(R.id.layout_9)
        layout9.setPaintStyle(Paint.Style.STROKE)
        layout9.setStrokeWidth(10f)
        layout9.setBlurMaskFilter(BlurMaskFilter(20f,BlurMaskFilter.Blur.INNER))
        val layout10: DrawShadow = findViewById(R.id.layout_10)
        layout10.setPaintStyle(Paint.Style.STROKE)
        layout10.setStrokeWidth(10f)
        layout10.setBlurMaskFilter(BlurMaskFilter(20f,BlurMaskFilter.Blur.OUTER))
    }
}
