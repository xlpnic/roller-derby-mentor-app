package com.example.rollerderbymentormagic.ui.skills;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rollerderbymentormagic.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FocusFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_focus, container, false);
        final TextView textView = root.findViewById(R.id.text_focus);

        String fullSkillString = getString(R.string.skills_focus);

        Spanned s = Html.fromHtml(fullSkillString);

        textView.setText(s);
        textView.setMovementMethod(new ScrollingMovementMethod());

        return root;
    }
}