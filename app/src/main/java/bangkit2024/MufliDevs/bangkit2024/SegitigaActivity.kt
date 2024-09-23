package bangkit2024.MufliDevs.bangkit2024

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.MufliDevs.bangkit2024.R

class SegitigaActivity : AppCompatActivity() {

    private lateinit var btnSegitiga : Button
    private lateinit var btnKubus : Button
    private lateinit var btnTabung : Button
    private lateinit var btnBola : Button
    private lateinit var btnSegiEmpat: Button
    private lateinit var btnBalok : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segitiga)
        
        btnSegitiga = findViewById(R.id.btnsegitiga)
        btnBola = findViewById(R.id.btnbola)
        btnKubus = findViewById(R.id.btnkubus)
        btnTabung = findViewById(R.id.btntabung)
        btnSegiEmpat = findViewById(R.id.btnsegiempat)
        btnBalok = findViewById(R.id.btnbalok)

        btnSegitiga.setOnClickListener {
            val intent = Intent(this@SegitigaActivity,SegitigaActivity::class.java)
            startActivity(intent)
        }
        btnBola.setOnClickListener {
            val intent = Intent(this@SegitigaActivity,BolaActivity::class.java)
            startActivity(intent)
        }
        btnKubus.setOnClickListener {
            val intent = Intent(this@SegitigaActivity,KubusActivity::class.java)
            startActivity(intent)
        }
        btnTabung.setOnClickListener {
            val intent = Intent(this@SegitigaActivity,TabungActivity::class.java)
            startActivity(intent)
        }
        btnSegiEmpat.setOnClickListener {
            val intent = Intent(this@SegitigaActivity,SegiEmpat::class.java)
            startActivity(intent)
        }
        btnBalok.setOnClickListener {
            val intent = Intent(this@SegitigaActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}