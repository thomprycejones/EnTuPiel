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
class MigracionFragment : Fragment() {

    lateinit var inicioButton: RelativeLayout
    lateinit var juegoButton: RelativeLayout
    lateinit var migracionButton: RelativeLayout

    lateinit var goToMigracionChile: RelativeLayout
    lateinit var goToMigracionHaiti: RelativeLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_migracion,container,false)

        inicioButton = view.findViewById(R.id.rv_inicio)
        inicioButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionFragment_to_inicioFragment)
        }
        juegoButton = view.findViewById(R.id.rv_eljuego)
        juegoButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionFragment_to_juegoFragmentFragment)
        }
        migracionButton = view.findViewById(R.id.rv_migracion)
        migracionButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionFragment_self)
        }

        goToMigracionChile = view.findViewById(R.id.goToMigracionChile)
        goToMigracionChile.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionFragment_to_migracionComunidadChile)
        }
        goToMigracionHaiti = view.findViewById(R.id.goToMigracionHaiti)
        goToMigracionHaiti.setOnClickListener {
            this.findNavController().navigate(R.id.action_migracionFragment_to_migracionInformacionHaiti)
        }

        return view
    }


}
