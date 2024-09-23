package bangkit2024.MufliDevs.bangkit2024

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.MufliDevs.bangkit2024.R

class SegiEmpat : AppCompatActivity() {
    private lateinit var btnSegitiga : Button
    private lateinit var btnKubus : Button
    private lateinit var btnTabung : Button
    private lateinit var btnBola : Button
    private lateinit var btnSegiEmpat: Button
    private lateinit var btnBalok : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segi_empat)

        btnSegitiga = findViewById(R.id.btnsegitiga)
        btnBola = findViewById(R.id.btnbola)
        btnKubus = findViewById(R.id.btnkubus)
        btnTabung = findViewById(R.id.btntabung)
        btnSegiEmpat = findViewById(R.id.btnsegiempat)
        btnBalok = findViewById(R.id.btnbalok)
        
        btnSegitiga.setOnClickListener {
            val intent = Intent(this@SegiEmpat,SegitigaActivity::class.java)
            startActivity(intent)
        }
        btnBola.setOnClickListener {
            val intent = Intent(this@SegiEmpat,BolaActivity::class.java)
            startActivity(intent)
        }
        btnKubus.setOnClickListener {
            val intent = Intent(this@SegiEmpat,KubusActivity::class.java)
            startActivity(intent)
        }
        btnTabung.setOnClickListener {
            val intent = Intent(this@SegiEmpat,TabungActivity::class.java)
            startActivity(intent)
        }
        btnSegiEmpat.setOnClickListener {
            val intent = Intent(this@SegiEmpat,SegiEmpat::class.java)
            startActivity(intent)
        }
        btnBalok.setOnClickListener {
            val intent = Intent(this@SegiEmpat, MainActivity::class.java)
            startActivity(intent)
        }
    }
}