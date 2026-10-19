package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2t9igks {
   private static final ConcurrentHashMap<String, String> Xqedii_d9vay3vbew6n = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1hecp5xfv572t = 474111984;
   private static volatile int Xqedii_272qhgb1uo77l = 541536519;
   private static volatile int Xqedii_2pgzg7ij2dg7n = -127015347;
   private static volatile int Xqedii_2xh86kvc83kef = 1180278341;
   private static volatile long Xqedii_16xtaaticcts = -4702451484808225544L;
   private static volatile long Xqedii_yp5tzaj9hyoy = 7846874283394418918L;
   private static volatile long Xqedii_kh49gvwur1e8 = 754912888452935882L;
   private static volatile long Xqedii_zlr5bpvwf27c = -5395515665232679826L;

   public static int Xqedii_3r3xl5ag0bu26(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1hecp5xfv572t, var1);
   }

   public static int Xqedii_42bvtdpmt4vp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_272qhgb1uo77l;
   }

   public static int Xqedii_2mgngna4gh25c(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2pgzg7ij2dg7n;
   }

   public static int Xqedii_332oacil0nf1n(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2xh86kvc83kef, var1);
   }

   public static long Xqedii_2alv4la87qsfe(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_16xtaaticcts, var2);
   }

   public static long Xqedii_1n5kzeiydx5cg(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_yp5tzaj9hyoy;
   }

   public static long Xqedii_1lmkm54ylqsov(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_kh49gvwur1e8;
   }

   public static long Xqedii_3qgvigubcm609(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_zlr5bpvwf27c, var2);
   }

   public static String Xqedii_1167584vla8jh(String var0) {
      String var1 = Xqedii_d9vay3vbew6n.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("a5HlHlvPrJWeD53XJBlMYecOajWEC9xKVng4DCeAd9w=");
            int var3 = -1971084463;

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
            String var9 = Xqedii_d9vay3vbew6n.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_8almzlx7s4e1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1m6rkfs2n3wny() {
   }

   private static int Xqedii_3226k1c5ffymq(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3o1lirxwqn4hg(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
