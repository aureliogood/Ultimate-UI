package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1vewtxd {
   private static final ConcurrentHashMap<String, String> Xqedii_1oodw19qho1gs = new ConcurrentHashMap<>();
   private static volatile int Xqedii_b7nbwp7v6hh6 = 829595862;
   private static volatile int Xqedii_1h28dljfkvfuw = 913848711;
   private static volatile int Xqedii_1fxvz1ozbs4md = -877443572;
   private static volatile int Xqedii_1wrkl2gwe7uyn = 1823565240;
   private static volatile long Xqedii_1nsho9rjjjd71 = 4674736748586984855L;
   private static volatile long Xqedii_16vovaccuaniq = 3164434305251602149L;
   private static volatile long Xqedii_f7pzaydjw2gb = 8570643059091914639L;
   private static volatile long Xqedii_25is6w9civhbz = -516349288477465823L;

   public static int Xqedii_3qhbt10yp5m3z(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_b7nbwp7v6hh6, var1);
   }

   public static int Xqedii_8jxtb5iezcvk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1h28dljfkvfuw;
   }

   public static int Xqedii_1exs2rg9r59cr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1fxvz1ozbs4md;
   }

   public static int Xqedii_1fj3obsnha5ys(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1wrkl2gwe7uyn, var1);
   }

   public static long Xqedii_1guq6999ulg3z(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1nsho9rjjjd71, var2);
   }

   public static long Xqedii_17e6qnf8w4bw2(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_16vovaccuaniq;
   }

   public static long Xqedii_3mwdkuuz46wk8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_f7pzaydjw2gb;
   }

   public static long Xqedii_3jfu9phamly00(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_25is6w9civhbz, var2);
   }

   public static String Xqedii_ro3wbv2rqgo(String var0) {
      String var1 = Xqedii_1oodw19qho1gs.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("bKyD0edOEXwLtbX7ZcRNCoOLb/a6b9kXiuW4K0T84AE=");
            int var3 = -1212711739;

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
            String var9 = Xqedii_1oodw19qho1gs.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1mf6hqn67ykqi() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2hllwcvkxoajc() {
   }

   private static int Xqedii_2djowhgpp9seq(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1hiscw4ik7r25(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
