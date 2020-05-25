package com.shijunhong.fuckthecustomcontrols.one

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class BasisView : View {
    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val paint = Paint()
        //设置画笔颜色
        paint.color = Color.RED
        //设置填充养殖
        paint.style = Paint.Style.STROKE
        //设置画笔宽度
        paint.strokeWidth = 50f

        //画圆
        canvas.drawCircle(190f,200f,150f,paint)

    }
}