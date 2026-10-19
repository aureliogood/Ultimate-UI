package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_9dztc8s {
   private static final ConcurrentHashMap<String, String> Xqedii_1bpdkqpirpf5b = new ConcurrentHashMap<>();
   private static volatile int Xqedii_26mnq9ttwy5z5 = -1957903349;
   private static volatile int Xqedii_1lma4mmzv2pxn = -1755870721;
   private static volatile int Xqedii_me0moqet8foh = -461758592;
   private static volatile int Xqedii_26ta6x8un4xcp = -744457656;
   private static volatile long Xqedii_29u25x2smgrkg = 8095410163857387237L;
   private static volatile long Xqedii_1zmjiwxfd208g = -6980952543198322383L;
   private static volatile long Xqedii_3ot5w1f7bc2gj = 161798903734243223L;
   private static volatile long Xqedii_37lrmf8ui17nj = 5369158014052971460L;

   public static int Xqedii_x847wclk7za(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_26mnq9ttwy5z5, var1);
   }

   public static int Xqedii_2i5q18x8yfpcw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1lma4mmzv2pxn;
   }

   public static int Xqedii_3bl0ghjduh23j(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_me0moqet8foh;
   }

   public static int Xqedii_17dscnqrnhi4h(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_26ta6x8un4xcp, var1);
   }

   public static long Xqedii_27m8vwvp84mrz(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_29u25x2smgrkg, var2);
   }

   public static long Xqedii_3g7n1etig6lz2(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1zmjiwxfd208g;
   }

   public static long Xqedii_1drndvpxiudn1(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3ot5w1f7bc2gj;
   }

   public static long Xqedii_23wj2k21q8j09(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_37lrmf8ui17nj, var2);
   }

   public static String Xqedii_451fkyhm49pa(String var0) {
      String var1 = Xqedii_1bpdkqpirpf5b.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("G4pm9FidL6vGwzMMgeyCjb4Ginn1ERN0dtHOsf8vtng=");
            int var3 = -1208078148;

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
            String var9 = Xqedii_1bpdkqpirpf5b.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_pxwmc2tgz73s() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3q71ghbldx3oq() {
   }

   private static int Xqedii_uk8769t7xg37(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2jxavy94wmm9e(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
