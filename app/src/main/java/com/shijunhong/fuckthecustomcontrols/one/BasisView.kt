package com.shijunhong.fuckthecustomcontrols.one

import android.content.Context
import android.graphics.*
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
//        canvas.drawColor(Color.rgb(255,0,255))
//
//        //画直线  直线的粗细与画笔的style无关.之与strokeWidth有关
//        val paint = Paint()
//        paint.color = Color.BLACK
//        paint.strokeWidth = 50f
//        paint.style = Paint.Style.FILL_AND_STROKE
//        canvas.drawLine(100f,100f,200f,200f,paint)
//
//        paint.style = Paint.Style.FILL
//        canvas.drawLine(100f,200f,400f,400f,paint)
//
//        paint.style = Paint.Style.STROKE
//        canvas.drawLine(100f,300f,600f,600f,paint)
//
//        paint.strokeWidth = 10f
//        paint.style = Paint.Style.STROKE
//        canvas.drawLine(100f,400f,600f,800f,paint)


        //画点
//        val paint = Paint()
//        paint.color = Color.BLACK
//        paint.strokeWidth = 10f
//        canvas.drawPoint(100f,100f,paint)


        //矩阵
//        val rect = Rect(10,10,100,100)
//        val paint = Paint()
//        paint.color = Color.RED
//        paint.style = Paint.Style.STROKE
//        paint.strokeWidth = 5f
//        canvas.drawRect(rect,paint)

        //直线路径
//        val paint = Paint()
//        paint.color = Color.RED
//        paint.style = Paint.Style.STROKE
//        paint.strokeWidth = 5f
//
//        val path = Path()
//        path.moveTo(10f,10f)  //设定起始点
//        path.lineTo(10f,100f) //第一条直线的终点,第二条直线的起点
//        path.lineTo(300f,100f)//第二条直线
//        path.close()                //闭环
//        canvas.drawPath(path, paint)


        //弧线路径
//        val paint = Paint()
//        paint.color = Color.RED
//        paint.style = Paint.Style.FILL_AND_STROKE
//        paint.strokeWidth = 5f
//        val path = Path()
//        path.moveTo(10f,10f)
//        val rectF = RectF(0f,10f,1000f,200f)
//        path.arcTo(rectF,0f,180f,true)
//        canvas.drawPath(path,paint)

//        //区域
//        val paint = Paint()
//        paint.style = Paint.Style.FILL
//        paint.color = Color.RED
//
//        //构造一个椭圆形
//        val ovalPath = Path()
//        val rectF = RectF(50f,50f,200f,500f)
//        ovalPath.addOval(rectF,Path.Direction.CCW)
//        //在paht函数中传入一个比椭圆形区域小的矩形区域,取交集
//        val rgn = Region()
//        rgn.setPath(ovalPath,Region(50,50,100,250))
//        drawRegion(canvas,rgn,paint)


        //区域相交  union
        val paint = Paint()
        paint.color = Color.RED
        paint.style = Paint.Style.FILL

        val region = Region(10,10,200,100)
        region.union(Rect(10,10,50,300))
        drawRegion(canvas,region,paint)


    }

    private fun drawRegion(canvas: Canvas,rgn:Region,paint: Paint){
        val iter = RegionIterator(rgn)
        val  rect = Rect()
        while (iter.next(rect)){
            canvas.drawRect(rect,paint)
        }
    }



}