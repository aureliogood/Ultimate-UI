package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1bs4qep {
   private static final ConcurrentHashMap<String, String> Xqedii_f2s4j9r9a6jv = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1jifhquaq5kxb = 207345692;
   private static volatile int Xqedii_1jeutkdzricyi = 257036514;
   private static volatile int Xqedii_1gt6o93tztggw = -1226815261;
   private static volatile int Xqedii_3epbyt7aswk7p = 1715818233;
   private static volatile long Xqedii_24e07wx7ou2zg = 4803120830482570884L;
   private static volatile long Xqedii_1qp1zrxvoirls = -1342225596628042064L;
   private static volatile long Xqedii_2hytp7hx3tt34 = 105237971667263634L;
   private static volatile long Xqedii_9ut3ngdf1u6x = 1597994924423570005L;

   public static int Xqedii_3ghbv997rach4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1jifhquaq5kxb, var1);
   }

   public static int Xqedii_2r3c514z6jy84(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1jeutkdzricyi;
   }

   public static int Xqedii_3okr76iwk652u(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1gt6o93tztggw;
   }

   public static int Xqedii_1j2hjeq4snuts(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3epbyt7aswk7p, var1);
   }

   public static long Xqedii_3g08rcvl3pzkg(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_24e07wx7ou2zg, var2);
   }

   public static long Xqedii_1x0az3gqftk4c(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1qp1zrxvoirls;
   }

   public static long Xqedii_35t4jnv331o73(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2hytp7hx3tt34;
   }

   public static long Xqedii_3lcgsedaeafsm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_9ut3ngdf1u6x, var2);
   }

   public static String Xqedii_1f0b6ls4duzbp(String var0) {
      String var1 = Xqedii_f2s4j9r9a6jv.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("vGwYSfFTkF2hpZ64kuQjSn+pPzrxqoLlEIAPnxQLVyw=");
            int var3 = -1011568789;

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
            String var9 = Xqedii_f2s4j9r9a6jv.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_f4755ryb779g() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ijdx06mbnt5w() {
   }

   private static int Xqedii_1vq835bpx744h(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_8jclu1h99h10(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
