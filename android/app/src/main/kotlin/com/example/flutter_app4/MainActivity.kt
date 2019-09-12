package com.example.flutter_app4

import android.os.Bundle

import io.flutter.app.FlutterActivity
import flutter_app4.ViewRegistrant
import com.baidu.mapapi.map.MapView

class MainActivity: FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val mapView = MapView(this)
    ViewRegistrant.registerWith(this, mapView)
//    GeneratedPluginRegistrant.registerWith(this)
  }
}
