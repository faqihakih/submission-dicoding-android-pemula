package faqih.apps.submission.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import faqih.apps.submission.R
import faqih.apps.submission.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getDetails()

        binding.btnShare.setOnClickListener{
            Intent(Intent.ACTION_SEND).apply{
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Tap an icon below to share your content direcly")
                startActivity(Intent.createChooser(this, "Tap an icon below to share your content direcly"))
            }
        }
    }
    private fun getDetails(){
        binding.tvItemName.text = intent.getStringExtra("HebrsName")
        binding.tvItemDescription.text = intent.getStringExtra("HebrsDesc")
        binding.tvItemEfficacy.text = intent.getStringExtra("HebrsEfficacy")
        Glide.with(this)
                .load(intent.getIntExtra("HebrsImage", 0))
                .into(binding.imgItem)
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