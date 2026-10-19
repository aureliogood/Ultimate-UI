package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_10gtlsk {
   private static final ConcurrentHashMap<String, String> Xqedii_753zk78t4ofu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_6v0f323rjkek = 1184261811;
   private static volatile int Xqedii_155c0f2kxasgp = 1038936949;
   private static volatile int Xqedii_1efbusjna0v0p = 837356981;
   private static volatile int Xqedii_3be8fage2fbin = -1121350247;
   private static volatile long Xqedii_3317csi5qu7ph = 4444750515892723142L;
   private static volatile long Xqedii_o0j5q2maqhse = -180531519453880609L;
   private static volatile long Xqedii_8ufgsa7yh4b7 = 1398388135015972565L;
   private static volatile long Xqedii_115wgw0p8v1ue = -5149447249402688283L;

   public static int Xqedii_3cn5x8p7pgynt(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_6v0f323rjkek, var1);
   }

   public static int Xqedii_1pnnkrghdxm4k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_155c0f2kxasgp;
   }

   public static int Xqedii_2x79tkun8ntt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1efbusjna0v0p;
   }

   public static int Xqedii_3ex0s9k0othba(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3be8fage2fbin, var1);
   }

   public static long Xqedii_1cb2p02j4g544(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3317csi5qu7ph, var2);
   }

   public static long Xqedii_19ozx3tsmonje(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_o0j5q2maqhse;
   }

   public static long Xqedii_1dzmpigs0rgc9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_8ufgsa7yh4b7;
   }

   public static long Xqedii_1ymrvgol6og2d(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_115wgw0p8v1ue, var2);
   }

   public static String Xqedii_302i5pu5xixp6(String var0) {
      String var1 = Xqedii_753zk78t4ofu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("wH8tINv2O1M6AgmZYsWuiFesRe0zfbb1kdNZgzbPZ/U=");
            int var3 = -671309759;

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
            String var9 = Xqedii_753zk78t4ofu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2jgfu3puueozn() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3s6b5yvfgij97() {
   }

   private static int Xqedii_28mhgrgkemwqh(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2uz0bhch1voqf(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
