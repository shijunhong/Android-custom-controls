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

//        val paint = Paint()
//        //设置画笔颜色
//        paint.color = Color.RED
//        //设置填充养殖
//        paint.style = Paint.Style.STROKE
//        //设置画笔宽度
//        paint.strokeWidth = 50f
//
//        //画圆
//        canvas.drawCircle(190f,200f,150f,paint)

//        style   填充样式
//        FILL 内部填充
//        FILL_AND_STROKE  内部填充加描边
//        STROKE  描边


//        val paint = Paint()
//        paint.color = Color.RED
//        paint.strokeWidth = 10f
//        paint.style = Paint.Style.FILL
//        canvas.drawCircle(190f,120f,100f,paint)
//
//        paint.style = Paint.Style.FILL_AND_STROKE
//        canvas.drawCircle(190f,400f,100f,paint)
//
//        paint.style = Paint.Style.STROKE
//        canvas.drawCircle(190f,700f,100f,paint)

        //设置画布颜色
        canvas.drawColor(Color.rgb(255,0,255))
    }
}