package murillo.silva.ktcarousel

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSeria = findViewById<Button>(R.id.btGo)


        buttonSeria.setOnClickListener {
            val intent = Intent(this, S2AtributosActivity::class.java)
            intent.putExtra("pessoa", Cliente(35, "nelson"))
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MAS", "tela 1::onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MAS", "tela 1::onStop")
    }


    private fun orientacaoScreen() {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
}