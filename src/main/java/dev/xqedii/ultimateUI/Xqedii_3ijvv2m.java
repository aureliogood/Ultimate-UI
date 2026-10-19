package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3ijvv2m {
   private static final ConcurrentHashMap<String, String> Xqedii_1qo84lka2e5vl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_ovnbdbnc5n3i = 2064819347;
   private static volatile int Xqedii_3ix5ze0oz6pdr = 1085794401;
   private static volatile int Xqedii_3vuvlanuq9e91 = 1786191956;
   private static volatile int Xqedii_1lykm3hry137x = 827235602;
   private static volatile long Xqedii_22uyts40zxn35 = -122636239560266351L;
   private static volatile long Xqedii_3gwvdw3nbxpry = -5406515763124706678L;
   private static volatile long Xqedii_3rs32ypif1iuy = 4194505999441621700L;
   private static volatile long Xqedii_35a2fi3zna6ng = 8148165557279555721L;

   public static int Xqedii_2kv3fhbhdeyx3(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_ovnbdbnc5n3i, var1);
   }

   public static int Xqedii_9gigmfcmmp5x(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3ix5ze0oz6pdr;
   }

   public static int Xqedii_1dcn2qyez23qn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3vuvlanuq9e91;
   }

   public static int Xqedii_2z0vf3dyxw8jr(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1lykm3hry137x, var1);
   }

   public static long Xqedii_13j1jiq7orbz3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_22uyts40zxn35, var2);
   }

   public static long Xqedii_2as9v7rrwd6i9(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3gwvdw3nbxpry;
   }

   public static long Xqedii_ytvi8wv7p2hd(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3rs32ypif1iuy;
   }

   public static long Xqedii_2nbynrgfgoqsh(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_35a2fi3zna6ng, var2);
   }

   public static String Xqedii_28xvytymv1sgu(String var0) {
      String var1 = Xqedii_1qo84lka2e5vl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("E9LEu5OPY6vrqNb/s0U2XzvujTFPi8HtdT5X466n/Js=");
            int var3 = -1985329777;

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
            String var9 = Xqedii_1qo84lka2e5vl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1qqfria6alynb() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1dphhxew8zpyo() {
   }

   private static int Xqedii_fnxiwju7pd88(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_21ayi5oo03toc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
