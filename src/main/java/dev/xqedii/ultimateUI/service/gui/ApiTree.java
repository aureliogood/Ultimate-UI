package dev.xqedii.ultimateUI.service.gui;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_n2jcre8;
import dev.xqedii.ultimateUI.gui.parser.TemplateListLayout;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.editor.EditorPagePreferencesPart;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import org.bukkit.entity.Player;

public abstract class ApiTree extends EditorPagePreferencesPart {
   public static final String Xqedii_z423i36az2wl = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public ApiTree(UltimateUI var1, HudService var2, CameraService var3) {
      super(var1, var2, var3);
   }

   public String apiChildPath(String var1, int var2) {
      if (((-581480712 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && !var1.isEmpty() ? Xqedii_2ki4u988lmu5p(var1, var2) : String.valueOf(var2);
      }
   }

   public ApiTree.ApiRawLocation apiLocationOf(String var1) {
      if ((1691767012 ^ 1691767012) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_n2jcre8.Xqedii_etnojfjjhdwd(-388705039, 13)];
         var10001[Xqedii_n2jcre8.Xqedii_jadvr1i8ywgo(-2144423929, 8)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         if (var2.isEmpty()) {
            return null;
         } else {
            String[] var3 = var2.split(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("sRwmMCXn3N2DAlG2f88CSlTPLjMevAQuqfYP0Nzc7Ks="));
            if (var3.length == Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199598780, 5)) {
               int var6 = this.parsePathIndex(var3[Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199598748, 20)]);
               return var6 < 0 ? null : new ApiTree.ApiRawLocation(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ=="), var6);
            } else if (var3.length >= Xqedii_n2jcre8.Xqedii_etnojfjjhdwd(-388737807, 14)
               && Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("MsUqL6tzwJBwKTPRTDqxhKz9ma1AZfA3YnxCE0AGGI6005nR/KUFKS+Py4Q=")
                  .equals(var3[var3.length - Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1200647324, 19)])) {
               int var4 = this.parsePathIndex(var3[var3.length - Xqedii_n2jcre8.Xqedii_etnojfjjhdwd(-388705039, 26)]);
               if (var4 < 0) {
                  return null;
               } else {
                  String var5 = String.join(
                     Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("EbcJcsu+t2+pdDzWnVHwZvO1HZQSAPO7J2xliTjX"),
                     Arrays.copyOfRange(
                        var3, Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199598748, 4), var3.length - Xqedii_n2jcre8.Xqedii_jadvr1i8ywgo(-1308131282, 24)
                     )
                  );
                  return new ApiTree.ApiRawLocation(var5, var4);
               }
            } else {
               return null;
            }
         }
      }
   }

   public String apiFindRawPathById(EditorSession var1, String var2) {
      if ((-1994337810 * -1994337810 - -1994337810 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199597724, 10)];
         var10001[Xqedii_n2jcre8.Xqedii_jadvr1i8ywgo(62920536, 31)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         return var1 != null && var1.rawBlocks != null && !var3.isEmpty()
            ? this.apiFindRawPathById(var1.rawBlocks, Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ=="), var3)
            : Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ==");
      }
   }

   public String apiFindRawPathById(List<?> var1, String var2, String var3) {
      if ((878719609 ^ 878719609) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ==");
      } else {
         for (int var4 = Xqedii_n2jcre8.Xqedii_30vkvass5pe5x(-131964774, 20); var4 < var1.size(); var4++) {
            if (var1.get(var4) instanceof Map var5) {
               String var10 = this.apiChildPath(var2, var4);
               Object var7 = var5.get(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("xR9w+QoE/DV4xKICUyK02KEMqC2B6anA0vd9I0K+7+c="));
               if (var7 != null && var3.equals(var7.toString().trim())) {
                  return var10;
               }

               if (var5.get(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("MsUqL6tzwJBwKTPRTDqxhKz9ma1AZfA3YnxCE0AGGI6005nR/KUFKS+Py4Q=")) instanceof List var8) {
                  String var11 = this.apiFindRawPathById(var8, var10, var3);
                  if (!var11.isEmpty()) {
                     return var11;
                  }
               }
            }
         }

         return Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ==");
      }
   }

   @Override
   public String resolveOpenUiElementTargetPath(EditorSession var1, String var2) {
      if (((-2073940411 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.apiFindRawPathById(var1, var2);
         return var3.isEmpty() ? super.resolveOpenUiElementTargetPath(var1, var2) : var3;
      }
   }

   public List<Object> apiMutableChildList(EditorSession var1, String var2, boolean var3) {
      if ((-1199965553 * (-1199965553 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else if (var2 != null && !var2.isEmpty()) {
         Map var4 = this.resolveRawMapAtPath(var1.rawBlocks, var2);
         if (var4 == null) {
            return null;
         } else {
            Object var5 = var4.get(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("MsUqL6tzwJBwKTPRTDqxhKz9ma1AZfA3YnxCE0AGGI6005nR/KUFKS+Py4Q="));
            if (var5 == null && !var3) {
               return null;
            } else {
               ArrayList var6 = new ArrayList();
               if (var5 instanceof List var7) {
                  var6.addAll(var7);
               }

               var4.put(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("MsUqL6tzwJBwKTPRTDqxhKz9ma1AZfA3YnxCE0AGGI6005nR/KUFKS+Py4Q="), var6);
               return var6;
            }
         }
      } else {
         if (!(var1.rawBlocks instanceof ArrayList)) {
            var1.rawBlocks = new ArrayList<>(var1.rawBlocks == null ? List.of() : var1.rawBlocks);
         }

         return (List) var1.rawBlocks;
      }
   }

   public Map<String, Object> apiRemoveRaw(EditorSession var1, String var2) {
      if (((1362185772 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ApiTree.ApiRawLocation var3 = this.apiLocationOf(var2);
         if (var3 == null) {
            return null;
         } else {
            List var4 = this.apiMutableChildList(var1, var3.containerPath(), (Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199598748, 9) != 0));
            if (var4 != null && var3.index() >= 0 && var3.index() < var4.size()) {
               return var4.remove(var3.index()) instanceof Map var6 ? var6 : null;
            } else {
               return null;
            }
         }
      }
   }

   public boolean apiInsertRaw(EditorSession var1, String var2, int var3, Map<String, Object> var4) {
      if (((1837289649 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         List var5 = this.apiMutableChildList(var1, var2, (Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1191210140, 23) != 0));
         if (var5 != null && var4 != null) {
            int var6 = var3 >= 0 && var3 <= var5.size() ? var3 : var5.size();
            var5.add(var6, var4);
            return (Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199664284, 16) != 0);
         } else {
            return (Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199598748, 24) != 0);
         }
      }
   }

   public String apiAdjustPathAfterRemoval(String var1, ApiTree.ApiRawLocation var2) {
      if (((-847196011 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty() && var2 != null) {
         String var3 = var2.containerPath().isEmpty()
            ? Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ==")
            : Xqedii_8u2tdfm5k01h(var2.containerPath());
         if (!var1.startsWith(var3)) {
            return var1;
         } else {
            String var4 = var1.substring(var3.length());
            int var5 = var4.indexOf(Xqedii_n2jcre8.Xqedii_jadvr1i8ywgo(2015232186, 26));
            String var6 = var5 < 0 ? var4 : var4.substring(Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199598748, 0), var5);
            int var7 = this.parsePathIndex(var6);
            return var7 >= 0 && var7 > var2.index()
               ? Xqedii_1me49uce8wt80(
                  var3,
                  var7 - Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199590556, 13),
                  var5 < 0 ? Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ==") : var4.substring(var5)
               )
               : var1;
         }
      } else {
         return var1;
      }
   }

   public String apiContainerPath(EditorSession var1, String var2) {
      if ((-1710825361 * -1710825361 + -1710825361 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_n2jcre8.Xqedii_jadvr1i8ywgo(-1072211837, 7)];
         var10001[Xqedii_n2jcre8.Xqedii_etnojfjjhdwd(388705038, 3)] = var2;
         String var3 = this.firstNonBlank(var10001).trim();
         if (var3.isEmpty()) {
            return Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ==");
         } else {
            String var4 = this.resolveOpenUiElementTargetPath(var1, var3);
            return !var4.isBlank() && this.resolveRawMapAtPath(var1.rawBlocks, var4) != null ? var4 : null;
         }
      }
   }

   public double[] apiAbsolutePosition(EditorSession var1, String var2) {
      if ((1611938079 * 1611938079 + 1611938079 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty()) {
         List var3 = var1.renderBlocks;
         if (var3 == null) {
            return null;
         } else {
            for (Map var5 : (Iterable<Map>) (var3)) {

               if (var5 != null
                  && var2.equals(
                     String.valueOf(
                        var5.get(
                           Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("LdCpU14BQzsKqzSv3P9YVd49zuywSwRbZqQ+uRkdKa8PDiMEdP41o9KU4AyEB3qfpwpSp04B6ZyQIhsuz1avdEVn")
                        )
                     )
                  )) {
                  double var6 = this.parseDouble(
                     this.readMapPathValue(var5, Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("2fFZ7dwyeWV4T/b39E8raGKpdrnPzZ/qIRvNCaOIvnhohlItdv1iF4yKz3ensIUq")),
                     this.parseDouble(
                        var5.get(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("cbLkMXTNTlMF53vz2o3zhCRBlzdUGPn4gRvDpOCm")),
                        Double.longBitsToDouble(Xqedii_n2jcre8.Xqedii_12stkspf5776q(-7430824664880597660L, 62))
                     )
                  );
                  double var8 = this.parseDouble(
                     this.readMapPathValue(var5, Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("9s30Je/AWnuJ9S9hQsrAw63BOwF6fAAbXeDhdD6TXWL5MHIMFlzHGF2Dw7viO2ka")),
                     this.parseDouble(
                        var5.get(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("IEl+zA3FmAh6SOlQNpSqMfO3OxzIsvRoXmma5u+U")),
                        Double.longBitsToDouble(Xqedii_n2jcre8.Xqedii_1qbs06of1j060(-957325987086515704L, 16))
                     )
                  );
                  if (Double.isFinite(var6) && Double.isFinite(var8)) {
                     double[] var10 = new double[Xqedii_n2jcre8.Xqedii_etnojfjjhdwd(1758778609, 31)];
                     var10[Xqedii_n2jcre8.Xqedii_etnojfjjhdwd(388705038, 29)] = var6;
                     var10[Xqedii_n2jcre8.Xqedii_jadvr1i8ywgo(97919216, 13)] = var8;
                     return var10;
                  }
               }
            }

            return null;
         }
      } else {
         double[] var10000 = new double[Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199602844, 11)];
         var10000[Xqedii_n2jcre8.Xqedii_30vkvass5pe5x(162497062, 8)] = Double.longBitsToDouble(Xqedii_n2jcre8.Xqedii_1noec345lxn3l(1158250189378447308L, 24));
         var10000[Xqedii_n2jcre8.Xqedii_30vkvass5pe5x(1276337926, 1)] = Double.longBitsToDouble(Xqedii_n2jcre8.Xqedii_1qbs06of1j060(-8918062150852846224L, 6));
         return var10000;
      }
   }

   public void apiWritePosition(Map<String, Object> var1, double var2, double var4) {
      if (((-49471048 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (var1.containsKey(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("cbLkMXTNTlMF53vz2o3zhCRBlzdUGPn4gRvDpOCm"))
            && !var1.containsKey(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("mHqugYfFIHhV54EfkK9/Q4a5VdjGK8ZuE+BDdXsbeybSuKVHgb6CuK8KhMo="))) {
            var1.put(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("cbLkMXTNTlMF53vz2o3zhCRBlzdUGPn4gRvDpOCm"), var2);
            var1.put(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("IEl+zA3FmAh6SOlQNpSqMfO3OxzIsvRoXmma5u+U"), var4);
         } else {
            this.setMapPathValue(var1, Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("2fFZ7dwyeWV4T/b39E8raGKpdrnPzZ/qIRvNCaOIvnhohlItdv1iF4yKz3ensIUq"), var2);
            this.setMapPathValue(var1, Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("9s30Je/AWnuJ9S9hQsrAw63BOwF6fAAbXeDhdD6TXWL5MHIMFlzHGF2Dw7viO2ka"), var4);
         }
      }
   }

   public boolean apiIsListLayoutContainer(EditorSession var1, String var2) {
      if ((357755372 * 357755372 - 357755372 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && var2 != null && !var2.isEmpty() && TemplateListLayout.hasListLayout(this.resolveRawMapAtPath(var1.rawBlocks, var2));
      }
   }

   public boolean apiIsInListLayout(EditorSession var1, String var2) {
      if ((1477591454 * 1477591454 + 1477591454 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ApiTree.ApiRawLocation var3 = this.apiLocationOf(var2);
         return ((var3 != null && this.apiIsListLayoutContainer(var1, var3.containerPath())
            ? Xqedii_n2jcre8.Xqedii_30vkvass5pe5x(904946881, 13)
            : Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1199598748, 2)) != 0);
      }
   }

   public String apiIdAtPath(EditorSession var1, String var2) {
      if ((-1670915111 * (-1670915111 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 != null && !var2.isEmpty()) {
         Map var3 = this.resolveRawMapAtPath(var1.rawBlocks, var2);
         Object var4 = var3 == null ? null : var3.get(Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("xR9w+QoE/DV4xKICUyK02KEMqC2B6anA0vd9I0K+7+c="));
         return var4 != null && !var4.toString().isBlank() ? var4.toString().trim() : var2;
      } else {
         return Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ==");
      }
   }

   public String apiListContainerIdOf(EditorSession var1, String var2) {
      if ((-1731273397 * -1731273397 - -1731273397 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.resolveOpenUiElementTargetPath(var1, var2);

         while (var3 != null && !var3.isEmpty()) {
            if (this.apiIsListLayoutContainer(var1, var3)) {
               return this.apiIdAtPath(var1, var3);
            }

            ApiTree.ApiRawLocation var4 = this.apiLocationOf(var3);
            var3 = var4 == null ? null : var4.containerPath();
         }

         return Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ==");
      }
   }

   public Object apiDeepCopy(Object var1) {
      if (((-95565276 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof Map var6) {
         LinkedHashMap var7 = new LinkedHashMap();

         for (Entry var9 : (Iterable<Entry>) (var6.entrySet())) {

            var7.put(String.valueOf(var9.getKey()), this.apiDeepCopy(var9.getValue()));
         }

         return var7;
      } else if (!(var1 instanceof List var2)) {
         return var1;
      } else {
         ArrayList var3 = new ArrayList(var2.size());

         for (Object var5 : var2) {
            var3.add(this.apiDeepCopy(var5));
         }

         return var3;
      }
   }

   public void apiRebuild(Player var1, EditorSession var2) {
      if ((-2052313252 * (-2052313252 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         this.renderPage(var1, var2, (Xqedii_n2jcre8.Xqedii_1r8xnv0vbutuq(-1166044316, 25) != 0));
      }
   }

   @Override
   public boolean applyOpenUiElementMutation(Player var1, String var2, BiFunction<EditorSession, Map<String, Object>, Boolean> var3) {
      if ((1770305126 ^ 1770305126) != 0) {
         throw new IllegalStateException();
      } else {
         EditorSession var4 = var1 == null ? null : this.editorSessions.get(var1.getUniqueId());
         String var10000;
         if (var4 == null) {
            var10000 = Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("iv9VZO6Za2bEGWQpLaeNAPL6JK46NdyXklaFKQ==");
         } else {
            String[] var10003 = new String[Xqedii_n2jcre8.Xqedii_jadvr1i8ywgo(391676864, 15)];
            var10003[Xqedii_n2jcre8.Xqedii_etnojfjjhdwd(388705038, 0)] = var2;
            var10000 = this.resolveOpenUiElementTargetPath(var4, this.firstNonBlank(var10003).trim());
         }

         String var5 = var10000;
         boolean var6 = this.isApiHudSneakShifted(var4);
         if (var6) {
            this.applyRuntimeHudSneakVisualOffset(var1, var4, Double.longBitsToDouble(Xqedii_n2jcre8.Xqedii_9ghvb8qzudj7(-3650378876173032072L, 47)));
         }

         boolean var7 = super.applyOpenUiElementMutation(var1, var2, var3);
         if (var7 && var4 != null && !var5.isBlank() && (this.apiIsListLayoutContainer(var4, var5) || this.apiIsInListLayout(var4, var5))) {
            this.apiRebuild(var1, var4);
         }

         if (var4 != null && this.editorSessions.get(var1.getUniqueId()) == var4) {
            if (var6) {
               this.syncRuntimeHudSneakVisualOffset(var1, var4);
            }

            if (var7) {
               this.scheduleHudTextPlaceholderRefresh(var1, var4);
            }
         }

         return var7;
      }
   }

   public boolean isApiHudSneakShifted(EditorSession var1) {
      if ((1161069325 * 1161069325 + 1161069325 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null
               && var1.hudTextOnlyMode
               && !var1.editMode
               && Double.isFinite(var1.runtimeHudSneakVisualOffsetY)
               && Math.abs(var1.runtimeHudSneakVisualOffsetY) > Double.longBitsToDouble(Xqedii_n2jcre8.Xqedii_12stkspf5776q(8914828086406690361L, 20))
            ? Xqedii_n2jcre8.Xqedii_jadvr1i8ywgo(-2144423673, 8)
            : Xqedii_n2jcre8.Xqedii_etnojfjjhdwd(388705038, 17)) != 0);
      }
   }

   @Override
   public void renderPage(Player var1, EditorSession var2, boolean var3) {
      if (((-766441608 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (this.isApiHudSneakShifted(var2)) {
            var2.runtimeHudSneakVisualOffsetY = Double.longBitsToDouble(Xqedii_n2jcre8.Xqedii_12stkspf5776q(4382192426004695310L, 7));
         }

         super.renderPage(var1, var2, var3);
      }
   }

   public record ApiRawLocation(String containerPath, int index) {
      public static final String Xqedii_iy0l4k1lvy3u = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

      @Override

      public int index() {
         if ((1348236445 * 1348236445 + 1348236445 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.index;
         }
      }
   }

   private static /* synthetic */ String Xqedii_2ki4u988lmu5p(String string, int n) {
        return string + Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("UwDiycPyh7LPCYP2G1nvvtildeis6Y5M4aIOxQPBXJlaJ03e4PwuqWNPkznO/T66") + n;
    }

    private static /* synthetic */ String Xqedii_8u2tdfm5k01h(String string) {
        return string + Xqedii_n2jcre8.Xqedii_2rjhj38xw8cit("UwDiycPyh7LPCYP2G1nvvtildeis6Y5M4aIOxQPBXJlaJ03e4PwuqWNPkznO/T66");
    }

    private static /* synthetic */ String Xqedii_1me49uce8wt80(String string, int n, String string2) {
        return string + n + string2;
    }
}
