package com.example.exp0320

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {

    val teacher= arrayListOf<Teacher>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        initData()

        val recycler=findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=TeacherAdapter(teacher)
    }

    private fun initData(){
        for(i in 1..10){
        teacher.add(Teacher().apply {
            name="欧·亨利短篇小说"
            description="《欧·亨利短篇小说精选》是2015年浙江文艺出版社出版的图书，作者是欧·亨利，该书收录了作者最优秀的短篇小说代表作，有《麦琪的礼物》、《警察和赞美诗》、《最后一片叶子》、《带家具出租的房间》等篇目。"
            avater=R.mipmap.book1
        })
        teacher.add(Teacher().apply {
            name="纸牌屋"
            description="《纸牌屋》作者是迈克尔·道布斯。该书被两次改编成电视剧，1990年英国BBC将其改编成电视剧后广受好评，被评为英国史上最伟大的政治剧之一。原著小说分为三部，第二部名为《纸牌屋2：玩转国王》，第三部名为《纸牌屋3：最后一击》"
            avater=R.mipmap.book2
        })
        teacher.add(Teacher().apply {
            name="昆虫记"
            description="该作品是一部概括昆虫的种类、特征、习性和婚习的昆虫生物学著作，记录了昆虫真实的生活，表述的是昆虫为生存而斗争时表现出的灵性，还记载着法布尔痴迷昆虫研究的动因、生平抱负、知识背景、生活状况等等内容。作者将昆虫的多彩生活与自己的人生感悟融为一体，用人性去看待昆虫，字里行间都透露出作者对生命的尊敬与热爱。"
            avater=R.mipmap.book3
        })

    }}
}