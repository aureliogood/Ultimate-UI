package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2eulc7d {
   private static final ConcurrentHashMap<String, String> Xqedii_voibxlmbqtag = new ConcurrentHashMap<>();
   private static volatile int Xqedii_x5bojka877de = -717845298;
   private static volatile int Xqedii_sreqhrggau1 = 1697595992;
   private static volatile int Xqedii_f10kijettpy7 = 721486144;
   private static volatile int Xqedii_1n4d6rq8besxi = -397499418;
   private static volatile long Xqedii_iw8wxdmrj4un = -894211719200222930L;
   private static volatile long Xqedii_3m8gy5e3ntuzx = 5727513745212438412L;
   private static volatile long Xqedii_34sculsxds893 = -4931497404069418205L;
   private static volatile long Xqedii_209s039rkfrdp = -4872554334450041698L;

   public static int Xqedii_2n445f1s9eqt(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_x5bojka877de, var1);
   }

   public static int Xqedii_6fj08tpg6xae(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_sreqhrggau1;
   }

   public static int Xqedii_1ac7p8e3q19n0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_f10kijettpy7;
   }

   public static int Xqedii_270d9rdr4tltc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1n4d6rq8besxi, var1);
   }

   public static long Xqedii_1baakk1clpuqp(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_iw8wxdmrj4un, var2);
   }

   public static long Xqedii_1glc2kpdsx21d(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3m8gy5e3ntuzx;
   }

   public static long Xqedii_39p1vnddt3pyq(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_34sculsxds893;
   }

   public static long Xqedii_x2cw7qtqqoqt(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_209s039rkfrdp, var2);
   }

   public static String Xqedii_b6ah6nfwce3s(String var0) {
      String var1 = Xqedii_voibxlmbqtag.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ZpAove3h4B82vplMegVOt5CRXu5rN5EbUKUxZ1f0kjw=");
            int var3 = -2132214456;

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
            String var9 = Xqedii_voibxlmbqtag.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3m2vjp7qs26dh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2r872ka5n6huf() {
   }

   private static int Xqedii_nmidou6kfe8o(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_zjwlmiaa8386(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
