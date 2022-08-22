package com.example.project_63;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.example.project_63.databinding.M001ActMainBinding;

public class m001_act_main extends baseAct<M001ActMainBinding>{

    public static final String CONTENTZODIAC = "CONTENT_ZODIAC";
    public static final String DRAWABLEID = "DRAWABLE_ID";
    private int drawableID;
    private int contentZodiac;

    @Override
    protected void initViews() {
        binding.tvIcAries.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_aries,R.string.detail_aries));
        binding.tvIcAquarius.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_aquarius,R.string.detail_aquarius));
        binding.tvIcCappricorn.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_capricorn,R.string.detail_cappricorn));
        binding.tvIcCencer.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_cancer,R.string.detail_pisces));
        binding.tvIcGemini.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_gemeni,R.string.detail_gemini));
        binding.tvIcLeo.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_leo,R.string.detail_leo));
        binding.tvIcLibra.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_libra,R.string.detail_libra));
        binding.tvIcPisces.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_pisces,R.string.detail_pisces));
        binding.tvIcScorpio.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_scorpio,R.string.detail_scorpio));
        binding.tvIcSagittarius.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_sagitaurius,R.string.detail_sagittarius));
        binding.tvIcVirgo.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_virgo,R.string.detail_virgo));
        binding.tvIcTaurus.setOnClickListener(v-> showInformationZodiac(v,R.drawable.ic_taurus,R.string.detail_taurus));
        binding.tvBtDetailZodiac.setOnClickListener(v->gotoDetail());
    }

    private void gotoDetail() {
        Intent intent = new Intent();
        intent.setClass(this, m002_detail_zodiac.class);
//        intent.putExtra(CONTENTZODIAC,contentZodiac);
//        intent.putExtra(DRAWABLEID,drawableID);
        Bundle data = new Bundle();
        data.putInt(DRAWABLEID,drawableID);
        data.putInt(CONTENTZODIAC,contentZodiac);
        intent.putExtras(data);
        startActivity(intent);
    }

    private void showInformationZodiac(View v, int drawableID, int contentZodiac) {
//        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
            binding.icCenterZodiac.setImageResource(drawableID);
            this.drawableID = drawableID;
            this.contentZodiac = contentZodiac ;
            binding.tvBtDetailZodiac.setEnabled(true);
            binding.ivIconZodiacContent.setImageResource(drawableID);
            binding.tv.setText(contentZodiac);

            String nameZodiac = v.getContentDescription().toString() ;
            binding.tvTitleZodiac.setText(nameZodiac);

    }

    @Override
    protected M001ActMainBinding initViewBinding() {
        return M001ActMainBinding.inflate(getLayoutInflater());
    }
}
