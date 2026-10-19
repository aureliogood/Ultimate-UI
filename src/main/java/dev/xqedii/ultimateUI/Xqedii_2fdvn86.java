package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2fdvn86 {
   private static final ConcurrentHashMap<String, String> Xqedii_1kslv4mcaiw97 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3l0zihydi8ofg = 1251667534;
   private static volatile int Xqedii_26uowonorfpe = -1481081179;
   private static volatile int Xqedii_3gpwfp76lufq3 = -304095523;
   private static volatile int Xqedii_20xqn1dq1wi4m = 943636101;
   private static volatile long Xqedii_i6t0ig36fhc0 = -5566100243548822459L;
   private static volatile long Xqedii_4ychoe9afuup = -6639660589855743814L;
   private static volatile long Xqedii_31qk60tqm6wa7 = -1962750063182883555L;
   private static volatile long Xqedii_3ndm7piarrtei = -2210786243161704028L;

   public static int Xqedii_9xrkmo621cak(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3l0zihydi8ofg, var1);
   }

   public static int Xqedii_3uq80yqn7whp2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_26uowonorfpe;
   }

   public static int Xqedii_e0rwwtmdf00(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3gpwfp76lufq3;
   }

   public static int Xqedii_3qqpkduxad2n0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_20xqn1dq1wi4m, var1);
   }

   public static long Xqedii_38xfwbolrhk81(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_i6t0ig36fhc0, var2);
   }

   public static long Xqedii_2u4ey6dral3bc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_4ychoe9afuup;
   }

   public static long Xqedii_3mz5uoj906zcq(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_31qk60tqm6wa7;
   }

   public static long Xqedii_3jidbl21bmxsm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3ndm7piarrtei, var2);
   }

   public static String Xqedii_nes6jgy0yask(String var0) {
      String var1 = Xqedii_1kslv4mcaiw97.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("KHTd4H1NvUlQ+dzcTO7agS1t86LdqY9a9Rwo2rdABZo=");
            int var3 = -1387517831;

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
            String var9 = Xqedii_1kslv4mcaiw97.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_15zw03famzzd1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_21z50bt08dpy7() {
   }

   private static int Xqedii_3s3ctzyjv2rbg(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3k139eqa101p1(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
