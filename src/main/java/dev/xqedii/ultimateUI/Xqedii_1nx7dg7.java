package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1nx7dg7 {
   private static final ConcurrentHashMap<String, String> Xqedii_1ozuoazkj4m6p = new ConcurrentHashMap<>();
   private static volatile int Xqedii_37u420d3c7nv2 = 992672549;
   private static volatile int Xqedii_3hbxfwlfv3oj8 = 377922773;
   private static volatile int Xqedii_38k7kv8a9w6rg = 2050426210;
   private static volatile int Xqedii_t5y2gcnegmkw = 1019710730;
   private static volatile long Xqedii_1ecjml5pg5zw = -6311436659536872507L;
   private static volatile long Xqedii_2yd242xu29w53 = -7428789607435262541L;
   private static volatile long Xqedii_2x0oer5fknau6 = 736175665832499244L;
   private static volatile long Xqedii_304y7w4lw8nbc = -5246685734031491930L;

   public static int Xqedii_19qsgi4hhnw2j(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_37u420d3c7nv2, var1);
   }

   public static int Xqedii_yiq0awjg49vv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3hbxfwlfv3oj8;
   }

   public static int Xqedii_35u6q3ynfe40m(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_38k7kv8a9w6rg;
   }

   public static int Xqedii_3v40ka0i939za(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_t5y2gcnegmkw, var1);
   }

   public static long Xqedii_h004efceoe66(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1ecjml5pg5zw, var2);
   }

   public static long Xqedii_3iksbd5is28hw(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2yd242xu29w53;
   }

   public static long Xqedii_3har33el1aazu(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2x0oer5fknau6;
   }

   public static long Xqedii_2hgo8plxi1qgb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_304y7w4lw8nbc, var2);
   }

   public static String Xqedii_1npm5hl6yhcl1(String var0) {
      String var1 = Xqedii_1ozuoazkj4m6p.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("5b4PTi75IH20aDXOPfR0NRMFYhaq6ikF6stVd2S8YLE=");
            int var3 = -1713841481;

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
            String var9 = Xqedii_1ozuoazkj4m6p.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_38d6ufwj464mv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_nkg8v65xfxbl() {
   }

   private static int Xqedii_3l29ymr48hbta(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1j9vaft2odaca(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
