package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1pjgc21 {
   private static final ConcurrentHashMap<String, String> Xqedii_1xemmtpjvs26c = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3b7d74ta9ydqq = 1794463119;
   private static volatile int Xqedii_p9mvcr6nfkm6 = -778987859;
   private static volatile int Xqedii_j4qa89zjj15l = 722064079;
   private static volatile int Xqedii_1efv7eev0ru1d = -1860055665;
   private static volatile long Xqedii_214wt7wq7hgw6 = -3435898171400322682L;
   private static volatile long Xqedii_txm3d92tn09u = 2425897342249685902L;
   private static volatile long Xqedii_oe7hf9cvnk5g = 8299095789249117896L;
   private static volatile long Xqedii_fkji13wbl5fb = -7540763783242479288L;

   public static int Xqedii_36fgf2zbm2eh8(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3b7d74ta9ydqq, var1);
   }

   public static int Xqedii_1ygunxlwh4hai(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_p9mvcr6nfkm6;
   }

   public static int Xqedii_1fqlhduu9mjac(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_j4qa89zjj15l;
   }

   public static int Xqedii_2oqyhe97f2tkr(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1efv7eev0ru1d, var1);
   }

   public static long Xqedii_2te53exiw7aod(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_214wt7wq7hgw6, var2);
   }

   public static long Xqedii_1ktfr5wkrzpz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_txm3d92tn09u;
   }

   public static long Xqedii_3aoweh6u2lx0p(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_oe7hf9cvnk5g;
   }

   public static long Xqedii_1v3tjef67vrfv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_fkji13wbl5fb, var2);
   }

   public static String Xqedii_31u6ikdwnjstb(String var0) {
      String var1 = Xqedii_1xemmtpjvs26c.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("qEfgxMwvQ6carAMiA8Ky7dl5Z4Wzf5/kl80WBF3URsE=");
            int var3 = 151520094;

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
            String var9 = Xqedii_1xemmtpjvs26c.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2bacqa8pgg7qj() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_19u58b8tr2asv() {
   }

   private static int Xqedii_3q2xrem1vk3hl(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1z28mtv1cgg92(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
