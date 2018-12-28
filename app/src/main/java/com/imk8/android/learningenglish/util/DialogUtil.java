package com.imk8.android.learningenglish.util;

import android.support.v4.app.FragmentManager;

/**
 * Created by dev_deny on 4/9/17.
 */

public class DialogUtil {

    public static ConfirmDialog confirmDialog(FragmentManager fragmentManager, String type) {
        ConfirmDialog dialog = ConfirmDialog.newIntance(type);
        dialog.show(fragmentManager, "dialogMessage");
        dialog.setCancelable(false);
        return dialog;
    }

}
