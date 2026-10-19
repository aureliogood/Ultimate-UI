package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1gryrhw {
   private static final ConcurrentHashMap<String, String> Xqedii_onfpzghby2n1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_frt9tl4l9fi4 = -1662451257;
   private static volatile int Xqedii_1r4t74cybf9ou = 1699412803;
   private static volatile int Xqedii_2fx6ttqi3vg7v = -2071973008;
   private static volatile int Xqedii_lbvdo029uxaa = -1203770645;
   private static volatile long Xqedii_1p5ybuznh301r = 3618631666017280134L;
   private static volatile long Xqedii_2cgk5dlbhv2eo = -7991702104572453408L;
   private static volatile long Xqedii_1eiu4mah924kq = -6863134667955264276L;
   private static volatile long Xqedii_aafynhrmnm5i = 4512820408481345827L;

   public static int Xqedii_29328aje13k7b(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_frt9tl4l9fi4, var1);
   }

   public static int Xqedii_221q1evxowsxf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1r4t74cybf9ou;
   }

   public static int Xqedii_259ldjk2o2pse(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2fx6ttqi3vg7v;
   }

   public static int Xqedii_2gjb9flxeaah1(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_lbvdo029uxaa, var1);
   }

   public static long Xqedii_3na9xzh18lsvy(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1p5ybuznh301r, var2);
   }

   public static long Xqedii_2a8penmzb3osa(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2cgk5dlbhv2eo;
   }

   public static long Xqedii_2o14tfl1vqtc9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1eiu4mah924kq;
   }

   public static long Xqedii_26zz0vzoi15yf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_aafynhrmnm5i, var2);
   }

   public static String Xqedii_1ls6n5izs316s(String var0) {
      String var1 = Xqedii_onfpzghby2n1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("MDldwdKoZzpb9YJHUeLEqKGmgUdpES3hnhVGqKe03Bo=");
            int var3 = 643262211;

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
            String var9 = Xqedii_onfpzghby2n1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1jiaco4kgsjet() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_qlw25hgrlgje() {
   }

   private static int Xqedii_hfwqk26h5y03(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3tiyqfv4p7ynw(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
