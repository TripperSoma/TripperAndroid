package rankhep.com.tripper.view.account_register

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_account_register.*
import kotlinx.android.synthetic.main.toolbar_account.*
import rankhep.com.tripper.R
import rankhep.com.tripper.view.account_register.presenter.AccountRegisterContract
import rankhep.com.tripper.view.account_register.presenter.AccountRegisterPresenter

class AccountRegisterActivity : AppCompatActivity(), AccountRegisterContract.View {
    var mPresenter = AccountRegisterPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_register)

        mPresenter.setView(this)
        initView()
    }

    private fun initView(){
        back_btn.setOnClickListener {
            finish()
        }
        finish_btn.setOnClickListener {
            mPresenter.checkBlank(
                    name_edit_text.text.toString(),
                    email_edit_text.text.toString(),
                    pwd_edit_text.text.toString(),
                    pwd_check_edit_text.text.toString(),
                    man.isChecked)

            Log.e("Check", name_edit_text.text.toString() +
                    email_edit_text.text.toString() +
                    pwd_edit_text.text.toString() +
                    pwd_check_edit_text.text.toString() +
                    man.isChecked)
        }
    }

    override fun registerFail(s: String) {
        Toast.makeText(applicationContext, "회원가입 실패 : $s", Toast.LENGTH_SHORT).show()
    }

    override fun registerSuccess() {
        Toast.makeText(applicationContext, "회원가입 성공", Toast.LENGTH_SHORT).show()
    }

    override fun showError(error: String) {
        Toast.makeText(applicationContext, "" + error, Toast.LENGTH_SHORT).show()
    }

}
