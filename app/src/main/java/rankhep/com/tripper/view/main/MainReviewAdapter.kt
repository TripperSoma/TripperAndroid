package rankhep.com.tripper.view.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rankhep.com.tripper.R

class MainReviewAdapter : RecyclerView.Adapter<MainReviewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_review_list, parent, false))

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    }

}