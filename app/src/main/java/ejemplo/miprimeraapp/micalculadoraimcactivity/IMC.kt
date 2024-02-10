package ejemplo.miprimeraapp.micalculadoraimcactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)
    }

    fun restpeso(view: View) {}
    fun sumpeso(view: View) {}
}