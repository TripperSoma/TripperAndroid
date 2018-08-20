package rankhep.com.tripper.view.calender

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rankhep.com.tripper.R
import rankhep.com.tripper.model.Time

class DailyRecyclerAdapter(items: ArrayList<Time>) : RecyclerView.Adapter<DailyRecyclerAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val holder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_daily, parent,false))

        return holder
    }

    override fun getItemCount(): Int = 2

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}