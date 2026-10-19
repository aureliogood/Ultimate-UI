package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3sqjmtl {
   private static final ConcurrentHashMap<String, String> Xqedii_1a2tpc9jptmln = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3qzrqxc6p5c2g = 436860636;
   private static volatile int Xqedii_290inhhse9gsn = 1266731669;
   private static volatile int Xqedii_50e83l9dghwz = -1919265938;
   private static volatile int Xqedii_2veqn9nev1v9m = -1628680246;
   private static volatile long Xqedii_mx8jan7w6ys7 = -1693605359768446517L;
   private static volatile long Xqedii_3iyl15uv0vtts = -4817873286264452101L;
   private static volatile long Xqedii_2a7jsk5s31ah5 = 4472018639939792816L;
   private static volatile long Xqedii_2n4j5ck2loyum = -904396386800724105L;

   public static int Xqedii_3sscoglcyux3b(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3qzrqxc6p5c2g, var1);
   }

   public static int Xqedii_38p8i4xlo6rpt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_290inhhse9gsn;
   }

   public static int Xqedii_2nld13sr63nqa(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_50e83l9dghwz;
   }

   public static int Xqedii_1e37iw3bllsjt(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2veqn9nev1v9m, var1);
   }

   public static long Xqedii_37sl7817gofr1(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_mx8jan7w6ys7, var2);
   }

   public static long Xqedii_vmtcm5d0piub(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3iyl15uv0vtts;
   }

   public static long Xqedii_mo9k0drt4twz(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2a7jsk5s31ah5;
   }

   public static long Xqedii_35tzwppfniru(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2n4j5ck2loyum, var2);
   }

   public static String Xqedii_oi795k4kv7vh(String var0) {
      String var1 = Xqedii_1a2tpc9jptmln.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/2jtDFjIpouQ9JlzEQCvpnz/ne3Oqd+u051CQt2KBXE=");
            int var3 = -460975858;

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
            String var9 = Xqedii_1a2tpc9jptmln.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3h0tr4omr1f1p() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2t0ziy46xvt64() {
   }

   private static int Xqedii_jiu3ifzyf3aq(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_bn04c7gjye2g(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
