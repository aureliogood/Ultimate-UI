package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1kdhowb {
   private static final ConcurrentHashMap<String, String> Xqedii_2dey44lnk6oeq = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1kw306ckkv27p = 615076179;
   private static volatile int Xqedii_csblewfe3pek = -646343456;
   private static volatile int Xqedii_1wb3txkfsskis = 291419344;
   private static volatile int Xqedii_hb24gmqtjouc = -1562967571;
   private static volatile long Xqedii_161qak2tkfduk = -7849390086090464837L;
   private static volatile long Xqedii_2qoo021v0sksj = 7689185773193741129L;
   private static volatile long Xqedii_y9zyohteqcvc = 1148185014104044378L;
   private static volatile long Xqedii_2td5169eioubj = -2524720742128235313L;

   public static int Xqedii_1gnn294hjufix(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1kw306ckkv27p, var1);
   }

   public static int Xqedii_26qjky05c0fhk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_csblewfe3pek;
   }

   public static int Xqedii_3bkj8mnb4u1ow(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1wb3txkfsskis;
   }

   public static int Xqedii_2forwglsu15d1(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_hb24gmqtjouc, var1);
   }

   public static long Xqedii_2qfsaklgx0y6u(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_161qak2tkfduk, var2);
   }

   public static long Xqedii_2jwuktqirg900(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2qoo021v0sksj;
   }

   public static long Xqedii_1popfpqo9akxo(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_y9zyohteqcvc;
   }

   public static long Xqedii_26ch102detlic(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2td5169eioubj, var2);
   }

   public static String Xqedii_34p4xbk0b6tab(String var0) {
      String var1 = Xqedii_2dey44lnk6oeq.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("LO2s4Xs9wYfORFXjTyRiCgeVg4UzRjDHsNKbaXBYj+4=");
            int var3 = -1423217287;

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
            String var9 = Xqedii_2dey44lnk6oeq.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_llqxt0ay3uvi() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3ohmo17f8qtma() {
   }

   private static int Xqedii_cxmm965vrh7m(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_il24tzgbe2ax(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
