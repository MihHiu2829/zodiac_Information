package com.example.project_63;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.example.project_63.databinding.M001ActMainBinding;
import com.example.project_63.databinding.M002DetailZodiacBinding;

public class m002_detail_zodiac extends baseAct<M002DetailZodiacBinding> {
    @Override
    protected void initViews() {
//        binding.tvShow.setEnabled(false);
//        Intent intent = getIntent() ;
        Bundle data = getIntent().getExtras() ;
            binding.tvContent.setText(data.getInt(m001_act_main.CONTENTZODIAC));
            binding.tvShowImage.setOnClickListener(v->gotoImage(v));
            binding.tvBack.setOnClickListener(v->gotoBack(v));
            binding.tvShow.setImageResource(data.getInt(m001_act_main.DRAWABLEID));
    }

    private void gotoImage(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        binding.tvContent.setEnabled(true);
    }

    private void gotoBack(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        super.onBackPressed();
    }


    @Override
    protected M002DetailZodiacBinding initViewBinding() {
        return M002DetailZodiacBinding.inflate(getLayoutInflater());
    }
}
