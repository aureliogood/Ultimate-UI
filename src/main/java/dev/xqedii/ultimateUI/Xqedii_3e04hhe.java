package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3e04hhe {
   private static final ConcurrentHashMap<String, String> Xqedii_3jxloudww8wni = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3vnc1attzjkev = -586745884;
   private static volatile int Xqedii_1ledoqz4ng3zv = -1719295803;
   private static volatile int Xqedii_2ii2vey4zsz9a = -2137624524;
   private static volatile int Xqedii_7cqxn7txyjjh = -2121478125;
   private static volatile long Xqedii_3m8tpl78kh6e9 = -3157699734883444463L;
   private static volatile long Xqedii_yj67a3ffn5kg = -5598142411349836376L;
   private static volatile long Xqedii_3gd0lugqvfgm0 = -4391405684960743681L;
   private static volatile long Xqedii_3l9xxgx1ho7mg = 4340130401997630340L;

   public static int Xqedii_2tnx9l6pwbr51(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3vnc1attzjkev, var1);
   }

   public static int Xqedii_a3ehdfmu7j29(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1ledoqz4ng3zv;
   }

   public static int Xqedii_28sstklcru6e(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2ii2vey4zsz9a;
   }

   public static int Xqedii_2s5zer5b3rucl(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_7cqxn7txyjjh, var1);
   }

   public static long Xqedii_1erphb9dz5bzd(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3m8tpl78kh6e9, var2);
   }

   public static long Xqedii_351faizvw48nd(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_yj67a3ffn5kg;
   }

   public static long Xqedii_15lp8ywlsdlz8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3gd0lugqvfgm0;
   }

   public static long Xqedii_2s1ogqr026lxd(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3l9xxgx1ho7mg, var2);
   }

   public static String Xqedii_2lds6zar20ozv(String var0) {
      String var1 = Xqedii_3jxloudww8wni.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("6CZ7FPSWFgZ797QiWPGEvUrG64PBXta3cYAEQlNGRzw=");
            int var3 = 981210534;

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
            String var9 = Xqedii_3jxloudww8wni.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_ntk048sr0gmj() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_qzlglj086vmn() {
   }

   private static int Xqedii_3v61vgyl59cp4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_skhk7xat7fd0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
