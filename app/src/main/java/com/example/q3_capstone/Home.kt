package com.example.q3_capstone
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.GoogleApiClient
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class Home: AppCompatActivity() {
    private lateinit var auth : FirebaseAuth
    private lateinit var googleSignInClient : GoogleSignInClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        auth = FirebaseAuth.getInstance()
        val email = intent.getStringExtra("email")
        val displayName = intent.getStringExtra("name")
        findViewById<ImageView>(R.id.imageView27).setOnClickListener{
            setContentView(R.layout.fragment_potato)
        }
        findViewById<ImageView>(R.id.imageView18).setOnClickListener{
            setContentView(R.layout.fragment_carrot)
        }
        findViewById<ImageView>(R.id.imageView28).setOnClickListener{
            setContentView(R.layout.fragment_wheat)
        }
        findViewById<TextView>(R.id.textView).text = email + "\n" + displayName
        findViewById<Button>(R.id.signOutBt).setOnClickListener {
            //googleSignInClient.signOut()
            Firebase.auth.signOut()

            startActivity(Intent(this , MainActivity::class.java))
        }
    }
}