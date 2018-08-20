package rankhep.com.tripper.view.calender

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import rankhep.com.tripper.model.User
import rankhep.com.tripper.view.calender.fragment.CalenderFragment

class CalenderViewPagerAdapter(fm:FragmentManager, private var items:ArrayList<User> = ArrayList()): FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return CalenderFragment()
    }

    override fun getCount(): Int = 3
}