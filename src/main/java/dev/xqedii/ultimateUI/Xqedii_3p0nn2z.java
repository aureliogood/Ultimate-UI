package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3p0nn2z {
   private static final ConcurrentHashMap<String, String> Xqedii_2q1v87bjzwonu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1whic003ibuqo = -1554406059;
   private static volatile int Xqedii_2jmwq8mbe6dzo = -2053063271;
   private static volatile int Xqedii_3cg1s7aknx05s = -1626683047;
   private static volatile int Xqedii_1xfxu3c3lalvf = 634808467;
   private static volatile long Xqedii_1h82am455ezw3 = 8101701401284792236L;
   private static volatile long Xqedii_2i2nn2g3nw0ig = 640993963344414325L;
   private static volatile long Xqedii_1wgvi0m2zqbk5 = -7406785558249483693L;
   private static volatile long Xqedii_27efvsrtfycl8 = 1049989707841391421L;

   public static int Xqedii_s37nhqcye03(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1whic003ibuqo, var1);
   }

   public static int Xqedii_2amc0dm3hzem6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2jmwq8mbe6dzo;
   }

   public static int Xqedii_24jr72rfnablp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3cg1s7aknx05s;
   }

   public static int Xqedii_hgg7b6yvbdok(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1xfxu3c3lalvf, var1);
   }

   public static long Xqedii_2au0e63ypllit(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1h82am455ezw3, var2);
   }

   public static long Xqedii_3hnjuancmpris(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2i2nn2g3nw0ig;
   }

   public static long Xqedii_12d9qlvky217j(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1wgvi0m2zqbk5;
   }

   public static long Xqedii_3mvtdzs34dr71(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_27efvsrtfycl8, var2);
   }

   public static String Xqedii_22jpqhw6st9zv(String var0) {
      String var1 = Xqedii_2q1v87bjzwonu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("FtlvTlQWr6eJbBgWu7lCZVZqOlB2szOGQZNS96R8VRE=");
            int var3 = -1981455176;

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
            String var9 = Xqedii_2q1v87bjzwonu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3906ev6dte8k3() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2wnuiofotpspy() {
   }

   private static int Xqedii_26tx2cy2g9exb(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2wytbdsmk72cs(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
