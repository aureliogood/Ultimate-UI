package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3gnspeb {
   private static final ConcurrentHashMap<String, String> Xqedii_cufx9dc1cgul = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2lba0zjyoogiw = 525397899;
   private static volatile int Xqedii_3vtfzxqmse2l8 = -1853712116;
   private static volatile int Xqedii_18i6v1jedt3ra = 974733027;
   private static volatile int Xqedii_18cr9qbupe8p4 = 1478802119;
   private static volatile long Xqedii_308j4jo5mog21 = -9064378017126135616L;
   private static volatile long Xqedii_1piaa0tj35y5n = 6279532592752621671L;
   private static volatile long Xqedii_2m8hgtv23vez5 = -4546402376980545043L;
   private static volatile long Xqedii_2lexd39yiw7vs = -7127829825381320065L;

   public static int Xqedii_3a3dx6wqj7obl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2lba0zjyoogiw, var1);
   }

   public static int Xqedii_1ghhppr4eagsw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3vtfzxqmse2l8;
   }

   public static int Xqedii_1s9ikx6trgugc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_18i6v1jedt3ra;
   }

   public static int Xqedii_868obamky468(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_18cr9qbupe8p4, var1);
   }

   public static long Xqedii_3f3y73ul4xg88(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_308j4jo5mog21, var2);
   }

   public static long Xqedii_wrv952ik5uj9(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1piaa0tj35y5n;
   }

   public static long Xqedii_qrmwzrma18if(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2m8hgtv23vez5;
   }

   public static long Xqedii_34ithj4tpfud0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2lexd39yiw7vs, var2);
   }

   public static String Xqedii_1tlf50kjb5amw(String var0) {
      String var1 = Xqedii_cufx9dc1cgul.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("BYBRN2HFLFUetyiJR6CBuGCOmLu7t+J3vY0yt/H6G0c=");
            int var3 = 1484476021;

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
            String var9 = Xqedii_cufx9dc1cgul.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2jzn67lq2ovva() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_31ip8d9vqvnbz() {
   }

   private static int Xqedii_1xqm5sfszpepj(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_7y8dudshi12g(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
