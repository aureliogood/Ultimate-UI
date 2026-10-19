package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3jn1ord {
   private static final ConcurrentHashMap<String, String> Xqedii_252iy2gqb8w8j = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2rot7um5kif8 = 2133046815;
   private static volatile int Xqedii_2xsewvveo78jt = -353466667;
   private static volatile int Xqedii_ckjlw3j4f0so = 1872875642;
   private static volatile int Xqedii_191gltw1lbs3d = -1964940936;
   private static volatile long Xqedii_2c0ualv9m93yy = -6032538787613132533L;
   private static volatile long Xqedii_30k0hqwjntazt = -3164495089747558272L;
   private static volatile long Xqedii_hbvszbie5tof = 8050438561090077790L;
   private static volatile long Xqedii_2oiyolqqijdp7 = -4887579005182739376L;

   public static int Xqedii_3he6j5fyoldgr(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2rot7um5kif8, var1);
   }

   public static int Xqedii_1d3mxxde81gmb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2xsewvveo78jt;
   }

   public static int Xqedii_1aigmkt4nkzls(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_ckjlw3j4f0so;
   }

   public static int Xqedii_2oqmelq8271vx(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_191gltw1lbs3d, var1);
   }

   public static long Xqedii_m5v2drf3ipxj(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2c0ualv9m93yy, var2);
   }

   public static long Xqedii_3vwyrsqwdcaoo(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_30k0hqwjntazt;
   }

   public static long Xqedii_1x4i2a8h4qb28(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_hbvszbie5tof;
   }

   public static long Xqedii_cur26qoqc3wl(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2oiyolqqijdp7, var2);
   }

   public static String Xqedii_232utfrw0svq7(String var0) {
      String var1 = Xqedii_252iy2gqb8w8j.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ahwegjGo7HcftvPQ4zRCgRJIEVrgr4Ld5s8q9Lk+OLA=");
            int var3 = -332206419;

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
            String var9 = Xqedii_252iy2gqb8w8j.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2yv82hmesd5h7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_q3e680s98vnr() {
   }

   private static int Xqedii_c5x45q7ms1nn(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2izbkfyq4jb3s(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
