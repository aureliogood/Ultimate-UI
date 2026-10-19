package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_19n77u6 {
   private static final ConcurrentHashMap<String, String> Xqedii_2vnbkjrp83p29 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3vhe1ci3t60cl = 831670083;
   private static volatile int Xqedii_35fvyche74qp6 = -1855835297;
   private static volatile int Xqedii_2dq6u7r7o93sb = -216644351;
   private static volatile int Xqedii_1qy0xby1hej4s = -1514304651;
   private static volatile long Xqedii_oddirfi86oq = 8652778062252366248L;
   private static volatile long Xqedii_1izgw1p1pbngg = 1538666611571774662L;
   private static volatile long Xqedii_3qktlt0c78msr = -6526641291816283144L;
   private static volatile long Xqedii_18r5q88eirv3p = -3451808867535311339L;

   public static int Xqedii_wke0b3gp9op0(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3vhe1ci3t60cl, var1);
   }

   public static int Xqedii_q4pqhvpzp0gy(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_35fvyche74qp6;
   }

   public static int Xqedii_1it55596v2ysc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2dq6u7r7o93sb;
   }

   public static int Xqedii_3tdsmiq7q4xim(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1qy0xby1hej4s, var1);
   }

   public static long Xqedii_1mpbpf6yu2xq2(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_oddirfi86oq, var2);
   }

   public static long Xqedii_iqgyd6k4296f(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1izgw1p1pbngg;
   }

   public static long Xqedii_15kuh9n35awq2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3qktlt0c78msr;
   }

   public static long Xqedii_242hwyzujmuwu(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_18r5q88eirv3p, var2);
   }

   public static String Xqedii_3a2w6sqgb3wxc(String var0) {
      String var1 = Xqedii_2vnbkjrp83p29.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("21eW67WRoEopqgoJMgqTEtxyMOtok9FWfHKD9KaUdjM=");
            int var3 = -1001566182;

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
            String var9 = Xqedii_2vnbkjrp83p29.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2os9e1yqvdxgk() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3ml0y1oizrbfo() {
   }

   private static int Xqedii_bg4vrciiyva4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2uon5yz9artms(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
