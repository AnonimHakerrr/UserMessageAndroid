package edu.itstep.a10_1senddata;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SlideFragment extends Fragment {
    private Slide slide;

    public SlideFragment(Slide slide) {
        this.slide = slide;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slide, container, false);

        TextView tvHeader = view.findViewById(R.id.tvHeader);
        TextView tvParagraph = view.findViewById(R.id.tvParagraph);

        tvHeader.setText(slide.getHeader());
        tvParagraph.setText(slide.getParagraph());
        view.setBackgroundColor(slide.getColor());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showUserInfoDialog(slide.getUser());
            }
        });
        return view;
    }
    private void showUserInfoDialog(User user) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle(user.getName())
                .setMessage("Email: " + user.getEmail())
                .setPositiveButton("OK", null)
                .show();
    }
}
