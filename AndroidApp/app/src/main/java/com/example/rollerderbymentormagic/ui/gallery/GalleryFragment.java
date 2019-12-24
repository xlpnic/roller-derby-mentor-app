package com.example.rollerderbymentormagic.ui.gallery;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.rollerderbymentormagic.R;

import static androidx.core.text.HtmlCompat.fromHtml;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);

        CharSequence fullSkillsText = getText(R.string.skills_full);
        String fullSkillsString = getString(R.string.skills_full);

        Spanned s = Html.fromHtml(fullSkillsString);

        textView.setText(s);

        return root;
    }
}