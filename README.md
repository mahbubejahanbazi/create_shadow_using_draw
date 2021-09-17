# Create Shadow Using Draw
this project is about creating shadow using draw. for creating shadow BlurMaskFilter setting is used. we use this setting in paint component.
Paint  with modification in :
- style
  - Paint.Style.FILL
  - Paint.Style.STROKE
- BlurMaskFilter
  - BlurMaskFilter.Blur.NORMAL
  - BlurMaskFilter.Blur.SOLID
  - BlurMaskFilter.Blur.INNER
  - BlurMaskFilter.Blur.OUTER

## Tech Stack

Kotlin

<p align="center">
  <img src="https://github.com/mahbubejahanbazi/create_shadow_using_draw/blob/main/images/shadow_1.jpg" />
</p>


<p align="center">
  <img src="https://github.com/mahbubejahanbazi/create_shadow_using_draw/blob/main/images/shadow_2.jpg" />
</p>


<p align="center">
  <img src="https://github.com/mahbubejahanbazi/create_shadow_using_draw/blob/main/images/shadow_3.jpg" />
</p>

## Source code

MainActivity.kt
```kotlin
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
```

DrawShadow.kt
```kotlin
import android.content.Context
import android.graphics.BlurMaskFilter
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.RelativeLayout

class DrawShadow : RelativeLayout {
    init {
        setWillNotDraw(false)
    }

    var paint: Paint = object : Paint() {
        init {
            color = Color.BLUE
            style = Style.FILL_AND_STROKE//default value
            isAntiAlias = true
            strokeWidth = 15f//default value
        }
    }
    private val radius = 20f
    private val space = 20f

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun setPaintStyle(style: Paint.Style) {
        paint.style = style
        invalidate()
    }

    fun setBlurMaskFilter(blurMaskFilter: BlurMaskFilter) {
        paint.maskFilter = blurMaskFilter
        invalidate()
    }

    fun setStrokeWidth(strokeWidth: Float) {
        paint.strokeWidth = strokeWidth
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawRoundRect(space, space, width - space, height - space, radius, radius, paint)
    }
}
```

### in program that we use draw is better to set android:hardwareAccelerated="false" in AndroidManifest.xml 
AndroidManifest.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="ir.mjahanbazi.shadowusingdraw">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.ShadowUsingDraw">
        <activity
            android:name="ir.mjahanbazi.shadowusingdraw.MainActivity"
            android:hardwareAccelerated="false">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>

```
## Contact

mjahanbazi@protonmail.com