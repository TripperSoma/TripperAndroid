package rankhep.com.tripper.view.calender

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rankhep.com.tripper.R
import rankhep.com.tripper.model.Daily

class CalenderRecyclerAdapter(var items: ArrayList<Daily>) : RecyclerView.Adapter<CalenderRecyclerAdapter.ViewHolder>() {
    lateinit var mAdapter: DailyRecyclerAdapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_calender, parent, false))

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        mAdapter = DailyRecyclerAdapter(ArrayList())
        holder.run {
            list.run {
                layoutManager = LinearLayoutManager(context)
                adapter = mAdapter
            }
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var list = view.findViewById<RecyclerView>(R.id.daily_list)
    }
}