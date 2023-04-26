// Generated by view binder compiler. Do not edit!
package com.mukeshkumar.secblock.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.mukeshkumar.secblock.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class SwitchLayoutBinding implements ViewBinding {
  @NonNull
  private final SwitchMaterial rootView;

  @NonNull
  public final SwitchMaterial switchMode;

  private SwitchLayoutBinding(@NonNull SwitchMaterial rootView,
      @NonNull SwitchMaterial switchMode) {
    this.rootView = rootView;
    this.switchMode = switchMode;
  }

  @Override
  @NonNull
  public SwitchMaterial getRoot() {
    return rootView;
  }

  @NonNull
  public static SwitchLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SwitchLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.switch_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SwitchLayoutBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    SwitchMaterial switchMode = (SwitchMaterial) rootView;

    return new SwitchLayoutBinding((SwitchMaterial) rootView, switchMode);
  }
}