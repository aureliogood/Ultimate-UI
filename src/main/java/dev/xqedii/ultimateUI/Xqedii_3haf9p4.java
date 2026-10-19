package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3haf9p4 {
   private static final ConcurrentHashMap<String, String> Xqedii_17i9p2nhefa8z = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1g3187d17u7ww = 727551001;
   private static volatile int Xqedii_1ubcah4wqoem1 = 1903488826;
   private static volatile int Xqedii_2a9obg1zf5y2p = -427515215;
   private static volatile int Xqedii_1xmbqg851awcf = 1223337432;
   private static volatile long Xqedii_3gjtzwk0rzx4w = -8500042895441449176L;
   private static volatile long Xqedii_246hsxr5f7ofd = -6066371203386586087L;
   private static volatile long Xqedii_11f5ki1r8uf9l = 3457277946845539356L;
   private static volatile long Xqedii_3m7z3s5o0sbrx = 1259272520877569306L;

   public static int Xqedii_1t7xm81ghd3cd(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1g3187d17u7ww, var1);
   }

   public static int Xqedii_2g310higpq3g1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1ubcah4wqoem1;
   }

   public static int Xqedii_9f52ve9i6ltc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2a9obg1zf5y2p;
   }

   public static int Xqedii_2npqjmt4ixqoz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1xmbqg851awcf, var1);
   }

   public static long Xqedii_hl1ng65aiho3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3gjtzwk0rzx4w, var2);
   }

   public static long Xqedii_376773pu63nfx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_246hsxr5f7ofd;
   }

   public static long Xqedii_1ahuy6g479s55(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_11f5ki1r8uf9l;
   }

   public static long Xqedii_1hig1w0l6us40(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3m7z3s5o0sbrx, var2);
   }

   public static String Xqedii_3dmb1zi443qv5(String var0) {
      String var1 = Xqedii_17i9p2nhefa8z.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("vu1ymQQ4N2lJz63Ht2TWQe28YdThhQ4KU59YWgT9boM=");
            int var3 = 980387268;

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
            String var9 = Xqedii_17i9p2nhefa8z.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3e0u58752yya4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3sysp002j1ee() {
   }

   private static int Xqedii_2qvbfyfdc5fbg(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2exvihre681b9(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
