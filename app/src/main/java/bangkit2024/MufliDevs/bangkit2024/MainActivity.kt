package bangkit2024.MufliDevs.bangkit2024

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.MufliDevs.bangkit2024.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var panjang: EditText
    private lateinit var lebar: EditText
    private lateinit var tinggi: EditText
    private lateinit var button: Button
    private lateinit var hasil: TextView

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        panjang = findViewById(R.id.panjang)
        lebar = findViewById(R.id.lebar)
        tinggi = findViewById(R.id.tinggi)
        button = findViewById(R.id.button)
        hasil = findViewById(R.id.jumlah)

        // using lambda for the instead making a new function.
        button.setOnClickListener {
            val p = panjang.text.toString().trim()
            val l = lebar.text.toString().trim()
            val t = tinggi.text.toString().trim()

            if (p.isEmpty() || l.isEmpty() || t.isEmpty()) {
                hasil.text = "MOHON JANGAN ADA LINE YANG KOSONG!"
            } else {
                val volume = p.toDouble() * l.toDouble() * t.toDouble()
                hasil.text = volume.toString()
            }
        }
        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT)
            hasil.text = result
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View?) {
//        if (view?.id == R.id.button) {
//            val p = panjang.text.toString().trim()
//            val l = lebar.text.toString().trim()
//            val t = tinggi.text.toString().trim()
//
//            if (p.isEmpty() || l.isEmpty() || t.isEmpty()) {
//                hasil.text = "MOHON JANGAN ADA LINE YANG KOSONG!"
//            }
//            else {
//                val volume = p.toDouble() * l.toDouble() * t.toDouble()
//                hasil.text = volume.toString()
//            }
//        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, hasil.text.toString())
    }
}