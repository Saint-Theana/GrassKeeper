package com.ulcade.crypto;

public class Crypto
{
	public static void xor(byte[] packet, byte[] key) {
        try {
            for (int i = 0; i < packet.length; i++) {
                packet[i] ^= key[i % key.length];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
