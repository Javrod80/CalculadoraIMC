package ejemplo.miprimeraapp.micalculadoraimcactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.google.android.material.slider.Slider
import java.text.DecimalFormat

class IMC : AppCompatActivity() {

    var resualtura : Int = 100
    var resupeso : Int = 10



    lateinit var varcms :TextView
    lateinit var progressBar: RangeSlider
    lateinit var btn1 : FloatingActionButton
    lateinit var btn2 : FloatingActionButton
    lateinit var varpeso : TextView
    lateinit var barra : FloatingActionButton

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)
        iniView()
        listerer()
        variarPeso()
        calcularImc()




    }


    fun iniView (){
        varcms = findViewById (R.id.varcms)
        progressBar = findViewById(R.id.progressBar)
        varpeso = findViewById(R.id.varpeso)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        barra = findViewById(R.id.barra)




    }

    fun listerer () = progressBar.addOnChangeListener { _, value, _ ->
        val df = DecimalFormat("#.##")
        resualtura = df.format(value).toInt()
        varcms.text = "$resualtura cms"

        btn1.setOnClickListener {
            resupeso -=1
            variarPeso()
        }
        btn2.setOnClickListener {
            resupeso +=1
            variarPeso()
        }
        barra.setOnClickListener {
            calcularImc()
        }

    }
    fun variarPeso (){
        varpeso.text = "$resupeso KG"
    }


    private fun calcularImc():Double {
        val df = DecimalFormat("#.##")
        val imc = resualtura / (resualtura.toDouble() * resualtura.toDouble() /100)
        return df.format(imc).toDouble()




    }

}





