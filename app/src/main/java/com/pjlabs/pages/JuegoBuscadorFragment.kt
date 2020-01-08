package com.pjlabs.pages


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.navigation.fragment.findNavController

import com.pjlabs.R

/**
 * A simple [Fragment] subclass.
 */
class JuegoBuscadorFragment : Fragment() {

    lateinit var inicioButton: RelativeLayout
    lateinit var juegoButton: RelativeLayout
    lateinit var migracionButton: RelativeLayout

    lateinit var goToJuegoDetalle: RelativeLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_juego_buscador,container,false)

        inicioButton = view.findViewById(R.id.rv_inicio)
        inicioButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_juegoBuscadorFragment_to_inicioFragment)
        }
        juegoButton = view.findViewById(R.id.rv_eljuego)
        juegoButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_juegoBuscadorFragment_to_juegoFragmentFragment)
        }
        migracionButton = view.findViewById(R.id.rv_migracion)
        migracionButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_juegoBuscadorFragment_to_migracionFragment)
        }

        goToJuegoDetalle = view.findViewById(R.id.goToJuegoDetalle)
        goToJuegoDetalle.setOnClickListener {
            this.findNavController().navigate(R.id.action_juegoBuscadorFragment_to_juegoDetalleFragment)
        }

        return view
    }


}
