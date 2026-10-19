package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_20a4d8b {
   private static final ConcurrentHashMap<String, String> Xqedii_318bwdejiox58 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_10h6ha4u2quxq = -1160645501;
   private static volatile int Xqedii_3vrnmp02ibu0x = -1221572165;
   private static volatile int Xqedii_8yxy8oi53twg = -1305755886;
   private static volatile int Xqedii_3vadypo8s1shg = 845089049;
   private static volatile long Xqedii_1zk6cj87xufyi = 2234048153266542652L;
   private static volatile long Xqedii_2oem5n1elwvso = -8067231441230291629L;
   private static volatile long Xqedii_2sh53oiy63vb1 = -7394499413617811163L;
   private static volatile long Xqedii_3byci9x7ould6 = -1456642024765541063L;

   public static int Xqedii_3o5lcpzmnq4ob(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_10h6ha4u2quxq, var1);
   }

   public static int Xqedii_3op3mj5cfl4tu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3vrnmp02ibu0x;
   }

   public static int Xqedii_3koeh2peb28lr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_8yxy8oi53twg;
   }

   public static int Xqedii_2785rtxe5mj76(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3vadypo8s1shg, var1);
   }

   public static long Xqedii_vjmcsl3f0a5m(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1zk6cj87xufyi, var2);
   }

   public static long Xqedii_yzcgt0a4bqv0(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2oem5n1elwvso;
   }

   public static long Xqedii_3uvpdqpzwtcfv(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2sh53oiy63vb1;
   }

   public static long Xqedii_5mz1o460uwh6(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3byci9x7ould6, var2);
   }

   public static String Xqedii_2p2pzpkdjz1mj(String var0) {
      String var1 = Xqedii_318bwdejiox58.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("m1mvIBEn/6hfefnV/j56hbF1VReaMfpLQKR83HcJO/8=");
            int var3 = -273080489;

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
            String var9 = Xqedii_318bwdejiox58.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2baupu1s8fhia() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2z0oasz6yzj85() {
   }

   private static int Xqedii_en7tljtwks8e(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3fz6gfhj1qb2s(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
