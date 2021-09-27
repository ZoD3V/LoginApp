package yayasan.idn.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.edUsername)
        val password = findViewById<EditText>(R.id.edPassword)
        val btnLogin = findViewById<Button>(R.id.btn_Login)

        btnLogin.setOnClickListener{
            if(username.text.isNotEmpty() || password.text.isNotEmpty()){
                if(username.text.toString() == "1234" && password.text.toString() == "1234"){
                    Toast.makeText(this,"Welcome",Toast.LENGTH_LONG).show()
                    val intent = Intent(this, MoveActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"Username or Password Wrong!!",Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this,"input required",Toast.LENGTH_LONG).show()
            }
        }
    }


}