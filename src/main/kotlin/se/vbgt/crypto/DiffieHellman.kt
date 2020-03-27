package se.vbgt.crypto

import java.math.BigInteger

class DiffieHellman(val modulus: BigInteger, val base: BigInteger) {
    private lateinit var privateKey: BigInteger
    private lateinit var secret: BigInteger

    fun setPrivateKey(privateKey: BigInteger) {
        this.privateKey = privateKey
    }

    fun getPublicKey(): BigInteger = base.modPow(privateKey, modulus)

    fun setPartnersPublicKey(partnerPublicKey: BigInteger) {
        secret = partnerPublicKey.modPow(privateKey, modulus)
    }

    fun getSecret(): BigInteger = secret
}