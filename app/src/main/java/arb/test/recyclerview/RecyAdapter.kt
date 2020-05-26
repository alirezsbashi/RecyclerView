package arb.test.recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyAdapter(private val data:List<DataModel>,private val context:Context) : RecyclerView.Adapter<RecyAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(parent:View):RecyclerView.ViewHolder(parent){

        val img = parent.findViewById<ImageView>(R.id.custom_img)
        val txt = parent.findViewById<TextView>(R.id.custom_txt)
        val layout = parent.findViewById<LinearLayout>(R.id.custom_lin)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_recyclerview,parent,false))
    }

    override fun getItemCount(): Int = data.count()

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        holder.img.setImageResource(data[position].img)
        holder.txt.text = data[position].txt

        holder.layout.setOnClickListener {
            val intent = Intent(context,FullScreen::class.java)
            intent.putExtra("imgID",data[position].img)
            context.startActivity(intent)
        }
    }
}