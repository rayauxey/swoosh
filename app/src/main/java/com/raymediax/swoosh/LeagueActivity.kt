package com.raymediax.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View

class LeagueActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextClicked(view: View) {
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)
    }

}
