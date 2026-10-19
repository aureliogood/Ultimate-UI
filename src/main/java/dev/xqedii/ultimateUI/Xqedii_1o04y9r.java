package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1o04y9r {
   private static final ConcurrentHashMap<String, String> Xqedii_3kja5cog2w2bq = new ConcurrentHashMap<>();
   private static volatile int Xqedii_21jlzbwmgjavy = 1270716713;
   private static volatile int Xqedii_381xo078irptb = -1210169630;
   private static volatile int Xqedii_3rarlppyh5232 = -902616236;
   private static volatile int Xqedii_2o335r88zjg2k = 1879468479;
   private static volatile long Xqedii_j52p5114omo3 = 8862468850980794940L;
   private static volatile long Xqedii_1q51fbefumg7x = -1069054344596230196L;
   private static volatile long Xqedii_18lwrustv0owj = -6629143890120726715L;
   private static volatile long Xqedii_cr2fsja0sfy0 = -4465865351046332068L;

   public static int Xqedii_32g4zhfwqnbky(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_21jlzbwmgjavy, var1);
   }

   public static int Xqedii_35jgh6qcvbdo7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_381xo078irptb;
   }

   public static int Xqedii_1ysjb66pjlat0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3rarlppyh5232;
   }

   public static int Xqedii_hdfdv4sfnsuz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2o335r88zjg2k, var1);
   }

   public static long Xqedii_d5jr61t25mwm(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_j52p5114omo3, var2);
   }

   public static long Xqedii_27uyrqfad9y59(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1q51fbefumg7x;
   }

   public static long Xqedii_131asb15722yx(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_18lwrustv0owj;
   }

   public static long Xqedii_1qork8vqjpugi(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_cr2fsja0sfy0, var2);
   }

   public static String Xqedii_1sq5vrcd12pdo(String var0) {
      String var1 = Xqedii_3kja5cog2w2bq.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("NyOlKZnnDasqH4An2W6HxY/Uy25UQMyVb8rCzFJ5Ctc=");
            int var3 = 1208534063;

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
            String var9 = Xqedii_3kja5cog2w2bq.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_mictoui7gcb0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1s11qr76fxare() {
   }

   private static int Xqedii_1nbxqfnhloho0(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3ewdcnz7doh4z(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
