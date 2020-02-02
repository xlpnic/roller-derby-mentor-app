package com.example.rollerderbymentormagic.ui.skills;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.rollerderbymentormagic.R;

import static androidx.core.text.HtmlCompat.fromHtml;

public class SkillsFragment extends Fragment {

    private SkillsViewModel skillsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        skillsViewModel =
                ViewModelProviders.of(this).get(SkillsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_skills, container, false);
        final TextView textView = root.findViewById(R.id.text_skills);

        CharSequence fullSkillsText = getText(R.string.skills_full);
        String fullSkillsString = getString(R.string.skills_full);

        Spanned s = Html.fromHtml(fullSkillsString);

        textView.setText(s);
        textView.setMovementMethod(new ScrollingMovementMethod());

        return root;
    }
}