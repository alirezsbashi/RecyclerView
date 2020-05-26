package arb.test.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val data = listOf(
        DataModel(R.drawable.test1,"Background 1") ,
        DataModel(R.drawable.test2,"Background 2") ,
        DataModel(R.drawable.test3,"Background 3") ,
        DataModel(R.drawable.test4,"Background 4") ,
        DataModel(R.drawable.test5,"Background 5") ,
        DataModel(R.drawable.test1,"Background 6") ,
        DataModel(R.drawable.test2,"Background 7") ,
        DataModel(R.drawable.test3,"Background 8") ,
        DataModel(R.drawable.test4,"Background 9") ,
        DataModel(R.drawable.test5,"Background 10") ,
        DataModel(R.drawable.test1,"Background 11") ,
        DataModel(R.drawable.test2,"Background 12") ,
        DataModel(R.drawable.test3,"Background 13") ,
        DataModel(R.drawable.test4,"Background 14") ,
        DataModel(R.drawable.test5,"Background 15") ,
        DataModel(R.drawable.test1,"Background 16") ,
        DataModel(R.drawable.test2,"Background 17") ,
        DataModel(R.drawable.test3,"Background 18") ,
        DataModel(R.drawable.test4,"Background 19") ,
        DataModel(R.drawable.test5,"Background 20") ,
        DataModel(R.drawable.test1,"Background 21") ,
        DataModel(R.drawable.test2,"Background 22") ,
        DataModel(R.drawable.test3,"Background 23") ,
        DataModel(R.drawable.test4,"Background 24") ,
        DataModel(R.drawable.test5,"Background 25")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyAdapter(data,this)
    }
}