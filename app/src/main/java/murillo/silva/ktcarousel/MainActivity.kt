package murillo.silva.ktcarousel

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var names = arrayListOf<String>()
    var adapter: ArrayAdapter<String>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        orientacaoScreen()

        adapter = ArrayAdapter(this, R.layout.activity_main)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        val buttonSeria = findViewById<Button>(R.id.btGo)
        buttonSeria.setOnClickListener {
            val intent = Intent(this, S2AtributosActivity::class.java)
            intent.putExtra("pessoa", Cliente(35, "nelson"))
            startActivity(intent)
        }
    }

    fun btAddClick(view :View){
        names.add(editText1.text.toString())
        editText1.text.clear()
        adapter?.notifyDataSetChanged()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MAS", "tela 1::onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MAS", "tela 1::onStop")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        orientacaoScreen()
    }


    private fun orientacaoScreen() {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
}