package rankhep.com.tripper.view.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_review_list.view.*
import rankhep.com.tripper.R
import android.graphics.drawable.GradientDrawable
import com.squareup.picasso.Picasso
import rankhep.com.tripper.model.MainReviewListData


class MainReviewAdapter(var items: ArrayList<MainReviewListData>) : RecyclerView.Adapter<MainReviewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_review_list, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.run {
            Picasso.get().load(items[position].photolist[0]).into(img)
            name.text = items[position].usernum.toString()
            title.text = items[position].content
        }
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v)
}