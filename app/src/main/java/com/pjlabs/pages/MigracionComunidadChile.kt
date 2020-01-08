package com.pjlabs.pages


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
class MigracionComunidadChile : Fragment() {

    lateinit var inicioButton: RelativeLayout
    lateinit var juegoButton: RelativeLayout
    lateinit var migracionButton: RelativeLayout

    lateinit var scrollToCifras: RelativeLayout
    lateinit var scrollToDisribucion: RelativeLayout

    lateinit var positionCifras: RelativeLayout
    lateinit var positionDistribucion: RelativeLayout

    lateinit var scrollView: ScrollView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_migracion_comunidad_chile,container,false)

        scrollView = view.findViewById(R.id.scrollview)

        inicioButton = view.findViewById(R.id.rv_inicio)
        inicioButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionComunidadChile_to_inicioFragment)
        }
        juegoButton = view.findViewById(R.id.rv_eljuego)
        juegoButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionComunidadChile_to_juegoFragmentFragment)
        }
        migracionButton = view.findViewById(R.id.rv_migracion)
        migracionButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionComunidadChile_to_migracionFragment)
        }

        positionCifras = view.findViewById(R.id.positionCifras)
        scrollToCifras = view.findViewById(R.id.scrollToCifras)
        scrollToCifras.setOnClickListener {
            scrollView.smoothScrollTo(0, positionCifras.bottom)
        }

        positionDistribucion = view.findViewById(R.id.positionDistribucion)
        scrollToDisribucion = view.findViewById(R.id.scrollToDistribucion)
        scrollToDisribucion.setOnClickListener {
            scrollView.smoothScrollTo(0, positionDistribucion.bottom)

        }

        return view
    }


}
