package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2f9e8hz {
   private static final ConcurrentHashMap<String, String> Xqedii_149evxjkzdhge = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3araarns85vq4 = -1642590407;
   private static volatile int Xqedii_2f4dvistxyptz = 2062820616;
   private static volatile int Xqedii_292d48iqe9mc4 = 1324250227;
   private static volatile int Xqedii_vjwy24raopvu = -1458618507;
   private static volatile long Xqedii_12bsobgr11f91 = -1290738096908055582L;
   private static volatile long Xqedii_3vb27q1taw2gm = 6406428390321556933L;
   private static volatile long Xqedii_1iztenyw5a5mw = -3605660608581582117L;
   private static volatile long Xqedii_3csgcvkzdg8j4 = -1007904203133117632L;

   public static int Xqedii_7f9mrz52iwtg(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3araarns85vq4, var1);
   }

   public static int Xqedii_2jm6ijc7vjeg6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2f4dvistxyptz;
   }

   public static int Xqedii_2gamlqg67fsoq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_292d48iqe9mc4;
   }

   public static int Xqedii_fg4qjkz50gc4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_vjwy24raopvu, var1);
   }

   public static long Xqedii_q8tonrjr6z60(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_12bsobgr11f91, var2);
   }

   public static long Xqedii_1cq3ug5nn0c18(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3vb27q1taw2gm;
   }

   public static long Xqedii_1m51rokwfff5s(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1iztenyw5a5mw;
   }

   public static long Xqedii_24duyupb1fu7l(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3csgcvkzdg8j4, var2);
   }

   public static String Xqedii_1jsyc6h989wq7(String var0) {
      String var1 = Xqedii_149evxjkzdhge.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("QlCmQzp0DS3iQSEWBjCMgDTocRcL5mjZWdaeSLE9JZ4=");
            int var3 = -646574556;

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
            String var9 = Xqedii_149evxjkzdhge.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_309mowtmq5ltp() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_ckbasz86loum() {
   }

   private static int Xqedii_2ay61q3c1f84c(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3d38xkl81ru1k(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
