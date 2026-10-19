package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_25l2p5a {
   private static final ConcurrentHashMap<String, String> Xqedii_284zjd25fc49m = new ConcurrentHashMap<>();
   private static volatile int Xqedii_23jqilj102607 = -876152314;
   private static volatile int Xqedii_1rlcxf0lton6k = 46379638;
   private static volatile int Xqedii_jk051c6hi48v = 1270217876;
   private static volatile int Xqedii_do60lkcz6eu3 = -308788475;
   private static volatile long Xqedii_2ax7xwbi7l1if = -7875820926545543775L;
   private static volatile long Xqedii_kuwjteh9pjo8 = -6082887047380605808L;
   private static volatile long Xqedii_fdq09cknxfde = 3875840329319444877L;
   private static volatile long Xqedii_2g34de002myu3 = -5979737986288259232L;

   public static int Xqedii_rgw9o9mjzqga(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_23jqilj102607, var1);
   }

   public static int Xqedii_2x91dmy81ypxs(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1rlcxf0lton6k;
   }

   public static int Xqedii_1mljtrior207i(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_jk051c6hi48v;
   }

   public static int Xqedii_m4jjdzi0qqxl(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_do60lkcz6eu3, var1);
   }

   public static long Xqedii_2z2pbl9ceufz6(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2ax7xwbi7l1if, var2);
   }

   public static long Xqedii_1rw7n2360ahnx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_kuwjteh9pjo8;
   }

   public static long Xqedii_2yudxikqehmb8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_fdq09cknxfde;
   }

   public static long Xqedii_1etat2cp5vk00(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2g34de002myu3, var2);
   }

   public static String Xqedii_c8u2th3bcv4r(String var0) {
      String var1 = Xqedii_284zjd25fc49m.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("qpS1aW6fx/5Mi2SKBC0KTK+NiVLKEONiQUKx3OQ8XH0=");
            int var3 = -243671052;

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
            String var9 = Xqedii_284zjd25fc49m.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_10kqept7bycb5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2n20wflaf6n7w() {
   }

   private static int Xqedii_3oo32rhw3er8e(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_wtj0enief71o(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
