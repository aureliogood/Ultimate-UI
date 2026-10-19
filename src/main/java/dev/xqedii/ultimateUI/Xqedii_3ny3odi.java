package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3ny3odi {
   private static final ConcurrentHashMap<String, String> Xqedii_uxvmz0dftmw = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1ezvfkqggumai = 1096966200;
   private static volatile int Xqedii_20um72i8pdqle = 1940005941;
   private static volatile int Xqedii_32cd8hazpn8rk = 259189258;
   private static volatile int Xqedii_3dg6t1akbf2hw = 1983408392;
   private static volatile long Xqedii_31z78aq0bmyxr = -163996346491915914L;
   private static volatile long Xqedii_12gew7bs5jfhm = 3880903722888619767L;
   private static volatile long Xqedii_brxfow1li4s = -2817157501822863101L;
   private static volatile long Xqedii_1ftky69fdy9q3 = -4487371749482167887L;

   public static int Xqedii_33ejkgmi871gu(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1ezvfkqggumai, var1);
   }

   public static int Xqedii_3qhkkk19totza(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_20um72i8pdqle;
   }

   public static int Xqedii_s4z21f4txccr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_32cd8hazpn8rk;
   }

   public static int Xqedii_2i9mhi5448q06(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3dg6t1akbf2hw, var1);
   }

   public static long Xqedii_1qc72t1d9a85v(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_31z78aq0bmyxr, var2);
   }

   public static long Xqedii_2uw99kr7bxkes(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_12gew7bs5jfhm;
   }

   public static long Xqedii_3m7v9tgno7l4s(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_brxfow1li4s;
   }

   public static long Xqedii_2ae551c7yhw3p(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1ftky69fdy9q3, var2);
   }

   public static String Xqedii_1na7nwsi14edl(String var0) {
      String var1 = Xqedii_uxvmz0dftmw.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("HVUGmZw5Um5IDT8C0ee9w3W8lpsDvnt3VyXrVY3IPUE=");
            int var3 = -1858410503;

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
            String var9 = Xqedii_uxvmz0dftmw.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1ytnv1e270u8v() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2q93rsbjdfs0w() {
   }

   private static int Xqedii_3dl11ez4ounzf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2bl1fv5yufcwq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
