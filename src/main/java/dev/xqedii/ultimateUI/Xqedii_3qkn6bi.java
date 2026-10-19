package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3qkn6bi {
   private static final ConcurrentHashMap<String, String> Xqedii_ovv06h31zh5e = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1pbld8eaqjol5 = -1500983243;
   private static volatile int Xqedii_2qlo2r9s1n1cn = -65314241;
   private static volatile int Xqedii_7ryxq2ouz1ol = 324021491;
   private static volatile int Xqedii_3ssadn0mto4an = 895508720;
   private static volatile long Xqedii_36c9vr5wmg84v = -8177966538658424445L;
   private static volatile long Xqedii_rtp37xp3jcpb = 1728595126665776201L;
   private static volatile long Xqedii_2fo9uwvlegouu = -6898961339198534622L;
   private static volatile long Xqedii_2zqz75vnu703u = -1098860663430669192L;

   public static int Xqedii_2t5225qf9r3v(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1pbld8eaqjol5, var1);
   }

   public static int Xqedii_3nh2fs8lr89wv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2qlo2r9s1n1cn;
   }

   public static int Xqedii_zjz5253byyrs(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_7ryxq2ouz1ol;
   }

   public static int Xqedii_l8bqaq3i5d8e(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3ssadn0mto4an, var1);
   }

   public static long Xqedii_3uqn7ow3w7hoi(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_36c9vr5wmg84v, var2);
   }

   public static long Xqedii_2e1mvevtg7zlk(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_rtp37xp3jcpb;
   }

   public static long Xqedii_26uboti7yz68s(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2fo9uwvlegouu;
   }

   public static long Xqedii_292khb2ep8xsm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2zqz75vnu703u, var2);
   }

   public static String Xqedii_ewni03lgj1rv(String var0) {
      String var1 = Xqedii_ovv06h31zh5e.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("hxi+nF19PRlzxvYthmgZvIYYdkUZ7ljUvPMu8qjPPQM=");
            int var3 = 1432951813;

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
            String var9 = Xqedii_ovv06h31zh5e.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3lbcut2aiv8pj() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1n3hpc771moha() {
   }

   private static int Xqedii_1egq9ln6d7fh0(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_33txq4f6gnl5m(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
