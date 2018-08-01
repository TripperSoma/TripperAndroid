package rankhep.com.tripper.view.register.presenter

interface RegisterContract {
    interface View{
        fun tripperStart()
        fun facebookStart()
        fun naverStart()
    }

    interface Presenter{
        fun setView(v:View)
    }
}