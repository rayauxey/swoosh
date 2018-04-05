package com.raymediax.swoosh.Controller

import android.os.Bundle
import com.raymediax.swoosh.R
import com.raymediax.swoosh.Utilities.EXTRA_LEAGUE
import com.raymediax.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for a $league $skill league near you..."
    }
}
