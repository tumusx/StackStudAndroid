package murillo.silva.ktcarousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class S2AtributosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s2_atributos)

    }


    override fun onRestart() {
        super.onRestart()
        Log.i("MAS", "tela 2::onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MAS", "tela 2::onStop")
    }
}