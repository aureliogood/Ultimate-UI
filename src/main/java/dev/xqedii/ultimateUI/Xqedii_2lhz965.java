package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2lhz965 {
   private static final ConcurrentHashMap<String, String> Xqedii_2kxf1cf010ypc = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1qhehcpfj96eq = -1337082926;
   private static volatile int Xqedii_2bev5aw11ug83 = 637168548;
   private static volatile int Xqedii_2oukp9j0j7dxf = 1589844913;
   private static volatile int Xqedii_2ujtst5hq599z = -1501870512;
   private static volatile long Xqedii_nteey21pdl8d = -1547240873363669032L;
   private static volatile long Xqedii_1k18yuj6jc0kc = -8175900717546883662L;
   private static volatile long Xqedii_2pzfh5ly1pjm7 = 5672399060132061848L;
   private static volatile long Xqedii_27e01ys3yvp9y = -588925065797576296L;

   public static int Xqedii_1ea8wg7h4h5fc(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1qhehcpfj96eq, var1);
   }

   public static int Xqedii_3di7yqltp23k5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2bev5aw11ug83;
   }

   public static int Xqedii_2nwz4yvbqn288(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2oukp9j0j7dxf;
   }

   public static int Xqedii_2dzqd3ebmit6v(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ujtst5hq599z, var1);
   }

   public static long Xqedii_pn9rdnuzgihw(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_nteey21pdl8d, var2);
   }

   public static long Xqedii_23cul821eou2i(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1k18yuj6jc0kc;
   }

   public static long Xqedii_i1uoaeeobzpn(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2pzfh5ly1pjm7;
   }

   public static long Xqedii_tm2fitrq6ait(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_27e01ys3yvp9y, var2);
   }

   public static String Xqedii_15rr5vrbw2m8r(String var0) {
      String var1 = Xqedii_2kxf1cf010ypc.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("5wP6CqURQqsizxGGyGT9tKNVAUV2yRIywX7ogC3/VEI=");
            int var3 = 1854992910;

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
            String var9 = Xqedii_2kxf1cf010ypc.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2dffz2y96axhs() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1fj7m8ik4ru75() {
   }

   private static int Xqedii_160cpvjrl9bxv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3ijxvrdkxqzov(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
