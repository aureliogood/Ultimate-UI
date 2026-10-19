package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_d6qzzis {
   private static final ConcurrentHashMap<String, String> Xqedii_ko0n5otono8u = new ConcurrentHashMap<>();
   private static volatile int Xqedii_31w8bm8cec147 = 6854020;
   private static volatile int Xqedii_3tia41zpm0my1 = -1259467171;
   private static volatile int Xqedii_cxjhbpv45jxs = -1035942830;
   private static volatile int Xqedii_2vge0nigvgrjl = -1413324274;
   private static volatile long Xqedii_19ptovpekd26c = 2577346659488853807L;
   private static volatile long Xqedii_38afq9i4ivq47 = -8900967660813820068L;
   private static volatile long Xqedii_24ns1gbgw2eci = 5597038577047886875L;
   private static volatile long Xqedii_3n9qy1vto5nv7 = -2729042856647513228L;

   public static int Xqedii_g4dpcuk22bl4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_31w8bm8cec147, var1);
   }

   public static int Xqedii_294scnhjbfkf7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3tia41zpm0my1;
   }

   public static int Xqedii_lzt2807wpsld(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_cxjhbpv45jxs;
   }

   public static int Xqedii_1h64epctuw5ra(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2vge0nigvgrjl, var1);
   }

   public static long Xqedii_p12g9xgec047(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_19ptovpekd26c, var2);
   }

   public static long Xqedii_1ga0ma6digcia(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_38afq9i4ivq47;
   }

   public static long Xqedii_2ek7gfmqeohl(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_24ns1gbgw2eci;
   }

   public static long Xqedii_1vaij8tujy57a(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3n9qy1vto5nv7, var2);
   }

   public static String Xqedii_1c6g1qg9x1qx5(String var0) {
      String var1 = Xqedii_ko0n5otono8u.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("3bd5xNwSAXbwNIQBVi+iUliiMWA8K3om4udsYHecHVE=");
            int var3 = 594938807;

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
            String var9 = Xqedii_ko0n5otono8u.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_74m43sbv0bfk() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1jis2sjaoocdk() {
   }

   private static int Xqedii_2awmflp4v0dbo(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_29dw3dj64sfcg(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
