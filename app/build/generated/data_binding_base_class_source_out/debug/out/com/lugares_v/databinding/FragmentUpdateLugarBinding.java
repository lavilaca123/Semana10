// Generated by view binder compiler. Do not edit!
package com.lugares_v.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lugares_v.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentUpdateLugarBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton btEmail;

  @NonNull
  public final ImageButton btLocation;

  @NonNull
  public final ImageButton btPhone;

  @NonNull
  public final ImageButton btPlay;

  @NonNull
  public final Button btUpdateLugar;

  @NonNull
  public final ImageButton btWeb;

  @NonNull
  public final ImageButton btWhatsapp;

  @NonNull
  public final EditText etCorreo;

  @NonNull
  public final EditText etNombre;

  @NonNull
  public final EditText etTelefono;

  @NonNull
  public final EditText etWeb;

  @NonNull
  public final ImageView imagen;

  @NonNull
  public final TextView tvAltura;

  @NonNull
  public final TextView tvAltura1;

  @NonNull
  public final TextView tvLatitud;

  @NonNull
  public final TextView tvLatitud1;

  @NonNull
  public final TextView tvLongitud;

  @NonNull
  public final TextView tvLongitud1;

  private FragmentUpdateLugarBinding(@NonNull ScrollView rootView, @NonNull ImageButton btEmail,
      @NonNull ImageButton btLocation, @NonNull ImageButton btPhone, @NonNull ImageButton btPlay,
      @NonNull Button btUpdateLugar, @NonNull ImageButton btWeb, @NonNull ImageButton btWhatsapp,
      @NonNull EditText etCorreo, @NonNull EditText etNombre, @NonNull EditText etTelefono,
      @NonNull EditText etWeb, @NonNull ImageView imagen, @NonNull TextView tvAltura,
      @NonNull TextView tvAltura1, @NonNull TextView tvLatitud, @NonNull TextView tvLatitud1,
      @NonNull TextView tvLongitud, @NonNull TextView tvLongitud1) {
    this.rootView = rootView;
    this.btEmail = btEmail;
    this.btLocation = btLocation;
    this.btPhone = btPhone;
    this.btPlay = btPlay;
    this.btUpdateLugar = btUpdateLugar;
    this.btWeb = btWeb;
    this.btWhatsapp = btWhatsapp;
    this.etCorreo = etCorreo;
    this.etNombre = etNombre;
    this.etTelefono = etTelefono;
    this.etWeb = etWeb;
    this.imagen = imagen;
    this.tvAltura = tvAltura;
    this.tvAltura1 = tvAltura1;
    this.tvLatitud = tvLatitud;
    this.tvLatitud1 = tvLatitud1;
    this.tvLongitud = tvLongitud;
    this.tvLongitud1 = tvLongitud1;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentUpdateLugarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentUpdateLugarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_update_lugar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentUpdateLugarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt_email;
      ImageButton btEmail = ViewBindings.findChildViewById(rootView, id);
      if (btEmail == null) {
        break missingId;
      }

      id = R.id.bt_location;
      ImageButton btLocation = ViewBindings.findChildViewById(rootView, id);
      if (btLocation == null) {
        break missingId;
      }

      id = R.id.bt_phone;
      ImageButton btPhone = ViewBindings.findChildViewById(rootView, id);
      if (btPhone == null) {
        break missingId;
      }

      id = R.id.btPlay;
      ImageButton btPlay = ViewBindings.findChildViewById(rootView, id);
      if (btPlay == null) {
        break missingId;
      }

      id = R.id.btUpdateLugar;
      Button btUpdateLugar = ViewBindings.findChildViewById(rootView, id);
      if (btUpdateLugar == null) {
        break missingId;
      }

      id = R.id.bt_web;
      ImageButton btWeb = ViewBindings.findChildViewById(rootView, id);
      if (btWeb == null) {
        break missingId;
      }

      id = R.id.bt_whatsapp;
      ImageButton btWhatsapp = ViewBindings.findChildViewById(rootView, id);
      if (btWhatsapp == null) {
        break missingId;
      }

      id = R.id.etCorreo;
      EditText etCorreo = ViewBindings.findChildViewById(rootView, id);
      if (etCorreo == null) {
        break missingId;
      }

      id = R.id.etNombre;
      EditText etNombre = ViewBindings.findChildViewById(rootView, id);
      if (etNombre == null) {
        break missingId;
      }

      id = R.id.etTelefono;
      EditText etTelefono = ViewBindings.findChildViewById(rootView, id);
      if (etTelefono == null) {
        break missingId;
      }

      id = R.id.etWeb;
      EditText etWeb = ViewBindings.findChildViewById(rootView, id);
      if (etWeb == null) {
        break missingId;
      }

      id = R.id.imagen;
      ImageView imagen = ViewBindings.findChildViewById(rootView, id);
      if (imagen == null) {
        break missingId;
      }

      id = R.id.tv_altura;
      TextView tvAltura = ViewBindings.findChildViewById(rootView, id);
      if (tvAltura == null) {
        break missingId;
      }

      id = R.id.tv_altura1;
      TextView tvAltura1 = ViewBindings.findChildViewById(rootView, id);
      if (tvAltura1 == null) {
        break missingId;
      }

      id = R.id.tv_latitud;
      TextView tvLatitud = ViewBindings.findChildViewById(rootView, id);
      if (tvLatitud == null) {
        break missingId;
      }

      id = R.id.tv_latitud1;
      TextView tvLatitud1 = ViewBindings.findChildViewById(rootView, id);
      if (tvLatitud1 == null) {
        break missingId;
      }

      id = R.id.tv_longitud;
      TextView tvLongitud = ViewBindings.findChildViewById(rootView, id);
      if (tvLongitud == null) {
        break missingId;
      }

      id = R.id.tv_longitud1;
      TextView tvLongitud1 = ViewBindings.findChildViewById(rootView, id);
      if (tvLongitud1 == null) {
        break missingId;
      }

      return new FragmentUpdateLugarBinding((ScrollView) rootView, btEmail, btLocation, btPhone,
          btPlay, btUpdateLugar, btWeb, btWhatsapp, etCorreo, etNombre, etTelefono, etWeb, imagen,
          tvAltura, tvAltura1, tvLatitud, tvLatitud1, tvLongitud, tvLongitud1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}