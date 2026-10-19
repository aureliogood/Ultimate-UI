package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ynxksjt {
   private static final ConcurrentHashMap<String, String> Xqedii_2wwfne0i768k0 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_340srbtxh6bfa = -1479736798;
   private static volatile int Xqedii_14jhpxsd8rb03 = -258871801;
   private static volatile int Xqedii_16sogrkye3zvl = -1605395964;
   private static volatile int Xqedii_3txf47v25thnf = -579103595;
   private static volatile long Xqedii_1dc1pzq3p2gxf = -2481364170651734080L;
   private static volatile long Xqedii_3qdhr7zcl312e = 6036660717446898278L;
   private static volatile long Xqedii_1cceiss3uleiu = 1748248625804557389L;
   private static volatile long Xqedii_3qxrb5t0fm6wf = 469711091877157507L;

   public static int Xqedii_2l65iwq8emhlh(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_340srbtxh6bfa, var1);
   }

   public static int Xqedii_1ty60a1b4l05u(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_14jhpxsd8rb03;
   }

   public static int Xqedii_1gcm2o5evwg0l(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_16sogrkye3zvl;
   }

   public static int Xqedii_2rw8g59f68dty(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3txf47v25thnf, var1);
   }

   public static long Xqedii_344vy2n2rai94(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1dc1pzq3p2gxf, var2);
   }

   public static long Xqedii_17gwlptnocj28(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3qdhr7zcl312e;
   }

   public static long Xqedii_7t7iqctejyzh(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1cceiss3uleiu;
   }

   public static long Xqedii_2x7x7ijhko4jl(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3qxrb5t0fm6wf, var2);
   }

   public static String Xqedii_292ma7tp5h329(String var0) {
      String var1 = Xqedii_2wwfne0i768k0.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("t8I+HuKtTGrjQcNm7EsxGhzVvobr463NpXHJUcKZxnw=");
            int var3 = 1252084124;

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
            String var9 = Xqedii_2wwfne0i768k0.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2j5as7x95c26k() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_jrwfmcwu0ym1() {
   }

   private static int Xqedii_1slksc40qb6i(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2mnl6d612x68i(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
