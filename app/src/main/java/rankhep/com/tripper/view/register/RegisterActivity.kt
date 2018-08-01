package rankhep.com.tripper.view.register

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import rankhep.com.tripper.R
import rankhep.com.tripper.view.account_register.AccountRegisterActivity
import rankhep.com.tripper.view.login.LoginActivity
import rankhep.com.tripper.view.register.presenter.RegisterContract
import rankhep.com.tripper.view.register.presenter.RegisterPresenter

class RegisterActivity : AppCompatActivity(), RegisterContract.View {

    lateinit var mPresenter: RegisterPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisterPresenter()
        mPresenter.setView(this)

        login_btn.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        }

        tripper_container.setOnClickListener {
            tripperStart()
        }
    }

    override fun tripperStart() {
        startActivity(Intent(this@RegisterActivity, AccountRegisterActivity::class.java))
    }

    override fun facebookStart() {
    }

    override fun naverStart() {
    }
}
