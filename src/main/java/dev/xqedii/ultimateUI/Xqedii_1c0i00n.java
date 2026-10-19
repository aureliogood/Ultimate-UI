package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1c0i00n {
   private static final ConcurrentHashMap<String, String> Xqedii_2yvxm12p39sql = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3lvbefy0mh14b = 2136270275;
   private static volatile int Xqedii_1vmja23go2cir = 204471285;
   private static volatile int Xqedii_1xccaylccl6eb = 282933583;
   private static volatile int Xqedii_262hd697h11ja = 1960400093;
   private static volatile long Xqedii_2wltynip177ze = -4801849669705573791L;
   private static volatile long Xqedii_251wkofgn91y = 6756030404501258643L;
   private static volatile long Xqedii_2pfbec65x77xc = 4907087136393715708L;
   private static volatile long Xqedii_20t7vqpja7gte = -2929334842130303725L;

   public static int Xqedii_1urpo74zhlr5g(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3lvbefy0mh14b, var1);
   }

   public static int Xqedii_2e25kzeh8r9ct(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1vmja23go2cir;
   }

   public static int Xqedii_1li7nb6nrum1i(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1xccaylccl6eb;
   }

   public static int Xqedii_cox8b1fkam56(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_262hd697h11ja, var1);
   }

   public static long Xqedii_1n635uatqxtsb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2wltynip177ze, var2);
   }

   public static long Xqedii_2mfv59nnamzpw(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_251wkofgn91y;
   }

   public static long Xqedii_1bti2oi7j67hi(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2pfbec65x77xc;
   }

   public static long Xqedii_2qh39e6k8rdsb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_20t7vqpja7gte, var2);
   }

   public static String Xqedii_2vzg0n54i9o4n(String var0) {
      String var1 = Xqedii_2yvxm12p39sql.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("tfhc6z2zDtOPffXl5YokdAMQYssRuv0Q6xFHkFpjwFw=");
            int var3 = -1108727362;

            for (int var4 = 0; var4 < var2.length; var4++) {
               var2[var4] ^= (byte)(var3 >>> (var4 & 3) * 8);
            }

            byte[] var11 = Base64.getDecoder().decode(var0);
            Cipher var5 = Cipher.getInstance("AES/GCM/NoPadding");
            var5.init(2, new SecretKeySpec(var2, "AES"), new GCMParameterSpec(128, var11, 0, 12));
            byte[] var6 = var5.doFinal(var11, 12, var11.length - 12);
            char[] var7 = new char[var6.length / 2];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = (char)((var6[var8 * 2] & 255) << 8 | var6[var8 * 2 + 1] & 255);
            }

            String var12 = new String(var7).intern();
            Arrays.fill(var2, (byte)0);
            String var9 = Xqedii_2yvxm12p39sql.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3c4l71g86hl0f() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3odw3n1jkay5w() {
   }

   private static int Xqedii_2tah8f375xzhh(byte[] var0, byte[] var1) {
      if (var1.length != 0 && var0.length >= var1.length) {
         label27:
         for (int var2 = 0; var2 + var1.length <= var0.length; var2++) {
            for (int var3 = 0; var3 < var1.length; var3++) {
               if (var0[var2 + var3] != var1[var3]) {
                  continue label27;
               }
            }

            return var2;
         }

         return -1;
      } else {
         return -1;
      }
   }

   private static /* synthetic */ void Xqedii_16wwnss9dyeiw(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
