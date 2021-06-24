package com.oceanbrasil.glidenretrofit

data class Repo (
    val name: String,
    val owner: Owner
    )

data class Owner (
    val login: String,
    val avatar_url: String
    )