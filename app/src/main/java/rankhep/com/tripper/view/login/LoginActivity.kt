package rankhep.com.tripper.view.login

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import rankhep.com.tripper.R
import rankhep.com.tripper.view.login.presenter.LoginContract
import rankhep.com.tripper.view.login.presenter.LoginPresenter

class LoginActivity : AppCompatActivity(), LoginContract.View {

    private var mPresenter = LoginPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mPresenter.setView(this)

        loginBtn.setOnClickListener {
            mPresenter.checkBlank(emailEdit.text.toString(), pwdEdit.text.toString())
        }
    }

    override fun loginSuccess(intent: Intent) {
        Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    override fun loginFail(message: String) {
        Toast.makeText(this, "" + message, Toast.LENGTH_SHORT).show()
    }

    override fun showError(message: String) {
        Toast.makeText(this, "" + message, Toast.LENGTH_SHORT).show()
    }
}
