package com.raymediax.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.raymediax.swoosh.Utilities.EXTRA_LEAGUE
import com.raymediax.swoosh.Utilities.EXTRA_SKILL
import com.raymediax.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

        skill = "baller"
    }

    fun onFinishClicked(view: View) {
        val levelBtns = listOf(beginnerSkillBtn, ballerSkillBtn)
        var check = false
        for (btn in levelBtns) {
            if (btn.isChecked) {
                check = true
                break
            }
        }
        if (check) {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill level",
                    Toast.LENGTH_SHORT).show()
        }
    }

}
