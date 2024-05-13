package benicio.solutions.pokedexkotlin

import android.app.Activity
import android.view.WindowManager
import androidx.appcompat.app.AppCompatDelegate

class WindosHelp {

    companion object {

        fun configWindow(a: Activity) {

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            a.window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )

        }

    }

}