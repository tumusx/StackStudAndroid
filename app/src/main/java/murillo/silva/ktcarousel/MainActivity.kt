package murillo.silva.ktcarousel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSeria = findViewById<Button>(R.id.btGo)

        buttonSeria.setOnClickListener {
            val intent = Intent(this, S2AtributosActivity::class.java)
            startActivity(intent)
            intent.putExtra("pessoa", Cliente(35, "nelson"))
            startActivity(intent)
        }
    }
}