package rankhep.com.tripper.view.calender.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_calender.*
import kotlinx.android.synthetic.main.fragment_calender.view.*
import rankhep.com.tripper.R
import rankhep.com.tripper.model.Daily
import rankhep.com.tripper.view.calender.CalenderRecyclerAdapter

class CalenderFragment : Fragment() {
    lateinit var mAdapter: CalenderRecyclerAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_calender, null)
        mAdapter = CalenderRecyclerAdapter(ArrayList())
        v.calender_list.run {
            layoutManager = LinearLayoutManager(context)
            adapter = mAdapter
        }


        return v
    }
}