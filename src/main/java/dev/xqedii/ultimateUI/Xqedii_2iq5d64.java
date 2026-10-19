package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2iq5d64 {
   private static final ConcurrentHashMap<String, String> Xqedii_3kds89wqrnl95 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1vheung4jmkqz = -1403412694;
   private static volatile int Xqedii_226y7744yujf9 = 348044569;
   private static volatile int Xqedii_3ucmaj1s1pzpl = -2107702152;
   private static volatile int Xqedii_2ryoseveed1hq = -1061553442;
   private static volatile long Xqedii_1qh9oom85qyr3 = -1419493122383084834L;
   private static volatile long Xqedii_1yp6q6jim39o4 = -5430240200040536336L;
   private static volatile long Xqedii_p54ye5tod9s8 = -3109554409449600924L;
   private static volatile long Xqedii_3stry152oo5m9 = -3592896881537727545L;

   public static int Xqedii_2f31wg8z3wfep(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1vheung4jmkqz, var1);
   }

   public static int Xqedii_3h3hx1cjq5aid(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_226y7744yujf9;
   }

   public static int Xqedii_1p97rr5q78u6k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3ucmaj1s1pzpl;
   }

   public static int Xqedii_m7n42796auyj(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ryoseveed1hq, var1);
   }

   public static long Xqedii_3bpst4ce5f9nh(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1qh9oom85qyr3, var2);
   }

   public static long Xqedii_3a65zpknq7fhd(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1yp6q6jim39o4;
   }

   public static long Xqedii_34sanv05vqiq8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_p54ye5tod9s8;
   }

   public static long Xqedii_wwf5v410dqnr(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3stry152oo5m9, var2);
   }

   public static String Xqedii_1liyywwl1rsg3(String var0) {
      String var1 = Xqedii_3kds89wqrnl95.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ZpwsxzZ8S0y7RbjVLfHQobZ16i23csM51gQQncxX8l8=");
            int var3 = -1785653467;

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
            String var9 = Xqedii_3kds89wqrnl95.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_p3akaih93ki7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3r07zb1d72yzv() {
   }

   private static int Xqedii_1k3cu04zfo9pv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1l7i2irlfqx0l(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
