package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_39s0jcp {
   private static final ConcurrentHashMap<String, String> Xqedii_1f309fjuexbkw = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3ibg0na1v4qsj = 461235580;
   private static volatile int Xqedii_2zf3wjmjvba0b = -250590950;
   private static volatile int Xqedii_15ezi7edxs5gq = -226687148;
   private static volatile int Xqedii_346zqppvpi77o = 863201881;
   private static volatile long Xqedii_33a5lyds2w5py = 3364074097787076294L;
   private static volatile long Xqedii_253jvmcsxxpmj = -5652831948384503925L;
   private static volatile long Xqedii_2uh2n3whh3fpg = -5793037789464356370L;
   private static volatile long Xqedii_3skqxk6e9jl19 = -1056730335009814158L;

   public static int Xqedii_3kysfdmlxkrqa(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3ibg0na1v4qsj, var1);
   }

   public static int Xqedii_iu7kho9dlfo(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2zf3wjmjvba0b;
   }

   public static int Xqedii_3u6olhd839sf6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_15ezi7edxs5gq;
   }

   public static int Xqedii_2yghbfk0kl37(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_346zqppvpi77o, var1);
   }

   public static long Xqedii_ovnolydoxq07(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_33a5lyds2w5py, var2);
   }

   public static long Xqedii_2l1guj4wa0wxx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_253jvmcsxxpmj;
   }

   public static long Xqedii_2rhxvvc4rid0f(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2uh2n3whh3fpg;
   }

   public static long Xqedii_3ht79vi7col4u(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3skqxk6e9jl19, var2);
   }

   public static String Xqedii_1vufkfehlu1cr(String var0) {
      String var1 = Xqedii_1f309fjuexbkw.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("mBJRuuyWbdtW9ASZkS6ehcXQAVqg/GGPHrINcDtekq0=");
            int var3 = 181448662;

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
            String var9 = Xqedii_1f309fjuexbkw.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_33ntykuqo1ccg() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2e1vcnerr45up() {
   }

   private static int Xqedii_1z6xdfww1h6ka(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3tump8b8z5fcv(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
