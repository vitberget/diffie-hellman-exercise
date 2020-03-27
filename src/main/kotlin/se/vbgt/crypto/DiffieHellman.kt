package se.vbgt.crypto

import java.math.BigInteger

class DiffieHellman(val modulus: BigInteger, val base: BigInteger) {
    fun setPrivateKey(privateKey: BigInteger): Nothing = TODO()
    fun getPublicKey(): BigInteger = TODO()
    fun setPartnersPublicKey(partnerPublicKey: BigInteger): Nothing = TODO()
    fun getSecret(): BigInteger = TODO()
}