package strartcode.day_five

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    open fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldAblePhone(var Fold:Boolean = false): Phone() {
    fun switchFoldOn() {
        Fold = true
    }

    override fun switchOn() {
        super.switchOn()
    }

    override fun switchOff() {
        super.switchOff()
    }

    override fun checkPhoneScreenLight() {
        super.checkPhoneScreenLight()
    }
}
fun main(){
    FoldAblePhone().switchOn()
    FoldAblePhone().checkPhoneScreenLight()
}