package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2q009hr {
   private static final ConcurrentHashMap<String, String> Xqedii_1cjvmwou91oo0 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_15kbq48e97xt7 = 1935368580;
   private static volatile int Xqedii_170goaqfjw1x = -1294784553;
   private static volatile int Xqedii_3jitebtd5xb82 = 106196262;
   private static volatile int Xqedii_1m1t5jrkviepi = -1012641684;
   private static volatile long Xqedii_q49fv9r7fgru = 1662804288390353880L;
   private static volatile long Xqedii_3gc9adq96dsix = 4966107074372036580L;
   private static volatile long Xqedii_lu1vtfytiimc = 5828943988373017562L;
   private static volatile long Xqedii_1hxq6ib9srxph = -5951819972951998927L;

   public static int Xqedii_14qbzgzbc53rd(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_15kbq48e97xt7, var1);
   }

   public static int Xqedii_3o5fvemdv40t6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_170goaqfjw1x;
   }

   public static int Xqedii_o00zcry05piz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3jitebtd5xb82;
   }

   public static int Xqedii_20od6grxfkria(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1m1t5jrkviepi, var1);
   }

   public static long Xqedii_xb0f3tvmur7a(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_q49fv9r7fgru, var2);
   }

   public static long Xqedii_14w58xdjb31h5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3gc9adq96dsix;
   }

   public static long Xqedii_36m9doxs96uus(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_lu1vtfytiimc;
   }

   public static long Xqedii_flahiw5qmkdv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1hxq6ib9srxph, var2);
   }

   public static String Xqedii_20u8zn3cpzfyt(String var0) {
      String var1 = Xqedii_1cjvmwou91oo0.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("v3OP9IkK/o0BJftI9in67wVfZLLvoRzF38EWyBTvbpc=");
            int var3 = 1348527260;

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
            String var9 = Xqedii_1cjvmwou91oo0.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1tt7f7e5b49j0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1d29jh4twggev() {
   }

   private static int Xqedii_1nlhxo8sjfdsd(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1iojhmr3asrd0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
