package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2q4bpwh {
   private static final ConcurrentHashMap<String, String> Xqedii_17z82aqdvqbm1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3sej2tl2usew4 = -2139538402;
   private static volatile int Xqedii_yd8vu5zu7yec = 298027626;
   private static volatile int Xqedii_t0tbwghawbwx = -1491746872;
   private static volatile int Xqedii_3tdtj90utrhxo = -748957167;
   private static volatile long Xqedii_26c1wqo9k1bu8 = -1959162980260562642L;
   private static volatile long Xqedii_1axbhhm4kz0w0 = -9063923137148887152L;
   private static volatile long Xqedii_33sul9mp8b8fc = 8212011860798125527L;
   private static volatile long Xqedii_1e1bl5i88prvg = -7878141450429198049L;

   public static int Xqedii_1wcw133ythunu(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3sej2tl2usew4, var1);
   }

   public static int Xqedii_1oigogez54jvf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_yd8vu5zu7yec;
   }

   public static int Xqedii_26q6bauuxn81r(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_t0tbwghawbwx;
   }

   public static int Xqedii_8rs2xisqxlqh(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3tdtj90utrhxo, var1);
   }

   public static long Xqedii_2ttm0d5lmrm65(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_26c1wqo9k1bu8, var2);
   }

   public static long Xqedii_3lkzndw0tez0u(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1axbhhm4kz0w0;
   }

   public static long Xqedii_1jn7aat2dc53m(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_33sul9mp8b8fc;
   }

   public static long Xqedii_m2lhxv3p3dwg(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1e1bl5i88prvg, var2);
   }

   public static String Xqedii_1dxilye2xlpkd(String var0) {
      String var1 = Xqedii_17z82aqdvqbm1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("WWvsqVi28STZ1oL70+pA1K/2GOZ+Bixvm3oHzESInDs=");
            int var3 = -123314163;

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
            String var9 = Xqedii_17z82aqdvqbm1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_38g8kahpnrivr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2pqqab31qyw3p() {
   }

   private static int Xqedii_3idpur9fc0r7p(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_6oy09wkd36to(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
