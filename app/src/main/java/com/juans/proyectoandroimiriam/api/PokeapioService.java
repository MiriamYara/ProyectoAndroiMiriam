package com.juans.proyectoandroimiriam.api;

import com.juans.proyectoandroimiriam.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapioService {

    @GET("pokemon")
    Call <PokemonRespuesta> obtenerListaPokemon();
}
