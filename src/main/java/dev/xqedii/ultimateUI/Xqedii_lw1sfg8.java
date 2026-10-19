package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_lw1sfg8 {
   private static final ConcurrentHashMap<String, String> Xqedii_1l3yamyh271pv = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3u0ixpa5n7xce = 1632899991;
   private static volatile int Xqedii_1cim6smrn2yl6 = -1543546606;
   private static volatile int Xqedii_1z75l1uoabi6h = -262043929;
   private static volatile int Xqedii_icst53jn6tm0 = 596405510;
   private static volatile long Xqedii_syq5p5wekmn = 7147330563491177908L;
   private static volatile long Xqedii_111w8zqt6oksk = -2687369466947362716L;
   private static volatile long Xqedii_2omr97fezt41t = 3715667537177781986L;
   private static volatile long Xqedii_13qp3g2q4yw1n = 2311994297570787160L;

   public static int Xqedii_1i3k9qqjgtt92(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3u0ixpa5n7xce, var1);
   }

   public static int Xqedii_119cdgdskqxtc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1cim6smrn2yl6;
   }

   public static int Xqedii_2gq3ou282uwbb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1z75l1uoabi6h;
   }

   public static int Xqedii_1fh8a34mf6ate(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_icst53jn6tm0, var1);
   }

   public static long Xqedii_3lqeezoh7h0zk(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_syq5p5wekmn, var2);
   }

   public static long Xqedii_1o7sjkr31srxt(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_111w8zqt6oksk;
   }

   public static long Xqedii_1mezpgoayztla(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2omr97fezt41t;
   }

   public static long Xqedii_rcy0ri3s6sxp(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_13qp3g2q4yw1n, var2);
   }

   public static String Xqedii_1pd46z5d2zvnx(String var0) {
      String var1 = Xqedii_1l3yamyh271pv.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("eqLXRWQ0K1qvneaWV0PksGaVXI+WAzBOaN7mGvPaL34=");
            int var3 = 1819059206;

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
            String var9 = Xqedii_1l3yamyh271pv.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3krnn19bn1l1u() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_d0uduiib097v() {
   }

   private static int Xqedii_19v1xcz9bscsh(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_dqnnc0pnis5j(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
