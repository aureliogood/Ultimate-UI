package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_zg8ict9 {
   private static final ConcurrentHashMap<String, String> Xqedii_39dwfghfhg6c4 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_30f0pvvrgcyp4 = -229454165;
   private static volatile int Xqedii_7wewo1gaqyw = 1068804419;
   private static volatile int Xqedii_61zg9zhx38w1 = 579502372;
   private static volatile int Xqedii_poqqbchv0vwp = -1788129730;
   private static volatile long Xqedii_4s6z4t0chon = -7199182312403469540L;
   private static volatile long Xqedii_yl8v6olp83md = 4482986705014132404L;
   private static volatile long Xqedii_3fpygrvh3o0hz = 1026487251441610682L;
   private static volatile long Xqedii_hem7tt9cobt0 = 2757703764015772192L;

   public static int Xqedii_qygsvccd020p(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_30f0pvvrgcyp4, var1);
   }

   public static int Xqedii_322vzj1tspysh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_7wewo1gaqyw;
   }

   public static int Xqedii_277ogbhbr9ak5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_61zg9zhx38w1;
   }

   public static int Xqedii_2037mq43e5w8z(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_poqqbchv0vwp, var1);
   }

   public static long Xqedii_36v4gigfd9uge(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_4s6z4t0chon, var2);
   }

   public static long Xqedii_2bnmv7chf6mb0(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_yl8v6olp83md;
   }

   public static long Xqedii_2c5bac7d25usk(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3fpygrvh3o0hz;
   }

   public static long Xqedii_25qikxsuwr291(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_hem7tt9cobt0, var2);
   }

   public static String Xqedii_3n2fwyb8fq283(String var0) {
      String var1 = Xqedii_39dwfghfhg6c4.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("1fa3EyMLKNbJu+SxkZjHle9kJkvF5Vf7weepbwRKr9I=");
            int var3 = 1379746421;

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
            String var9 = Xqedii_39dwfghfhg6c4.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1zayn8rr28za4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_23re3l0woaexo() {
   }

   private static int Xqedii_2jev9iymu17xv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1peufexsjdvpz(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
