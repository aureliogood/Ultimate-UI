package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1bdl6f3 {
   private static final ConcurrentHashMap<String, String> Xqedii_3a22uh5v2hjr = new ConcurrentHashMap<>();
   private static volatile int Xqedii_y81x8muocct6 = 1657607401;
   private static volatile int Xqedii_3msa3nxmsaol1 = 1199372535;
   private static volatile int Xqedii_yzdulsptn9qt = -664479545;
   private static volatile int Xqedii_1gfwedqmoqri0 = 2136028841;
   private static volatile long Xqedii_1vl81hwzp5tux = 3061791601416440398L;
   private static volatile long Xqedii_2u2tywiynp1fg = 8212334389548393122L;
   private static volatile long Xqedii_o6nxww5t4d17 = -3605524640043729818L;
   private static volatile long Xqedii_3n2993e3rr6hw = -5270979298392807923L;

   public static int Xqedii_3lhuwsr18sxx8(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_y81x8muocct6, var1);
   }

   public static int Xqedii_75sie4njtcaq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3msa3nxmsaol1;
   }

   public static int Xqedii_a5ttosnl9ckw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_yzdulsptn9qt;
   }

   public static int Xqedii_1979ba4p5auko(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1gfwedqmoqri0, var1);
   }

   public static long Xqedii_2v4zlfcmt8j1p(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1vl81hwzp5tux, var2);
   }

   public static long Xqedii_2p291un5btdmu(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2u2tywiynp1fg;
   }

   public static long Xqedii_1hdjcikks2zeh(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_o6nxww5t4d17;
   }

   public static long Xqedii_2ttcmz7tmn3j(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3n2993e3rr6hw, var2);
   }

   public static String Xqedii_13iwsqckxr9qc(String var0) {
      String var1 = Xqedii_3a22uh5v2hjr.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("hpUTLag1iPUeacFRfIS0wbRg5TQTUL5JfMYbNo9o6hA=");
            int var3 = 866238250;

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
            String var9 = Xqedii_3a22uh5v2hjr.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_35ziz73sgh07c() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1b8ma9pfr1io1() {
   }

   private static int Xqedii_3brxaexqjow45(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1ja3dh12474vs(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
