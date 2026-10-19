package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2pab8ho {
   private static final ConcurrentHashMap<String, String> Xqedii_2w2tk8l0sd8wg = new ConcurrentHashMap<>();
   private static volatile int Xqedii_5ehiicushn00 = 156171336;
   private static volatile int Xqedii_ms5vhfhdhg64 = 2066473067;
   private static volatile int Xqedii_18gnkdf6nces0 = 185554863;
   private static volatile int Xqedii_219gigpgsct3q = -1602879245;
   private static volatile long Xqedii_y2ir25t078gw = -147601552497454225L;
   private static volatile long Xqedii_2remcowpknqip = -2703020110837296225L;
   private static volatile long Xqedii_1y20c10u6xtqd = -9144285714463273359L;
   private static volatile long Xqedii_28megiectaww = -7123995706854524L;

   public static int Xqedii_2rnuq2zbdzcui(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_5ehiicushn00, var1);
   }

   public static int Xqedii_2n6wfh2q27qlr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ms5vhfhdhg64;
   }

   public static int Xqedii_3eyf9xk13z3v1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_18gnkdf6nces0;
   }

   public static int Xqedii_22rlgs07eh9ms(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_219gigpgsct3q, var1);
   }

   public static long Xqedii_2qw6jzmplmqf9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_y2ir25t078gw, var2);
   }

   public static long Xqedii_3kplbrsqalfd8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2remcowpknqip;
   }

   public static long Xqedii_367b50fm2m6a7(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1y20c10u6xtqd;
   }

   public static long Xqedii_2oqpu5lr3r6aw(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_28megiectaww, var2);
   }

   public static String Xqedii_tsyp0lpd84oz(String var0) {
      String var1 = Xqedii_2w2tk8l0sd8wg.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("glXd+20WPKyvhsf3bJJhS7RVvqQUHhULiYpQxFuy7qI=");
            int var3 = 1649824226;

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
            String var9 = Xqedii_2w2tk8l0sd8wg.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_24dybji8gjlwg() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1ufkyjfxzfkrl() {
   }

   private static int Xqedii_16erzkhsmjv7f(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_e9evlu19g095(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
