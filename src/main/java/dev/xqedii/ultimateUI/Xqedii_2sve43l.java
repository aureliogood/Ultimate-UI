package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2sve43l {
   private static final ConcurrentHashMap<String, String> Xqedii_33d9l5rlwo4dc = new ConcurrentHashMap<>();
   private static volatile int Xqedii_mkcjx170k6u8 = 1577802608;
   private static volatile int Xqedii_2a25eps819a7a = -1603580139;
   private static volatile int Xqedii_6tgd91oiz6zb = 327340387;
   private static volatile int Xqedii_2f9cq4qrvk1j1 = 1751312731;
   private static volatile long Xqedii_1xu0ho2rdk66i = 8575121421027426024L;
   private static volatile long Xqedii_jmxbqa69vwl = 8137926273613094758L;
   private static volatile long Xqedii_2xvfdh5q4usva = -5525972413426008770L;
   private static volatile long Xqedii_1yy7mgvgxexi8 = -8125813739963431713L;

   public static int Xqedii_1lpfugglunfjc(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_mkcjx170k6u8, var1);
   }

   public static int Xqedii_3txcr8f0oca99(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2a25eps819a7a;
   }

   public static int Xqedii_2jd2ov64kxtqf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_6tgd91oiz6zb;
   }

   public static int Xqedii_2zgscmseh49c2(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2f9cq4qrvk1j1, var1);
   }

   public static long Xqedii_jchz7eaawlr3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1xu0ho2rdk66i, var2);
   }

   public static long Xqedii_2kohjea4jdrv5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_jmxbqa69vwl;
   }

   public static long Xqedii_36n21ytn52z3t(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2xvfdh5q4usva;
   }

   public static long Xqedii_242x8cxrdijhj(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1yy7mgvgxexi8, var2);
   }

   public static String Xqedii_pbb9sc4vfgo8(String var0) {
      String var1 = Xqedii_33d9l5rlwo4dc.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("M2ZDjs5Zzmu2Jp4FToPM3151GjxIKvVhftQ5PTJ5mQw=");
            int var3 = 902961029;

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
            String var9 = Xqedii_33d9l5rlwo4dc.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2z5lpqr3bra76() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1n10yyuu4gk9o() {
   }

   private static int Xqedii_10ucdv81b8hp7(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_195xxdqer47lj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
