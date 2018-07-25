package rankhep.com.tripper.view.main.presenter

interface MainContract {

    interface View {

    }

    interface Presenter {
        fun setView(view: View)
    }
}