package com.imk8.android.learningenglish.util;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.imk8.android.learningenglish.R;


/**
 * Created by dev_deny on 10/14/16.
 */
public class ConfirmDialog extends DialogFragment {

    OnListener onListener;

    public static ConfirmDialog newIntance(String type) {
        ConfirmDialog messageDialog = new ConfirmDialog();
        Bundle bundle = new Bundle();
        bundle.putString("type", type);
        messageDialog.setArguments(bundle);
        return messageDialog;
    }

    public void setOnListener(OnListener onListener){
        this.onListener = onListener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_confirm, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.CustomDialog);
    }

    @Override
    public void onViewCreated(View v, @Nullable Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        setStyle(STYLE_NO_FRAME, 0);

        ImageView imgMessage = (ImageView) v.findViewById(R.id.imgMessage);
        TextView txtMessage = (TextView) v.findViewById(R.id.txtMessage);
        Button btnNext = (Button) v.findViewById(R.id.btnNext);

        if (getArguments().getString("type").equals("1")){
            imgMessage.setImageResource(R.drawable.correct);
            txtMessage.setText("Hore! Jawaban Kamu Benar");
            txtMessage.setTextColor(getResources().getColor(R.color.blue));
            btnNext.setText("Lanjutkan");
        } else if (getArguments().getString("type").equals("2")){
            imgMessage.setImageResource(R.drawable.correct);
            txtMessage.setText("Selamat !!! Kamu berhasil menjawab semua dengan benar");
            txtMessage.setTextColor(getResources().getColor(R.color.blue));
            btnNext.setText("OK");
        } else if (getArguments().getString("type").equals("22")){
            imgMessage.setImageResource(R.drawable.wrong);
            txtMessage.setText("Maaf! nyawa kamu sudah habis");
            txtMessage.setTextColor(getResources().getColor(R.color.red));
            btnNext.setText("OK");
        } else {
            imgMessage.setImageResource(R.drawable.wrong);
            txtMessage.setText("Yah! Jawaban Kamu Salah :(");
            txtMessage.setTextColor(getResources().getColor(R.color.red));
            btnNext.setText("Ulangi");
        }

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onListener != null) onListener.onClick(getArguments().getString("type"));
                dismiss();
            }
        });
    }

    public interface OnListener {
        public void onClick(String type);
    }

}