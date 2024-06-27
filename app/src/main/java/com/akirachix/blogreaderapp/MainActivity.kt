package com.akirachix.blogreaderapp

import ArticleAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blogreaderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayBlogs()
    }

    fun displayBlogs() {
        val article1 = Article("Chimamanda Adichie", "", "Women In Tech", "12/05/2024", "From the earliest stone advances in artificial intelligence has continuously transformed our lives.", "")
        val article2 = Article("oses Chakuwa", "", "AI Future", "20/05/2024", "Republican lawmakers, right-wing media outlets and influencers, and Trump himself are pushing conspiracies about Biden's health and the debate in general.", "")
        val article3 = Article("Laviella Noella", "", "Data In Tech", "12/06/2024", "There are many scary claims about excess time on digital devices for children and teenagers. ", "")
        val article4 = Article("Manzi Kalisa", "", "Emotional Intelligence", "18/06/2024", "From the earliest stone advances in artificial intelligence has continuously transformed our lives.", "")
        val article5 = Article("Brian Kayonga", "", "Python For Health ", "21/06/2024", "Republican lawmakers, right-wing media outlets and influencers, and Trump himself are pushing conspiracies about Biden's health and the debate in general.", "")
        val article6 = Article("Trevor Noah", "", "African Politics", "22/10/2024", "There are many scary claims about excess time on digital devices for children and teenagers. ", "")
        val article7 = Article("Meghan Otieno", "", "Keep Your Mind Active", "12/05/2024", "From the earliest stone advances in artificial intelligence has continuously transformed our lives.", "")
        val article8 = Article("Queen Bella", "", "Beauty of Science", "02/04/2024", "", "")
        val article9 = Article("Deborah Umukundwa", "", "Tech For Environment", "18/05/2024", "There are many scary claims about excess time on digital devices for children and teenagers. ", "")
        val article10 = Article("Luc Martin", "", "Live More", "05/06/2024", "From the earliest stone advances in artificial intelligence has continuously transformed our lives.", "")

        val blogList = listOf(article1, article2, article3, article4, article5, article6, article7, article8, article9, article10)
        val blogAdapter = ArticleAdapter(blogList)
        binding.rvBlogs.adapter = ArticleAdapter

    }
}