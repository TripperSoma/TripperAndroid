package rankhep.com.tripper.view.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import rankhep.com.tripper.R
import rankhep.com.tripper.view.main.presenter.MainContract
import rankhep.com.tripper.view.main.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.View {
    lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = MainPresenter()
        mPresenter.setView(this@MainActivity)

        supportActionBar?.title = "Tripper"

        var adapter = MainReviewAdapter()

        reviewList.layoutManager = GridLayoutManager(this, 2)
        reviewList.adapter = adapter
    }


}
