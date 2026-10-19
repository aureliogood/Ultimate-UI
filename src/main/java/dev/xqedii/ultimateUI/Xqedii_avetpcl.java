package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_avetpcl {
   private static final ConcurrentHashMap<String, String> Xqedii_2bcrnihfa1kxx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1otde3ruvn74y = 1061104062;
   private static volatile int Xqedii_2fmla6ieb6425 = -566212327;
   private static volatile int Xqedii_1s4ev9ebdvyp9 = -2086815696;
   private static volatile int Xqedii_1nu0hhft6fhf0 = 254049033;
   private static volatile long Xqedii_1ulih1q97n3m5 = 5722396762455034935L;
   private static volatile long Xqedii_2e4yh2inoqccz = -8219404385695673414L;
   private static volatile long Xqedii_2g751hethuowd = 896010645744977319L;
   private static volatile long Xqedii_1cdabzvu9464g = -1353947884713788932L;

   public static int Xqedii_1nft49v64ahqm(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1otde3ruvn74y, var1);
   }

   public static int Xqedii_14vdwg16cw7y3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2fmla6ieb6425;
   }

   public static int Xqedii_w7a77a2293nm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1s4ev9ebdvyp9;
   }

   public static int Xqedii_24939j6uod12o(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1nu0hhft6fhf0, var1);
   }

   public static long Xqedii_27yc3x2zp71z4(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1ulih1q97n3m5, var2);
   }

   public static long Xqedii_om5hbwjjeshn(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2e4yh2inoqccz;
   }

   public static long Xqedii_38sbtjw43iwcc(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2g751hethuowd;
   }

   public static long Xqedii_1xwvkzxos6q9g(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1cdabzvu9464g, var2);
   }

   public static String Xqedii_1exqn3hkwena8(String var0) {
      String var1 = Xqedii_2bcrnihfa1kxx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("8/WnhNMbMnrLAQCd/POUoygc7wC8iIqwbgeZ9i+gDvM=");
            int var3 = 750373229;

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
            String var9 = Xqedii_2bcrnihfa1kxx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_7q1sj2orr9l8() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_28hqikue61jtr() {
   }

   private static int Xqedii_2mrzc6x3r87y6(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_19as3f22roqoa(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
