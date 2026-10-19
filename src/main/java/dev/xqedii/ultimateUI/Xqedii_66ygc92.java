package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_66ygc92 {
   private static final ConcurrentHashMap<String, String> Xqedii_1q9w0osm5yntj = new ConcurrentHashMap<>();
   private static volatile int Xqedii_snvwy219ns3d = -1503918488;
   private static volatile int Xqedii_366k5t03mfiix = -625023886;
   private static volatile int Xqedii_1c26vurw4vl02 = 517509489;
   private static volatile int Xqedii_3mqwuq4e18r2v = 1164029198;
   private static volatile long Xqedii_3gsjs9o8o5lat = -5587833630595804361L;
   private static volatile long Xqedii_30z0u5io0egqk = 7654109136003622224L;
   private static volatile long Xqedii_2dmlqxtcyc37w = 1734465384156845710L;
   private static volatile long Xqedii_3oxx3xqsm0shq = 6913353044074608482L;

   public static int Xqedii_36ldoxqq9w3v2(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_snvwy219ns3d, var1);
   }

   public static int Xqedii_1mqwl1s8nkqvn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_366k5t03mfiix;
   }

   public static int Xqedii_r4a8fwh4wryv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1c26vurw4vl02;
   }

   public static int Xqedii_sub5ela5p1wh(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3mqwuq4e18r2v, var1);
   }

   public static long Xqedii_35xhqubr5h9oi(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3gsjs9o8o5lat, var2);
   }

   public static long Xqedii_38nhvorbbcjdz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_30z0u5io0egqk;
   }

   public static long Xqedii_27dfqtzpod6d(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2dmlqxtcyc37w;
   }

   public static long Xqedii_28848xl487luv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3oxx3xqsm0shq, var2);
   }

   public static String Xqedii_211bpmbisi87m(String var0) {
      String var1 = Xqedii_1q9w0osm5yntj.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("0DNYmqrqJXJKFdM2ccjkMhseGNXINQfQQQY2//X0MiI=");
            int var3 = 1983429892;

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
            String var9 = Xqedii_1q9w0osm5yntj.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3trj38sb743ht() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_308265nd47nxm() {
   }

   private static int Xqedii_3uypqyzl8ier8(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_36gt31bfnk2k4(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
