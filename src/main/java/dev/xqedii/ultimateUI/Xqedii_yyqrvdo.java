package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_yyqrvdo {
   private static final ConcurrentHashMap<String, String> Xqedii_11dfjzd5askob = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3u6z1uce4gow5 = 810218122;
   private static volatile int Xqedii_eqqezchpclp4 = -710472744;
   private static volatile int Xqedii_2xwocmardlyzp = -1040736445;
   private static volatile int Xqedii_2iqs6ffxehv9a = -1897400270;
   private static volatile long Xqedii_1e7iosy7hcu89 = -3666255630315238646L;
   private static volatile long Xqedii_24pccquxqz0c3 = 3674816432785479142L;
   private static volatile long Xqedii_116qhofkhwzte = -468961453149174045L;
   private static volatile long Xqedii_2g4gc59l97a34 = -2633022633475880429L;

   public static int Xqedii_2ovlzyy5bcz9u(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3u6z1uce4gow5, var1);
   }

   public static int Xqedii_2nirllah5vs8e(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_eqqezchpclp4;
   }

   public static int Xqedii_46bnf737nllc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2xwocmardlyzp;
   }

   public static int Xqedii_1js20pktk07y7(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2iqs6ffxehv9a, var1);
   }

   public static long Xqedii_yvw3q4jct335(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1e7iosy7hcu89, var2);
   }

   public static long Xqedii_1myr1acdqcjkl(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_24pccquxqz0c3;
   }

   public static long Xqedii_3suyhzotsfq2r(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_116qhofkhwzte;
   }

   public static long Xqedii_1yvnya8t05rm2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2g4gc59l97a34, var2);
   }

   public static String Xqedii_3tmnbwrhvd6nl(String var0) {
      String var1 = Xqedii_11dfjzd5askob.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("EOH21rTdf5k1XmI9yr0WClQXXwvxR0UEhVBnAzsHJgM=");
            int var3 = -1946056313;

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
            String var9 = Xqedii_11dfjzd5askob.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_24kfpww9aypza() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3n7jzassx236d() {
   }

   private static int Xqedii_33hh8kphvt5le(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1fd0nkfynxabe(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
