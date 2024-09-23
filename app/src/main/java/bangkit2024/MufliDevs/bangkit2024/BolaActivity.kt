package bangkit2024.MufliDevs.bangkit2024

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.MufliDevs.bangkit2024.R

class BolaActivity : AppCompatActivity() {

    private lateinit var btnSegitiga : Button
    private lateinit var btnKubus : Button
    private lateinit var btnTabung : Button
    private lateinit var btnBola : Button
    private lateinit var btnSegiEmpat: Button
    private lateinit var btnBalok : Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bola)



        btnSegitiga = findViewById(R.id.btnsegitiga)
        btnBola = findViewById(R.id.btnbola)
        btnKubus = findViewById(R.id.btnkubus)
        btnTabung = findViewById(R.id.btntabung)
        btnSegiEmpat = findViewById(R.id.btnsegiempat)
        btnBalok = findViewById(R.id.btnbalok)
        // using lambda for the instead making a new function.

        btnSegitiga.setOnClickListener {
            val intent = Intent(this@BolaActivity,SegitigaActivity::class.java)
            startActivity(intent)
        }
        btnBola.setOnClickListener {
            val intent = Intent(this@BolaActivity,BolaActivity::class.java)
            startActivity(intent)
        }
        btnKubus.setOnClickListener {
            val intent = Intent(this@BolaActivity,KubusActivity::class.java)
            startActivity(intent)
        }
        btnTabung.setOnClickListener {
            val intent = Intent(this@BolaActivity,TabungActivity::class.java)
            startActivity(intent)
        }
        btnSegiEmpat.setOnClickListener {
            val intent = Intent(this@BolaActivity,SegiEmpat::class.java)
            startActivity(intent)
        }
        btnBalok.setOnClickListener {
            val intent = Intent(this@BolaActivity, MainActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}