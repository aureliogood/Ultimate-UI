package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_5f6okib {
   private static final ConcurrentHashMap<String, String> Xqedii_2jm6bhrno9icr = new ConcurrentHashMap<>();
   private static volatile int Xqedii_34vsk8efq3g6b = 759212396;
   private static volatile int Xqedii_2ht4u89hpsd8q = 1127215998;
   private static volatile int Xqedii_29asnxd0fdnju = -348277222;
   private static volatile int Xqedii_2ud9gryh7awib = 1766288809;
   private static volatile long Xqedii_1bsv8d4ckkwzq = 2220637948256548235L;
   private static volatile long Xqedii_30ne51dn2bjkf = -6453088864195412658L;
   private static volatile long Xqedii_3noa5zrow45ph = -6605590974860729125L;
   private static volatile long Xqedii_x5yryu2c75gf = -4992763130454437055L;

   public static int Xqedii_3v0ws8k9lzzkz(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_34vsk8efq3g6b, var1);
   }

   public static int Xqedii_2sm43mhjzs7r3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2ht4u89hpsd8q;
   }

   public static int Xqedii_1vaqcydsi1r1r(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_29asnxd0fdnju;
   }

   public static int Xqedii_1yhhmz2zwvpvd(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ud9gryh7awib, var1);
   }

   public static long Xqedii_36s18ido59geq(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1bsv8d4ckkwzq, var2);
   }

   public static long Xqedii_3ex4bjjsopbi2(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_30ne51dn2bjkf;
   }

   public static long Xqedii_1ydbuq5nbgo0q(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3noa5zrow45ph;
   }

   public static long Xqedii_37y152mnzsyer(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_x5yryu2c75gf, var2);
   }

   public static String Xqedii_9ht7yndtutge(String var0) {
      String var1 = Xqedii_2jm6bhrno9icr.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/xEX0lh6x/6yjXQR8Xeg04w/0xjENV/W6ZlkeoOMBBY=");
            int var3 = 1240510579;

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
            String var9 = Xqedii_2jm6bhrno9icr.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_197nvksfo1cry() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_4mp92y2vwg50() {
   }

   private static int Xqedii_1mwk36jb0ootn(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_can3qn1g5pr9(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
