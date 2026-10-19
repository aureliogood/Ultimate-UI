package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2jdp943 {
   private static final ConcurrentHashMap<String, String> Xqedii_3vo74vlz113tm = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3uprbhp1as1hs = -685027083;
   private static volatile int Xqedii_ovpro6sl5q5r = -558630275;
   private static volatile int Xqedii_2sxetjsli1zkg = 2033101433;
   private static volatile int Xqedii_3cl1pfnyqvcqk = -515973898;
   private static volatile long Xqedii_1awxnuatsjlab = 3523647323189452835L;
   private static volatile long Xqedii_bfviudljifdc = 6476704324153800161L;
   private static volatile long Xqedii_32wbxw7cewonm = 4474796562648574095L;
   private static volatile long Xqedii_2e9wuef33l0ms = -4978498312536836222L;

   public static int Xqedii_3j2umk1711nt7(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3uprbhp1as1hs, var1);
   }

   public static int Xqedii_3pkzptkqhqftr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ovpro6sl5q5r;
   }

   public static int Xqedii_mhj954h25llg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2sxetjsli1zkg;
   }

   public static int Xqedii_22ez6d6kn76te(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3cl1pfnyqvcqk, var1);
   }

   public static long Xqedii_1c4a9h8zebdzf(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1awxnuatsjlab, var2);
   }

   public static long Xqedii_x3j1utj78aps(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_bfviudljifdc;
   }

   public static long Xqedii_2drte45gnugq6(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_32wbxw7cewonm;
   }

   public static long Xqedii_eisu56a7l16v(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2e9wuef33l0ms, var2);
   }

   public static String Xqedii_1ndka9udsswl8(String var0) {
      String var1 = Xqedii_3vo74vlz113tm.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("IRL4Y6cDZ1XgQFbyGcG1I8BfYDxtdbQuvV4q6GDvkQ8=");
            int var3 = 167772375;

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
            String var9 = Xqedii_3vo74vlz113tm.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3kn017u33q2h7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1xxz0upywmqtl() {
   }

   private static int Xqedii_368cotxtszvhx(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_ne6ph79tmukx(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
