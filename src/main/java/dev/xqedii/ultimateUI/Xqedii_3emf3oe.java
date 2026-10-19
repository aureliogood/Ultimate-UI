package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3emf3oe {
   private static final ConcurrentHashMap<String, String> Xqedii_1ho9j9vel3mgt = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3naem4bb2qopp = -1445435910;
   private static volatile int Xqedii_3eq7e1gmgqnr4 = -774022795;
   private static volatile int Xqedii_2sr3fvyjliqri = 1058544868;
   private static volatile int Xqedii_2bieune564wgq = 2024703978;
   private static volatile long Xqedii_1xdp5g03whfw6 = 6922298705868061073L;
   private static volatile long Xqedii_f1bckyk7l7jl = -8506597101791102543L;
   private static volatile long Xqedii_1mzh27nxspxgt = -6619955956066721086L;
   private static volatile long Xqedii_2ndq7irejoqku = -5621856885987107134L;

   public static int Xqedii_31vjlqzdstiyr(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3naem4bb2qopp, var1);
   }

   public static int Xqedii_p0g8hs904u8j(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3eq7e1gmgqnr4;
   }

   public static int Xqedii_2psizmo82kyp2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2sr3fvyjliqri;
   }

   public static int Xqedii_tj2q6qfauv25(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2bieune564wgq, var1);
   }

   public static long Xqedii_1mze1nyf2tu5h(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1xdp5g03whfw6, var2);
   }

   public static long Xqedii_1nlpoy67b77du(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_f1bckyk7l7jl;
   }

   public static long Xqedii_16s7nun3kotr3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1mzh27nxspxgt;
   }

   public static long Xqedii_3u2mgxh0qppug(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2ndq7irejoqku, var2);
   }

   public static String Xqedii_2pf5v4wo3zy1p(String var0) {
      String var1 = Xqedii_1ho9j9vel3mgt.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("dkIV+XRBEIyDaGqK/+6YBu/hIAPgxe7ShdGCx1oIVSo=");
            int var3 = -1821657806;

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
            String var9 = Xqedii_1ho9j9vel3mgt.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_q9gv8nr9sx28() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_wsft5k0v4xbb() {
   }

   private static int Xqedii_2n1c4cd54ybkr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1obs53929hfki(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
