package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_voo3zj9 {
   private static final ConcurrentHashMap<String, String> Xqedii_1gf9r4h6s0pal = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1dkhnqw1okvr8 = 1794782071;
   private static volatile int Xqedii_2npumjsyslw23 = 708877636;
   private static volatile int Xqedii_2j1awyl9s9qsc = 51144110;
   private static volatile int Xqedii_1zl5kdan5y950 = 450623797;
   private static volatile long Xqedii_1pdz32o1w3yga = -3614267045153916001L;
   private static volatile long Xqedii_153b3tlyy1e71 = 6718231416042123021L;
   private static volatile long Xqedii_2wavf70de7kkm = 3201075732205147259L;
   private static volatile long Xqedii_1dvid021qrkde = 9028910286035633522L;

   public static int Xqedii_1vu3pbvdttn2p(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1dkhnqw1okvr8, var1);
   }

   public static int Xqedii_1389biy93u53g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2npumjsyslw23;
   }

   public static int Xqedii_2ogp6qa8eoarl(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2j1awyl9s9qsc;
   }

   public static int Xqedii_peezww1uxtyd(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1zl5kdan5y950, var1);
   }

   public static long Xqedii_m4ikhv333r0(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1pdz32o1w3yga, var2);
   }

   public static long Xqedii_39gzfhed69pgl(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_153b3tlyy1e71;
   }

   public static long Xqedii_eov78b8x5u9p(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2wavf70de7kkm;
   }

   public static long Xqedii_p69g2q2965ek(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1dvid021qrkde, var2);
   }

   public static String Xqedii_3mfwuulzw5g1q(String var0) {
      String var1 = Xqedii_1gf9r4h6s0pal.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("08NiJTeZ77d0IXCFfwfzF1mkYmOzpvHRqqulq6dUO5s=");
            int var3 = 697269291;

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
            String var9 = Xqedii_1gf9r4h6s0pal.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_31zqc12dt53wt() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_jurkxayp1kd() {
   }

   private static int Xqedii_1v7u1cayncam5(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_l7g1auz31ndr(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
