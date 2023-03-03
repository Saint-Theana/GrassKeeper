package com.ulcade.crypto;
import com.ulcade.util.Base64Utils;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;

public class RSAUtils {
    public static final String RSA = "RSA";
    public static final String TRANSFORMATION = "RSA/None/PKCS1Padding";

	public static byte[] decryptByPrivateKey(String content, String privateKey)
	{
		try {
            return decryptByPrivateKey(Base64Utils.decode(content), Base64Utils.decode(privateKey));
        } catch (Exception e) {
            e.printStackTrace();
            return new byte[0];
        }
	}
    
	static{
		
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
	}
	
	
    public static String encryptByPublicKey(String str, String str2) {
        
        try {
            return Base64Utils.encode(encryptByPublicKey(str.getBytes(), Base64Utils.decode(str2)));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] encryptByPublicKey(byte[] bArr, byte[] bArr2) throws Exception {
        KeyFactory keyFactory;
        
		
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr2);
        
            
        keyFactory = KeyFactory.getInstance(RSA, "BC");
       
        PublicKey generatePublic = keyFactory.generatePublic(x509EncodedKeySpec);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, generatePublic);
        return cipher.doFinal(bArr);
    }
	
	

    public static byte[] decryptByPrivateKey(byte[] content, byte[] key) throws Exception {
        //System.err.println(Util.byteArrayToHexStringWithoutBlank(content));
        PrivateKey generatePrivate = KeyFactory.getInstance(RSA,"BC").generatePrivate(new PKCS8EncodedKeySpec(key));
        Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, generatePrivate);
		ByteArrayOutputStream encryptedRegionInfoStream = new ByteArrayOutputStream();
		//Thank you so much GH Copilot
		int chunkSize = 256;
		int regionInfoLength = content.length;
		int numChunks = (int) Math.ceil(regionInfoLength / (double) chunkSize);

		for (int i = 0; i < numChunks; i++) {
			byte[] chunk = Arrays.copyOfRange(content, i * chunkSize, Math.min((i + 1) * chunkSize, regionInfoLength));
			byte[] encryptedChunk = cipher.doFinal(chunk);
			encryptedRegionInfoStream.write(encryptedChunk);
		}
        return encryptedRegionInfoStream.toByteArray();
    }
	
	
	
}

