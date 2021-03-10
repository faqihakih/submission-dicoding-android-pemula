package faqih.apps.submission.View

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import faqih.apps.submission.R
import faqih.apps.submission.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGithub.setOnClickListener {
            val url = "https://github.com/faqihakih"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        binding.btnIg.setOnClickListener {
            val url = "https://www.instagram.com/faqihakih/"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.btnMainMenu -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
            R.id.btnProfile -> {
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        }
    }
}