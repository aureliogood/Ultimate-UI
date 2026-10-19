package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3te89ca {
   private static final ConcurrentHashMap<String, String> Xqedii_32ilvknsfo0b3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1kfykx0xhe08w = 897642354;
   private static volatile int Xqedii_3hx52m84e9jc9 = 1111005199;
   private static volatile int Xqedii_2caf1k9z3hlre = 1788164824;
   private static volatile int Xqedii_zlwjrmncvsf5 = -1609066992;
   private static volatile long Xqedii_qiawh0lwgzzx = 5127738211357215728L;
   private static volatile long Xqedii_12f1slngn3au3 = -7623848843764400299L;
   private static volatile long Xqedii_1ofx8uy3j8jw6 = -7112352907615900106L;
   private static volatile long Xqedii_1tobeout9ivzt = -3439671212228124296L;

   public static int Xqedii_wlthnvnubk8z(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1kfykx0xhe08w, var1);
   }

   public static int Xqedii_py6cl95r1rzg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3hx52m84e9jc9;
   }

   public static int Xqedii_1l0rrcbr5k7l4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2caf1k9z3hlre;
   }

   public static int Xqedii_3brssdb5ozwph(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_zlwjrmncvsf5, var1);
   }

   public static long Xqedii_k31kmgochq91(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_qiawh0lwgzzx, var2);
   }

   public static long Xqedii_2titcw7h4v8f6(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_12f1slngn3au3;
   }

   public static long Xqedii_fejpqrlimrws(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1ofx8uy3j8jw6;
   }

   public static long Xqedii_ysfqr6z4yoha(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1tobeout9ivzt, var2);
   }

   public static String Xqedii_3uattssdovopu(String var0) {
      String var1 = Xqedii_32ilvknsfo0b3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("YEc53RTtJpkwoUr+M0DN/oofnQeJaGK/nz0mNXD3RYk=");
            int var3 = 1603527896;

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
            String var9 = Xqedii_32ilvknsfo0b3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3so4m9xmpbpzr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3evkaxaba8lx() {
   }

   private static int Xqedii_ozycej8h5qj9(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_11xhm4csjqlws(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
