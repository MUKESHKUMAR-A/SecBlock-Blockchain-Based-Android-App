// Generated by view binder compiler. Do not edit!
package com.mukeshkumar.secblock.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mukeshkumar.secblock.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SlidesLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView sliderDesc;

  @NonNull
  public final TextView sliderHeading;

  @NonNull
  public final ImageView sliderImage;

  private SlidesLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull TextView sliderDesc,
      @NonNull TextView sliderHeading, @NonNull ImageView sliderImage) {
    this.rootView = rootView;
    this.sliderDesc = sliderDesc;
    this.sliderHeading = sliderHeading;
    this.sliderImage = sliderImage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SlidesLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SlidesLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.slides_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SlidesLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.slider_desc;
      TextView sliderDesc = ViewBindings.findChildViewById(rootView, id);
      if (sliderDesc == null) {
        break missingId;
      }

      id = R.id.slider_heading;
      TextView sliderHeading = ViewBindings.findChildViewById(rootView, id);
      if (sliderHeading == null) {
        break missingId;
      }

      id = R.id.slider_image;
      ImageView sliderImage = ViewBindings.findChildViewById(rootView, id);
      if (sliderImage == null) {
        break missingId;
      }

      return new SlidesLayoutBinding((ConstraintLayout) rootView, sliderDesc, sliderHeading,
          sliderImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}