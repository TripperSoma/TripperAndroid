package rankhep.com.tripper.view.add.set_taste.presenter

class SetTastePresenter: SetTasteContract.Presenter {
    private lateinit var v:SetTasteContract.View
    override fun setView(view: SetTasteContract.View) {
        v = view
    }
}