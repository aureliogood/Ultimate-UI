package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_18gj2ie {
   private static final ConcurrentHashMap<String, String> Xqedii_3cqb3u3upl556 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3cpposxw7sjf3 = 1917394066;
   private static volatile int Xqedii_1x66ou0w15im1 = 1209133618;
   private static volatile int Xqedii_2ltfut2qozbdh = -423623280;
   private static volatile int Xqedii_10f44ly7ra1o = -1327270879;
   private static volatile long Xqedii_20s59bob88v0o = 7243618372430631714L;
   private static volatile long Xqedii_2sidicotofjz6 = 1040711131746012471L;
   private static volatile long Xqedii_38pay5mwsf7ne = 9211290241315153920L;
   private static volatile long Xqedii_ueelv8d7uluy = 5216589963747746477L;

   public static int Xqedii_wqh8srxrgwv4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3cpposxw7sjf3, var1);
   }

   public static int Xqedii_1nyu0tj3pwvbn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1x66ou0w15im1;
   }

   public static int Xqedii_5oumd5smwdmq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2ltfut2qozbdh;
   }

   public static int Xqedii_3d4oxbtemrkkd(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_10f44ly7ra1o, var1);
   }

   public static long Xqedii_29dnstffwpfq0(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_20s59bob88v0o, var2);
   }

   public static long Xqedii_26zhx98cxdmvj(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2sidicotofjz6;
   }

   public static long Xqedii_1mcfz2kj92y0v(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_38pay5mwsf7ne;
   }

   public static long Xqedii_r0kvp1x3sipm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ueelv8d7uluy, var2);
   }

   public static String Xqedii_3imaqazs365tt(String var0) {
      String var1 = Xqedii_3cqb3u3upl556.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("PYJyJ4q3PrK+0rWLnJhn1c8XOZbWb7ntOIY7N8vxHmA=");
            int var3 = 669308801;

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
            String var9 = Xqedii_3cqb3u3upl556.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_323nzg7g5hcdo() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_25z12d52xyw92() {
   }

   private static int Xqedii_20u3w5ujwmg1x(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1vxl7pr633aoa(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
