package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3vtw31t {
   private static final ConcurrentHashMap<String, String> Xqedii_1fjchmjv4kbo = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3bzuapv6yjy1l = -371737091;
   private static volatile int Xqedii_17e9m2rfugzk9 = -169232038;
   private static volatile int Xqedii_k4jx673z5wzj = 791807509;
   private static volatile int Xqedii_f6tiout5wt2z = -809448829;
   private static volatile long Xqedii_5l9kv1p3in0o = -4966604111565601787L;
   private static volatile long Xqedii_3qslh8fqouvfa = 6135459754179075750L;
   private static volatile long Xqedii_i0h250rgswto = 1442535985036786575L;
   private static volatile long Xqedii_32tpv5j6796ye = 3055300022558160413L;

   public static int Xqedii_14twaixgdbmu8(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3bzuapv6yjy1l, var1);
   }

   public static int Xqedii_2dl4xc5ozdrjd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_17e9m2rfugzk9;
   }

   public static int Xqedii_2qby1q30uxrr4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_k4jx673z5wzj;
   }

   public static int Xqedii_7srh5zsqcuom(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_f6tiout5wt2z, var1);
   }

   public static long Xqedii_6tnhqu4sanjf(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_5l9kv1p3in0o, var2);
   }

   public static long Xqedii_1z24kiyzgyrgp(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3qslh8fqouvfa;
   }

   public static long Xqedii_3msd8bngzghez(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_i0h250rgswto;
   }

   public static long Xqedii_3i5kg5d5exafl(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_32tpv5j6796ye, var2);
   }

   public static String Xqedii_1kfou3pdrqyv3(String var0) {
      String var1 = Xqedii_1fjchmjv4kbo.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("rfitgWsXyuzLakZfJ+RxKJ6imRXGHlGQEZ6ql2gQpiI=");
            int var3 = -747432217;

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
            String var9 = Xqedii_1fjchmjv4kbo.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_lxn10izjmbpi() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_13ndi7ch5s0wa() {
   }

   private static int Xqedii_3g1detmgl47mg(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1m0fe81u93572(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
