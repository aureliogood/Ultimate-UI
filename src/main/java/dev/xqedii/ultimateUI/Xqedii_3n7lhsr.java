package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3n7lhsr {
   private static final ConcurrentHashMap<String, String> Xqedii_23ceqkcbugedj = new ConcurrentHashMap<>();
   private static volatile int Xqedii_thg5awdlolp3 = 2052376612;
   private static volatile int Xqedii_32wbdzzb7ns70 = 1086305587;
   private static volatile int Xqedii_2addumjmp9c5x = 973983138;
   private static volatile int Xqedii_32c6oapizwhjj = 432411240;
   private static volatile long Xqedii_26g37x2xquxsw = 5154372210240641265L;
   private static volatile long Xqedii_2umdb5jis8sr4 = 6866896725418925291L;
   private static volatile long Xqedii_2yxdrv9hgqw5d = 3875508209988478999L;
   private static volatile long Xqedii_umj6gdy0m2le = 5803754031279645269L;

   public static int Xqedii_2bosap79j8ijn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_thg5awdlolp3, var1);
   }

   public static int Xqedii_lqlhrpw2d9ju(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_32wbdzzb7ns70;
   }

   public static int Xqedii_1cgzrce52bu0z(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2addumjmp9c5x;
   }

   public static int Xqedii_173p3v15796sc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_32c6oapizwhjj, var1);
   }

   public static long Xqedii_3qyedxbqrgoqn(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_26g37x2xquxsw, var2);
   }

   public static long Xqedii_uwy06h1ltt70(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2umdb5jis8sr4;
   }

   public static long Xqedii_1jcbvriimemru(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2yxdrv9hgqw5d;
   }

   public static long Xqedii_2fu5y0vev09xp(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_umj6gdy0m2le, var2);
   }

   public static String Xqedii_34ued7wz2dz8v(String var0) {
      String var1 = Xqedii_23ceqkcbugedj.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("sFG97AcO2YG9NE/pdpfsjvd9i40xz3Ak6VE1hVe9Gw4=");
            int var3 = 625708104;

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
            String var9 = Xqedii_23ceqkcbugedj.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_18mtoyqcsviop() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1jowf43st2tt5() {
   }

   private static int Xqedii_1ts93035jj7el(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_po6yb8pm87xs(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
