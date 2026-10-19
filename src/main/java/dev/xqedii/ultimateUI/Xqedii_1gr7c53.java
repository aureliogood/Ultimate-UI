package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1gr7c53 {
   private static final ConcurrentHashMap<String, String> Xqedii_3vogl2nfz6h6c = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3uv36imzxjyf0 = -1888285996;
   private static volatile int Xqedii_3uiuahy5wpxgx = 2089689123;
   private static volatile int Xqedii_2kvdrctjq1x3r = 296988183;
   private static volatile int Xqedii_1wrn90ob190mf = 155612305;
   private static volatile long Xqedii_2cm95a5wsulg7 = -1166878601768171189L;
   private static volatile long Xqedii_2555ig2mqlfti = -2109040158702588306L;
   private static volatile long Xqedii_1rviq4rdm5gp9 = 8839754001186264427L;
   private static volatile long Xqedii_2fvc153ga6fbr = 1329928374244636504L;

   public static int Xqedii_1cc9aewn9aai1(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3uv36imzxjyf0, var1);
   }

   public static int Xqedii_3a2tccftbu5fj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3uiuahy5wpxgx;
   }

   public static int Xqedii_14jjuozelu0id(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2kvdrctjq1x3r;
   }

   public static int Xqedii_3ofunpe0al7zu(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1wrn90ob190mf, var1);
   }

   public static long Xqedii_2vgnu77o90eos(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2cm95a5wsulg7, var2);
   }

   public static long Xqedii_1uw5g080mxooi(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2555ig2mqlfti;
   }

   public static long Xqedii_3qsdz3nvp269r(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1rviq4rdm5gp9;
   }

   public static long Xqedii_aubyym1asbxc(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2fvc153ga6fbr, var2);
   }

   public static String Xqedii_1xdvycibax0jg(String var0) {
      String var1 = Xqedii_3vogl2nfz6h6c.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("DwQ2j0C57KdCsJ14nduCfN5MPOuIFjsXEjTOY369DIQ=");
            int var3 = -1541441470;

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
            String var9 = Xqedii_3vogl2nfz6h6c.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2qvuietwsa61n() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3sjblcxr2zmqs() {
   }

   private static int Xqedii_2f4kss30t8ic1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3mt5v06n3r5m1(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
