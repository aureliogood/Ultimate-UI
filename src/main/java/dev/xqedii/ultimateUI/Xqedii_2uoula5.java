package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2uoula5 {
   private static final ConcurrentHashMap<String, String> Xqedii_1s0p5pziskp10 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1tipu8v7bt3nk = 1465469129;
   private static volatile int Xqedii_1dnd4isygg8z3 = -1270873406;
   private static volatile int Xqedii_35uhi82th6fle = -354037430;
   private static volatile int Xqedii_37mfee4fj5nli = -695175825;
   private static volatile long Xqedii_1om9l25we4llb = 2875393081971473249L;
   private static volatile long Xqedii_2qa6nerogrj42 = 7839325007043123505L;
   private static volatile long Xqedii_1jcwmfpw6w9a9 = -4229174629992162758L;
   private static volatile long Xqedii_fl5x1feizjx0 = -8334907201673507373L;

   public static int Xqedii_19y25zxqjwkqd(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1tipu8v7bt3nk, var1);
   }

   public static int Xqedii_gj0aghtnog7x(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1dnd4isygg8z3;
   }

   public static int Xqedii_1z2py2ocvyz9t(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_35uhi82th6fle;
   }

   public static int Xqedii_1f9wzb2tac4nu(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_37mfee4fj5nli, var1);
   }

   public static long Xqedii_3egnje7kmqy29(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1om9l25we4llb, var2);
   }

   public static long Xqedii_dqbqf8wiz10h(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2qa6nerogrj42;
   }

   public static long Xqedii_2cv0tyqct5duj(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1jcwmfpw6w9a9;
   }

   public static long Xqedii_2f8w3m0itgxni(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_fl5x1feizjx0, var2);
   }

   public static String Xqedii_3fyhdvwje661q(String var0) {
      String var1 = Xqedii_1s0p5pziskp10.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("2NQhZcRBB+cqmbonicgLOwQLvBlwTrGPUFPT8FjRdtg=");
            int var3 = 1128623535;

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
            String var9 = Xqedii_1s0p5pziskp10.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2kz0vqj0n9nt5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3r87l0zqlk6zp() {
   }

   private static int Xqedii_2fvrtuwti3j4n(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_pvneewkt3exc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
