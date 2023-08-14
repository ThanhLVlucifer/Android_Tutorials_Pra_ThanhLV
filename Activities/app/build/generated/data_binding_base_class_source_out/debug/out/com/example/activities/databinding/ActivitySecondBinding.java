// Generated by view binder compiler. Do not edit!
package com.example.activities.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.activities.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySecondBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnReply;

  @NonNull
  public final EditText edtReply;

  @NonNull
  public final TextView tvMessage;

  private ActivitySecondBinding(@NonNull RelativeLayout rootView, @NonNull Button btnReply,
      @NonNull EditText edtReply, @NonNull TextView tvMessage) {
    this.rootView = rootView;
    this.btnReply = btnReply;
    this.edtReply = edtReply;
    this.tvMessage = tvMessage;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySecondBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySecondBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_second, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySecondBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_reply;
      Button btnReply = ViewBindings.findChildViewById(rootView, id);
      if (btnReply == null) {
        break missingId;
      }

      id = R.id.edt_reply;
      EditText edtReply = ViewBindings.findChildViewById(rootView, id);
      if (edtReply == null) {
        break missingId;
      }

      id = R.id.tv_message;
      TextView tvMessage = ViewBindings.findChildViewById(rootView, id);
      if (tvMessage == null) {
        break missingId;
      }

      return new ActivitySecondBinding((RelativeLayout) rootView, btnReply, edtReply, tvMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
