package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1sferc6 {
   private static final ConcurrentHashMap<String, String> Xqedii_343aaqjbqghi9 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1k5fq409nya1e = -2103594436;
   private static volatile int Xqedii_tm1klje6427y = -2114883128;
   private static volatile int Xqedii_32h6tak9i9yr3 = -1474899048;
   private static volatile int Xqedii_13o195w776m2e = 2127375972;
   private static volatile long Xqedii_1r0cn2k58vsf3 = -8641437683135902516L;
   private static volatile long Xqedii_38rndlcacyo5a = 1918600385870827189L;
   private static volatile long Xqedii_248pm9i3pjmkz = 4908570677723391226L;
   private static volatile long Xqedii_2dedzz7t0pswo = -7598985839038247153L;

   public static int Xqedii_168376gc4etq6(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1k5fq409nya1e, var1);
   }

   public static int Xqedii_2f791tc4pqv9y(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_tm1klje6427y;
   }

   public static int Xqedii_f4e8gk4njqkg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_32h6tak9i9yr3;
   }

   public static int Xqedii_11gats66w6uvt(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_13o195w776m2e, var1);
   }

   public static long Xqedii_3tyc9v1qjhrf3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1r0cn2k58vsf3, var2);
   }

   public static long Xqedii_9revsfl9ntnk(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_38rndlcacyo5a;
   }

   public static long Xqedii_zaqjui4e59aa(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_248pm9i3pjmkz;
   }

   public static long Xqedii_11tohtz09dlz9(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2dedzz7t0pswo, var2);
   }

   public static String Xqedii_3lcpe2x71pjjb(String var0) {
      String var1 = Xqedii_343aaqjbqghi9.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Cb8j7WbTk2E4OBdyW0ke9HIdlUFCAIQdEpgToOAl01Y=");
            int var3 = 185295762;

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
            String var9 = Xqedii_343aaqjbqghi9.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3tywxcyh22cql() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3flhz1gjw2phy() {
   }

   private static int Xqedii_3tmod37fkwe2v(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3ujkmq79g9fsy(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
