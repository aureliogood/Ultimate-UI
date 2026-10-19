package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1mokvbf {
   private static final ConcurrentHashMap<String, String> Xqedii_rtsijf3s68ki = new ConcurrentHashMap<>();
   private static volatile int Xqedii_19r3n9ntwab5u = -1906161433;
   private static volatile int Xqedii_3h9c5dax7mgwf = -37610013;
   private static volatile int Xqedii_3taqukf4meprm = 985335322;
   private static volatile int Xqedii_bctmz9dxb4g3 = -1850616066;
   private static volatile long Xqedii_zv2tdaqxsjv = -5504131419729457015L;
   private static volatile long Xqedii_b4613hmoqhpg = -849903439001104299L;
   private static volatile long Xqedii_27bklygevszzx = -673438935280260314L;
   private static volatile long Xqedii_1deol1b7ke2fc = 1847151906660960217L;

   public static int Xqedii_kw29x63ccsf6(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_19r3n9ntwab5u, var1);
   }

   public static int Xqedii_2dqe7lfl0g0f7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3h9c5dax7mgwf;
   }

   public static int Xqedii_2yve7kvt4a5we(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3taqukf4meprm;
   }

   public static int Xqedii_2nymkvm0k9ii(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_bctmz9dxb4g3, var1);
   }

   public static long Xqedii_1bvzm84v3turu(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_zv2tdaqxsjv, var2);
   }

   public static long Xqedii_1u5hl41qonetm(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_b4613hmoqhpg;
   }

   public static long Xqedii_213pezqi85t3w(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_27bklygevszzx;
   }

   public static long Xqedii_2gdgl02of2q1v(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1deol1b7ke2fc, var2);
   }

   public static String Xqedii_8foudi5g2p77(String var0) {
      String var1 = Xqedii_rtsijf3s68ki.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("TOFePNuItj1TUtDSKEDfEMtCC4oqan8Hp+Eqd2shRNU=");
            int var3 = -922986486;

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
            String var9 = Xqedii_rtsijf3s68ki.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_23ogywzy8pcls() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1hpdos30nng8a() {
   }

   private static int Xqedii_2czagz70iansn(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_32xso757e00wb(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
