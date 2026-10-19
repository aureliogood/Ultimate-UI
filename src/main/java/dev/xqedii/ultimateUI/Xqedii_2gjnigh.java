package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2gjnigh {
   private static final ConcurrentHashMap<String, String> Xqedii_3545frj7rmpnb = new ConcurrentHashMap<>();
   private static volatile int Xqedii_394utm9p2lgoj = -1722189919;
   private static volatile int Xqedii_1bbu9l5arxjxa = 2029069844;
   private static volatile int Xqedii_3m61cylibxecc = -123586815;
   private static volatile int Xqedii_2kvti9yg2pobi = -2018440822;
   private static volatile long Xqedii_3dvh9l7ivm5fe = 775984100030046787L;
   private static volatile long Xqedii_11jvr1poo70ne = 6817603294622357905L;
   private static volatile long Xqedii_1hyng64u0ezzz = -2487083521751228939L;
   private static volatile long Xqedii_gaww82mf2hq3 = 7010233756891076351L;

   public static int Xqedii_7rai1dimrvy9(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_394utm9p2lgoj, var1);
   }

   public static int Xqedii_i61v2ttqqsml(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1bbu9l5arxjxa;
   }

   public static int Xqedii_3463tlxmucfl7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3m61cylibxecc;
   }

   public static int Xqedii_15pkh0rtfrci6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2kvti9yg2pobi, var1);
   }

   public static long Xqedii_wmf1uftuvcu0(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3dvh9l7ivm5fe, var2);
   }

   public static long Xqedii_g05ythxrgo80(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_11jvr1poo70ne;
   }

   public static long Xqedii_1iuo5kkg9rb2u(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1hyng64u0ezzz;
   }

   public static long Xqedii_cm18nhnsxty4(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_gaww82mf2hq3, var2);
   }

   public static String Xqedii_3n0mh5nrwzkp9(String var0) {
      String var1 = Xqedii_3545frj7rmpnb.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ML9+plRksaw2ZCO8R1hjx2ZYAcIRuXNL2Q69IAEa26A=");
            int var3 = 682606814;

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
            String var9 = Xqedii_3545frj7rmpnb.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3hlp8n3ui03fq() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_10adwglvosjjn() {
   }

   private static int Xqedii_dpu9itbeu0yu(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_f2qprfopccdh(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
