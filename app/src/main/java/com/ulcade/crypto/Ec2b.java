package com.ulcade.crypto;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public class Ec2b
{
	private static byte[] keyScramble(byte[] key)
	{
		byte[] roundKeys =new byte[11 * 16];

		for (int round= 0;round <= 10;round++)
		{
			for (int i= 0;i < 16;i++)
			{
				for (int j= 0;j < 16;j++)
				{
					int idx = (round << 8) + (i * 16) + j;
				    int roundIdx = round * 16 + i;
					roundKeys[roundIdx] = (byte)(
						roundKeys[roundIdx] ^ (Magic.aesXorpadTable[idx] ^ Magic.stackTable[idx]));
				}
			}
		}

		byte[] chip = new byte[16];
		Aes.oqs128Encode(key, roundKeys, chip);
		return chip;
	}

	private static byte[] getDecryptVector(byte[] key, byte[] crypt)
	{
		long seed =getSeed(key,crypt);
		MT19937_64 mt =new  MT19937_64(seed);
		ByteBuffer buf=ByteBuffer.allocate(4096);
		for (int i = 0; i < 4096 >> 3; i++)
		{
			String k=Long.toUnsignedString(mt.nextLong(), 16);
			while (k.length() < 16)
			{
				k = 0 + k;
			}
			byte[] h =hex2b(k);
			buf.put(h[7]);
			buf.put(h[6]);
			buf.put(h[5]);
			buf.put(h[4]);
			buf.put(h[3]);
			buf.put(h[2]);
			buf.put(h[1]);
			buf.put(h[0]);
		}
		return buf.array();

	}

	private static long getSeed(byte[] key, byte[] crypt)
	{
		long val = Long.parseUnsignedLong("FFFFFFFFFFFFFFFF",16);
		ByteBuffer buffer=ByteBuffer.wrap(crypt);
		for(int i=0;i<crypt.length>>3;i++){
			byte[] b=new byte[8];
			buffer.get(b);
			b=flip(b);
			val ^=Long.parseUnsignedLong(b2hex(b),16);
		}
		buffer=ByteBuffer.wrap(key);
		byte[] b=new byte[8];
		buffer.get(b);
		b=flip(b);
		long keyQword0=Long.parseUnsignedLong(b2hex(b),16);
		buffer.get(b);
		b=flip(b);
		long keyQword1=Long.parseUnsignedLong(b2hex(b),16);
		return keyQword1 ^ 0xceac3b5a867837acL ^ val ^ keyQword0;
	}

	private static byte[] flip(byte[] b)
	{
		byte[] j=new byte[b.length];
		for(int k=0;k<j.length;k++){
			j[j.length-1-k]=b[k];
		}
		return j;
	}
	
	private static byte[] hex2b(String str)
	{
        String replaceAll = str.replaceAll(" ", "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(replaceAll.length() >> 1);
        for (int i = 0; i <= replaceAll.length() - 2; i += 2)
		{
            byteArrayOutputStream.write(Integer.parseInt(replaceAll.substring(i, i + 2), 16) & 255);
        }
        return byteArrayOutputStream.toByteArray();
    }
	

	private static String b2hex(byte[] bytes)
	{
        String hex= "";
        if (bytes != null)
		{
            for (Byte b : bytes)
			{
                hex += String.format("%02X", b.intValue() & 0xFF);
            }
        }
        return hex;

    }
	
	public static byte[] generateXorKey(byte[] ec2bKey){
		byte[] key=new byte[16];
		byte[] data=new byte[2048];
		for(int i=0;i<16;i++){
			key[i]=ec2bKey[i+8];
		}
		for(int i=0;i<2048;i++){
			data[i]=ec2bKey[i+28];
		}
		key=keyScramble(key);
		for (int i = 0; i < 16; i++) {
			key[i] ^= Magic.keyXorpadTable[i];
		}
		return getDecryptVector(key,data);
	}

	public static byte[] generateXorKey(long seed)
	{
		MT19937_64 mt=new MT19937_64(seed);
		long a=mt.nextLong();
		mt = new MT19937_64(a);
		mt.nextLong();
		byte[] key = new byte[4096];
		for (int index1 = 0; index1 < key.length; index1 += 8)
		{
			String k=Long.toUnsignedString(mt.nextLong(), 16);
			while (k.length() < 16)
			{
				k = 0 + k;
			}
			byte[] bytes =hex2b(k);
			for (int index2 = index1; index2 < index1 + 8; ++index2)
				key[index2] = bytes[index2 % 8];
		}
		return key;
	}
}
