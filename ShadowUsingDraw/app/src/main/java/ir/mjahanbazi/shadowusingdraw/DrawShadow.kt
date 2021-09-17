package ir.mjahanbazi.shadowusingdraw

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
