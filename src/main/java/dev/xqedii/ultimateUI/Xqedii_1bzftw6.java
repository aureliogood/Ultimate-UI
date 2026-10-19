package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1bzftw6 {
   private static final ConcurrentHashMap<String, String> Xqedii_1f339wj7bccn2 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1pui181kvlq5v = -800874826;
   private static volatile int Xqedii_sx1gfxieezvq = -1053990832;
   private static volatile int Xqedii_28dl7p2pp5nol = -1026486796;
   private static volatile int Xqedii_14uleqoud3nhy = 2141005669;
   private static volatile long Xqedii_2lotu581au4ir = 2493442190550606843L;
   private static volatile long Xqedii_dp62xgtt9hus = -3331686347855096388L;
   private static volatile long Xqedii_369cxx8b6k8dx = -5481229884231708778L;
   private static volatile long Xqedii_150ghgbl9xxey = -3290620521794310894L;

   public static int Xqedii_n2klabo6je0a(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1pui181kvlq5v, var1);
   }

   public static int Xqedii_13w8pkordzpz1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_sx1gfxieezvq;
   }

   public static int Xqedii_31tf90x78knqi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_28dl7p2pp5nol;
   }

   public static int Xqedii_ltanse3knagc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_14uleqoud3nhy, var1);
   }

   public static long Xqedii_nq5x2nrptqiz(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2lotu581au4ir, var2);
   }

   public static long Xqedii_h9mo75t5p8ka(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_dp62xgtt9hus;
   }

   public static long Xqedii_atzaa8gh14ts(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_369cxx8b6k8dx;
   }

   public static long Xqedii_3l5f8555lqup9(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_150ghgbl9xxey, var2);
   }

   public static String Xqedii_2lbnmpkswshms(String var0) {
      String var1 = Xqedii_1f339wj7bccn2.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("CMoE4TM9HgAmScP8pkstER4+bcTTeHWNRnQbWwSq4+g=");
            int var3 = -1987582163;

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
            String var9 = Xqedii_1f339wj7bccn2.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3vvnwpzswn7h6() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2adb7c3wu7ua6() {
   }

   private static int Xqedii_11mmibgv7ymmr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1kub3sdjs2x6x(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
