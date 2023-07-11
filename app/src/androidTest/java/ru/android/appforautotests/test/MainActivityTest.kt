package ru.android.appforautotests.test

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.github.kakaocup.kakao.screen.Screen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.android.appforautotests.MainActivity
import ru.android.appforautotests.screen.MainScreen

@RunWith(AndroidJUnit4::class)
class MainActivityTest : TestCase(
    kaspressoBuilder = Kaspresso.Builder.simple()
) {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun buttonClickTest() = run {
        step("Найти кнопку и кликнуть на нее") {
            Screen.onScreen<MainScreen> {
                button {
                    isDisplayed()
                    hasText("Click me")
                    click()
                }
            }
        }

        step("Проверить, что текст на кнопке изменился после клика") {
            Screen.onScreen<MainScreen> {
                button {
                    hasText("Button clicked")
                }
            }
        }
    }
}
