package bangkit2024.MufliDevs.bangkit2024

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.MufliDevs.bangkit2024.R

class KubusActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var button : Button
    private lateinit var sisi : EditText
    private lateinit var hasil : TextView
    private lateinit var btnSegitiga : Button
    private lateinit var btnKubus : Button
    private lateinit var btnTabung : Button
    private lateinit var btnBola : Button
    private lateinit var btnSegiEmpat: Button
    private lateinit var btnBalok : Button

    companion object {
        const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kubus)
        button = findViewById(R.id.button)
        sisi = findViewById(R.id.sisi)
        hasil = findViewById(R.id.jumlah)
        btnSegitiga = findViewById(R.id.btnsegitiga)
        btnBola = findViewById(R.id.btnbola)
        btnKubus = findViewById(R.id.btnkubus)
        btnTabung = findViewById(R.id.btntabung)
        btnSegiEmpat = findViewById(R.id.btnsegiempat)
        btnBalok = findViewById(R.id.btnbalok)
        // using lambda for the instead making a new function.
        button.setOnClickListener {
            var s = sisi.getText().toString().trim()

            var result = hitungVolumeKubus(s.toDouble())
            hasil.text = result.toString()
        }
        btnSegitiga.setOnClickListener {
            val intent = Intent(this@KubusActivity,SegitigaActivity::class.java)
            startActivity(intent)
        }
        btnBola.setOnClickListener {
            val intent = Intent(this@KubusActivity,BolaActivity::class.java)
            startActivity(intent)
        }
        btnKubus.setOnClickListener {
            val intent = Intent(this@KubusActivity,KubusActivity::class.java)
            startActivity(intent)
        }
        btnTabung.setOnClickListener {
            val intent = Intent(this@KubusActivity,TabungActivity::class.java)
            startActivity(intent)
        }
        btnSegiEmpat.setOnClickListener {
            val intent = Intent(this@KubusActivity,SegiEmpat::class.java)
            startActivity(intent)
        }
        btnBalok.setOnClickListener {
            val intent = Intent(this@KubusActivity, MainActivity::class.java)
            startActivity(intent)
        }
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT)
            hasil.text = result
        }
    }

   private fun hitungVolumeKubus (sisi : Double) : Double {
        return sisi * sisi * sisi
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}