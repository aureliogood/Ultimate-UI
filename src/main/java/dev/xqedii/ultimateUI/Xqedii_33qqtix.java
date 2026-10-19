package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_33qqtix {
   private static final ConcurrentHashMap<String, String> Xqedii_31kshcx7gokcu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1alpm7xa8t7f4 = -401767146;
   private static volatile int Xqedii_3triv718ny0e6 = -282383404;
   private static volatile int Xqedii_3aiibo1m3x76u = -2021009148;
   private static volatile int Xqedii_293twyk05tlp9 = -801815840;
   private static volatile long Xqedii_3346x20qz0ftc = -5593286550890235760L;
   private static volatile long Xqedii_1z0deoecmwweg = -4888397315058198275L;
   private static volatile long Xqedii_2et14ndygcmo1 = -9067537191058209167L;
   private static volatile long Xqedii_1ixlmt0wvkybn = -8393651055690531104L;

   public static int Xqedii_35cb1s9jpipz4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1alpm7xa8t7f4, var1);
   }

   public static int Xqedii_2oovq7xdl54gm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3triv718ny0e6;
   }

   public static int Xqedii_1fviueaienp2p(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3aiibo1m3x76u;
   }

   public static int Xqedii_1e3cohup14f5w(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_293twyk05tlp9, var1);
   }

   public static long Xqedii_1x5w2am1dodhh(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3346x20qz0ftc, var2);
   }

   public static long Xqedii_b5tv867jv56m(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1z0deoecmwweg;
   }

   public static long Xqedii_j87e9ttal7ce(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2et14ndygcmo1;
   }

   public static long Xqedii_l9j5nsrjixoq(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1ixlmt0wvkybn, var2);
   }

   public static String Xqedii_325d6ce9o6kwu(String var0) {
      String var1 = Xqedii_31kshcx7gokcu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("19px1Y4DjkHM3PT2TZ30UmzG3QwUPaZ9wwjYQBKxwZc=");
            int var3 = 578101581;

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
            String var9 = Xqedii_31kshcx7gokcu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_11q4h90a1jswy() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2a7gwr3gk51mk() {
   }

   private static int Xqedii_215hdzjo81sli(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2xkj132lrbu51(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
