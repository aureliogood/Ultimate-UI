package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_26wnwp4 {
   private static final ConcurrentHashMap<String, String> Xqedii_2ko1xfsztp2d3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_rjji6q52hiyh = -2112029043;
   private static volatile int Xqedii_8kyiqo2lvp3z = -205300661;
   private static volatile int Xqedii_agklfjkvzgop = 2039973912;
   private static volatile int Xqedii_2cyw0fbcbm8we = 391960253;
   private static volatile long Xqedii_399733ery6a6z = -3133042907533528456L;
   private static volatile long Xqedii_3q36d7v6krxnj = 290977598892588922L;
   private static volatile long Xqedii_307ooprab65q8 = -2998779523429456616L;
   private static volatile long Xqedii_vbth6m2zrm2x = -6498460947927041226L;

   public static int Xqedii_3qry81p0u6cph(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_rjji6q52hiyh, var1);
   }

   public static int Xqedii_3abt6k37yb4t1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_8kyiqo2lvp3z;
   }

   public static int Xqedii_1q7qlh6wywjce(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_agklfjkvzgop;
   }

   public static int Xqedii_2j5qh60kgu7ep(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2cyw0fbcbm8we, var1);
   }

   public static long Xqedii_1ck4j1im120ul(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_399733ery6a6z, var2);
   }

   public static long Xqedii_32544oepcxqvs(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3q36d7v6krxnj;
   }

   public static long Xqedii_3elstno2ejux5(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_307ooprab65q8;
   }

   public static long Xqedii_3pp55x3trcvvs(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_vbth6m2zrm2x, var2);
   }

   public static String Xqedii_2jqhn1w10o8uo(String var0) {
      String var1 = Xqedii_2ko1xfsztp2d3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("N4m79F6CNjkkxkrFZqd0Ckn0IzfTou8VEvj69s8HMc8=");
            int var3 = 1263788082;

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
            String var9 = Xqedii_2ko1xfsztp2d3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_24vdwspxh9vmv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2cxl9ac1ceqfo() {
   }

   private static int Xqedii_hnrokdrjephf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_cz4uxagz3xj6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
