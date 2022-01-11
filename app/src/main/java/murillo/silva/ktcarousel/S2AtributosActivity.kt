package murillo.silva.ktcarousel

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class S2AtributosActivity : AppCompatActivity() {
    private lateinit var activitChars: MainActivity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s2_atributos)
        orientacaoTwoActiviy()

    }


    override fun onRestart() {
        super.onRestart()
        Log.i("MAS", "tela 2::onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MAS", "tela 2::onStop")
    }

  fun orientacaoTwoActiviy(){
      requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
  }

}