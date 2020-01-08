package com.pjlabs.pages

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.navigation.fragment.findNavController

import com.pjlabs.R

/**
 * A simple [Fragment] subclass.
 */
class MigracionInformacionHaiti : Fragment() {

    lateinit var inicioButton: RelativeLayout
    lateinit var juegoButton: RelativeLayout
    lateinit var migracionButton: RelativeLayout

    lateinit var scrollToGeografia: RelativeLayout
    lateinit var scrollToHistoria: RelativeLayout
    lateinit var scrollToCultura: RelativeLayout

    lateinit var positionGeografia: RelativeLayout
    lateinit var positionHistoria: RelativeLayout
    lateinit var positionCultura: RelativeLayout

    lateinit var scrollView: ScrollView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_migracion_informacion_haiti,container,false)

        scrollView = view.findViewById(R.id.scrollview)

        inicioButton = view.findViewById(R.id.rv_inicio)
        inicioButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionInformacionHaiti_to_inicioFragment)
        }
        juegoButton = view.findViewById(R.id.rv_eljuego)
        juegoButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionInformacionHaiti_to_juegoFragmentFragment)
        }
        migracionButton = view.findViewById(R.id.rv_migracion)
        migracionButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionInformacionHaiti_to_migracionFragment)
        }

        positionGeografia = view.findViewById(R.id.positionGeografia)
        scrollToGeografia = view.findViewById(R.id.scrollToGeografia)
        scrollToGeografia.setOnClickListener {
            scrollView.smoothScrollTo(0, positionGeografia.bottom)
        }

        positionHistoria = view.findViewById(R.id.positionHistoria)
        scrollToHistoria = view.findViewById(R.id.scrollToHistoria)
        scrollToHistoria.setOnClickListener {
            scrollView.smoothScrollTo(0, positionHistoria.bottom)
        }

        positionCultura = view.findViewById(R.id.positionCultura)
        scrollToCultura = view.findViewById(R.id.scrollToCultura)
        scrollToCultura.setOnClickListener {
            scrollView.smoothScrollTo(0, positionCultura.bottom)
        }

        return view
    }
}
