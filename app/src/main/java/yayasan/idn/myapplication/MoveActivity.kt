package yayasan.idn.myapplication

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class MoveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        val tagEmail = intent.getStringExtra("email")
        Toast.makeText(this,tagEmail,Toast.LENGTH_LONG).show()
        Snackbar.make(
            findViewById(R.id.content),
            tagEmail!!,
            Snackbar.LENGTH_SHORT
        ).show()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

}