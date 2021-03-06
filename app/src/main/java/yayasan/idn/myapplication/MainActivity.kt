package yayasan.idn.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import yayasan.idn.myapplication.R.id.content

class MainActivity : AppCompatActivity() {
    private lateinit var dataEmail:List<String>
    private lateinit var dataPassword:List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.edUsername)
        val password = findViewById<EditText>(R.id.edPassword)
        val btnLogin = findViewById<Button>(R.id.btn_Login)

        dataEmail = listOf("adhi@gmail.com","joko@gmail.com")
        dataPassword = listOf("1234","12345")

        btnLogin.setOnClickListener {
            if(login(username.text.toString(),password.text.toString())){
                Toast.makeText(this, "Logging", Toast.LENGTH_SHORT).show()
                finish()
            }else Toast.makeText(this,"Username or Password Wrong",Toast.LENGTH_LONG).show()

        }

    }

    private fun login(email:String, password:String):Boolean{
        for(i in dataEmail.indices){
            if(email == dataEmail[i] && password == dataPassword[i]){
                startActivity(Intent(this,MoveActivity::class.java).apply {
                    putExtra("email",dataEmail[i])
                    finish()
                })
            }
        }
        return false
    }

}