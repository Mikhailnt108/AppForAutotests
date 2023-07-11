package ru.android.appforautotests.screen

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import ru.android.appforautotests.MainActivity
import ru.android.appforautotests.R

object MainScreen : KScreen<MainScreen>() {

    override val layoutId: Int? = R.layout.activity_main
    override val viewClass: Class<*>? = MainActivity::class.java

    val button = KButton { withId(R.id.button) }
}
