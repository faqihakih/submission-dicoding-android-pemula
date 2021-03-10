package faqih.apps.submission.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import faqih.apps.submission.Adapter.CardViewHebrsAdapter
import faqih.apps.submission.Adapter.HebrsData
import faqih.apps.submission.Data.Hebrs
import faqih.apps.submission.R
import faqih.apps.submission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list : ArrayList<Hebrs> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvHerbs.setHasFixedSize(true)

        list.addAll(HebrsData.listData)
        showReclyceCardView()
    }

    private fun showReclyceCardView(){
        binding.rvHerbs.layoutManager = LinearLayoutManager(this)
        val cardViewHebrsAdapter = CardViewHebrsAdapter(list, object : CardViewHebrsAdapter.bind{
            override fun onClick(data: Hebrs) {
                startActivity(Intent(this@MainActivity, DetailActivity::class.java)
                        .putExtra("HebrsName", data.name)
                        .putExtra("HebrsDesc", data.description)
                        .putExtra("HebrsEfficacy", data.efficacy)
                        .putExtra("HebrsImage", data.image)
                )
            }
        })
        binding.rvHerbs.adapter = cardViewHebrsAdapter
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