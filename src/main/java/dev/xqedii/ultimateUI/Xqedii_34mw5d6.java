package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_34mw5d6 {
   private static final ConcurrentHashMap<String, String> Xqedii_36x7b8s8md13v = new ConcurrentHashMap<>();
   private static volatile int Xqedii_11gh2p9c2tgo7 = 465194344;
   private static volatile int Xqedii_1n8u18dpu29rp = 1125712721;
   private static volatile int Xqedii_1wjs6zabhyjni = -169074438;
   private static volatile int Xqedii_1i4qvn322iw16 = 482565947;
   private static volatile long Xqedii_w2hn9pjha6uz = 6802554591994494114L;
   private static volatile long Xqedii_71gk3nvbzrnw = 7379525932752598355L;
   private static volatile long Xqedii_kpa8aeslz6qu = 6624045036996833128L;
   private static volatile long Xqedii_2wegccavxjijt = 8419567395592779626L;

   public static int Xqedii_24zlb1agnmsa0(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_11gh2p9c2tgo7, var1);
   }

   public static int Xqedii_215580gc0bnwn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1n8u18dpu29rp;
   }

   public static int Xqedii_1weq4idkqkpsw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1wjs6zabhyjni;
   }

   public static int Xqedii_3sfnst2l1vsup(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1i4qvn322iw16, var1);
   }

   public static long Xqedii_26wkwgz2nllzt(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_w2hn9pjha6uz, var2);
   }

   public static long Xqedii_3rqhs0jokj6d4(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_71gk3nvbzrnw;
   }

   public static long Xqedii_3kspp3oppoii9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_kpa8aeslz6qu;
   }

   public static long Xqedii_2dykdlhvf57wf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2wegccavxjijt, var2);
   }

   public static String Xqedii_16dik2576ezuh(String var0) {
      String var1 = Xqedii_36x7b8s8md13v.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("7SkX9uEJIYhbHnBydAxePcc6txu71nKDlaXIkEa1k5I=");
            int var3 = -353893797;

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
            String var9 = Xqedii_36x7b8s8md13v.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1a58jymkbov77() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2rzu4vgjfbazu() {
   }

   private static int Xqedii_38t3kpqibh8za(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_23wmqixoqb6g(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
