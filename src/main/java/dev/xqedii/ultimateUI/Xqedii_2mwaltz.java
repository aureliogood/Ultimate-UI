package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2mwaltz {
   private static final ConcurrentHashMap<String, String> Xqedii_2xij57r9ognnv = new ConcurrentHashMap<>();
   private static volatile int Xqedii_hla99n05apeg = 304543700;
   private static volatile int Xqedii_2as1rh1zxlgtc = -770318001;
   private static volatile int Xqedii_3t1che22337wr = 1558831218;
   private static volatile int Xqedii_3rkb7ts2csoqp = 1348214721;
   private static volatile long Xqedii_3itq98s6eqoep = 5679662325764277140L;
   private static volatile long Xqedii_4z4whh2gk5w4 = -8589156267618458030L;
   private static volatile long Xqedii_2setr5hlkqynu = 222007997024709197L;
   private static volatile long Xqedii_2v57il4jkg8da = -1995227356556426526L;

   public static int Xqedii_2taj75zsyer90(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_hla99n05apeg, var1);
   }

   public static int Xqedii_2zppoj3l6mf1b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2as1rh1zxlgtc;
   }

   public static int Xqedii_mrbkfc692jho(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3t1che22337wr;
   }

   public static int Xqedii_20l5vxmfrdzrs(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3rkb7ts2csoqp, var1);
   }

   public static long Xqedii_3dovmpy7azlns(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3itq98s6eqoep, var2);
   }

   public static long Xqedii_x2z6tavvwi7r(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_4z4whh2gk5w4;
   }

   public static long Xqedii_36b548zvqo0ml(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2setr5hlkqynu;
   }

   public static long Xqedii_3nkadky3fb8uy(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2v57il4jkg8da, var2);
   }

   public static String Xqedii_3qca2wiljiggi(String var0) {
      String var1 = Xqedii_2xij57r9ognnv.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ec969e/Eu57da8fXFO/A4JI5qsH/uPnMsRG83eyNObQ=");
            int var3 = -1726734910;

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
            String var9 = Xqedii_2xij57r9ognnv.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1arpd8hsq3z3z() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_15caeq9e6cpo7() {
   }

   private static int Xqedii_2ato0u2923wdf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3p2eavmkz4wc6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
