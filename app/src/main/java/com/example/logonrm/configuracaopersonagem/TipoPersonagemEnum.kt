package com.example.logonrm.configuracaopersonagem

/**
 * Created by logonrm on 16/03/2018.
 */

enum class TipoPersonagemEnum constructor(val id: Int) {
    SAIYAJIN(0),
    HUMANO(1),
    ANDROIDE(2),
    FREEZA(3),
    MAJIN(4),
    NAMEKUSEIJIN(5);


    companion object {
        fun from(findValue: Int): TipoPersonagemEnum =
                TipoPersonagemEnum.values().first { it.id == findValue }
    }
}