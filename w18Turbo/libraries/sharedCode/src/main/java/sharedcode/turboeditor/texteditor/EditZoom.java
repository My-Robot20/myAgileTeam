package sharedcode.turboeditor.texteditor;

import android.content.Context;
import android.widget.EditText;

import sharedcode.turboeditor.preferences.PreferenceHelper;

/**
 * Created by james on 2018-02-12.
 */

public class EditZoom {
    private EditText mEditText;
    private Context mContext;

    public EditZoom(EditText editText, Context context) {
        mEditText = editText;
        mContext = context;
    }

    public void ApplyZoom(int fontSize) {
        if (PreferenceHelper.getLineNumbers(mContext)) {
            mEditText.setPadding(
                    EditTextPadding.getPaddingWithLineNumbers(mContext, fontSize),
                    EditTextPadding.getPaddingTop(mContext),
                    EditTextPadding.getPaddingTop(mContext),
                    0);
        } else {
            mEditText.setPadding(
                    EditTextPadding.getPaddingWithoutLineNumbers(mContext),
                    EditTextPadding.getPaddingTop(mContext),
                    EditTextPadding.getPaddingTop(mContext),
                    0);
        }
        mEditText.setTextSize(fontSize);
    }
}
