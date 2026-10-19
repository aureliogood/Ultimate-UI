package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3nzu75u {
   private static final ConcurrentHashMap<String, String> Xqedii_5oxry96giorx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3qnt9wsfknzhn = 418299800;
   private static volatile int Xqedii_2wdmfxqi0z3b3 = 1381799343;
   private static volatile int Xqedii_faf8o9wt8fvd = 1307431128;
   private static volatile int Xqedii_19q8v0pejth83 = -2079360658;
   private static volatile long Xqedii_22ae6w5gym5ji = -1729959419350564137L;
   private static volatile long Xqedii_116v6zqpjamlt = 8501099749870611847L;
   private static volatile long Xqedii_2q8vnzstsyfat = 191065289287094522L;
   private static volatile long Xqedii_3ngzxy8j9pvl8 = 5771990997786378270L;

   public static int Xqedii_1d0oslopk7fya(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3qnt9wsfknzhn, var1);
   }

   public static int Xqedii_19uwzdyyscz2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2wdmfxqi0z3b3;
   }

   public static int Xqedii_3l1sslo81398g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_faf8o9wt8fvd;
   }

   public static int Xqedii_2w4nonntji2n0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_19q8v0pejth83, var1);
   }

   public static long Xqedii_2jy359cfudgu4(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_22ae6w5gym5ji, var2);
   }

   public static long Xqedii_2rp8345orye88(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_116v6zqpjamlt;
   }

   public static long Xqedii_2ph6cq6rmkts2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2q8vnzstsyfat;
   }

   public static long Xqedii_1smf25cg3cmqj(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3ngzxy8j9pvl8, var2);
   }

   public static String Xqedii_2qz4310q12ugj(String var0) {
      String var1 = Xqedii_5oxry96giorx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("YEDhSKVDuS0pyJSCzqj4NOM6clGbHFpa827YUsZr/PA=");
            int var3 = -1265208877;

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
            String var9 = Xqedii_5oxry96giorx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3dwndbdg0cccx() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_caqbo50rpg9g() {
   }

   private static int Xqedii_pvzl3rofblgt(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1h3h14ivtl3fn(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
