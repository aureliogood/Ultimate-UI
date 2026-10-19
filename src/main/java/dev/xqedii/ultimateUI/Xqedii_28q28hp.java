package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_28q28hp {
   private static final ConcurrentHashMap<String, String> Xqedii_1tb46d1gxgdwr = new ConcurrentHashMap<>();
   private static volatile int Xqedii_ty6bcgkvp0ue = -1043826789;
   private static volatile int Xqedii_6uhccwvjfea8 = 1376391961;
   private static volatile int Xqedii_1mz4uy5433pne = -1578963743;
   private static volatile int Xqedii_2ue1e6axseaqh = -140920483;
   private static volatile long Xqedii_s2m5xcie64at = -1370854384629926074L;
   private static volatile long Xqedii_glbjqqaw0li5 = -2193661658260711325L;
   private static volatile long Xqedii_2w047iletdrd5 = 8777907870986702330L;
   private static volatile long Xqedii_3vy163fe4zl60 = 3521648394666537699L;

   public static int Xqedii_235yo9epcuwy5(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_ty6bcgkvp0ue, var1);
   }

   public static int Xqedii_2ewkzj79qhqgi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_6uhccwvjfea8;
   }

   public static int Xqedii_vdv853ljawkg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1mz4uy5433pne;
   }

   public static int Xqedii_zzs110w1d76b(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ue1e6axseaqh, var1);
   }

   public static long Xqedii_1wfu8m2hiq4as(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_s2m5xcie64at, var2);
   }

   public static long Xqedii_217easl21jmen(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_glbjqqaw0li5;
   }

   public static long Xqedii_3uptc4rsfjn9g(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2w047iletdrd5;
   }

   public static long Xqedii_10copar08jd5o(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3vy163fe4zl60, var2);
   }

   public static String Xqedii_25u9qqy4bb037(String var0) {
      String var1 = Xqedii_1tb46d1gxgdwr.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("R1esFJq9AtK34U9fr8VZN4Vw1JuMulmy63oiTC20hBc=");
            int var3 = -118970169;

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
            String var9 = Xqedii_1tb46d1gxgdwr.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_25o247geuri3s() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1kor49lp5vxge() {
   }

   private static int Xqedii_3aglxu1zi5j3i(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2ks8rl4afvnt0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
